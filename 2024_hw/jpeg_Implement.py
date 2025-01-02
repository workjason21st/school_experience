import cv2
import numpy as np
import matplotlib.pyplot as plt

img = cv2.imread('lenna.jpg')
#圖像轉灰階/轉化格式
img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
quantized_blocks = []

#分割成8x8和進行DCT量化
def dct(img, Qt):
    h,w=img.shape
    for i in range(h//8):
        for j in range(w//8):
            block = np.float32(img[i*8 : (i+1)*8, j*8 : (j+1)*8]) - 128
            #DCT
            dct_block = cv2.dct(block)
            #量化
            quantized_block = np.round(dct_block / Qt)
            quantized_blocks.append(quantized_block)
    return quantized_blocks

#進行逆量化和IDCT
def idct(img, Qt, quantized_blocks):
    h,w=img.shape
    re_img = np.zeros_like(img, dtype=np.float32)
    ideex = 0
    for i in range(h//8):
        for j in range(w//8):
            #逆量化
            dequantized_block = quantized_blocks[ideex] * Qt
            #IDCT
            idct_block = cv2.idct(dequantized_block)
            re_img[i*8 : (i+1)*8, j*8 : (j+1)*8] = idct_block
            ideex += 1
    return re_img

#設定範例值
Qt1 = np.array([[16, 11, 10, 16, 24, 40, 51, 61],
                    [12, 12, 14, 19, 26, 58, 60, 55],
                    [14, 13, 16, 24, 40, 57, 69, 56],
                    [14, 17, 22, 29, 51, 87, 80, 62],
                    [18, 22, 37, 56, 68, 109, 103, 77],
                    [24, 35, 55, 64, 81, 104, 113, 92],
                    [49, 64, 78, 87, 103, 121, 120, 101],
                    [72, 92, 95, 98, 112, 100, 103, 99]], dtype=np.uint8)
Qt2 = np.array([[ 6,  4,  4,  6, 10, 16, 20, 24],
                [ 5,  5,  6,  8, 10, 23, 24, 22],
                [ 6,  5,  6, 10, 16, 23, 28, 22],
                [ 6,  7,  9, 12, 20, 35, 32, 25],
                [ 7,  9, 15, 22, 27, 44, 41, 31],
                [10, 14, 22, 26, 32, 42, 45, 37],
                [20, 26, 31, 35, 41, 48, 48, 40],
                [29, 37, 38, 39, 45, 40, 41, 40]], dtype=np.uint8)
#執行
quantized_blocks1 = dct(img, Qt1)
re_img1 = idct(img, Qt1, quantized_blocks1)
quantized_blocks2 = dct(img, Qt2)
re_img2 = idct(img, Qt2, quantized_blocks2)

# 顯示原始圖像和重建圖像
plt.subplot(231)
plt.imshow(img, cmap='gray'), plt.title('Input')
plt.subplot(235)
plt.imshow(re_img1, cmap='gray'), plt.title('Output(QF=50)')
plt.subplot(236)
plt.imshow(re_img2, cmap='gray'), plt.title('Output2(QF=80)')
plt.show()
