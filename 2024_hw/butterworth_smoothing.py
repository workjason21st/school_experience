import cv2
import numpy as np
import matplotlib.pyplot as plt

#讀取圖像並轉灰階
img = cv2.imread('lenna.jpg')
img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
#將圖像進行傅立葉轉換
dft = np.fft.fft2(img)
dft_shift = np.fft.fftshift(dft)

#定義Butterworth低濾波器來使平滑化
def filter(shape, D0, n):
    M, N = shape
    H = np.zeros((M, N), dtype=np.float32)
    for u in range(M):
        for v in range(N):
            #代入公式
            D_uv = np.sqrt((u - M/2)**2 + (v - N/2)**2)
            H[u, v] = 1 / (1 + (D_uv / D0)**(2*n))
    return H

#執行頻率域處理
def apply_filter(dft_shift, H):
    filtered_dft_shift = dft_shift * H
    #反轉換
    inverse_dft_shift = np.fft.ifftshift(filtered_dft_shift)
    img_filtered = np.fft.ifft2(inverse_dft_shift)
    img_filtered = np.abs(img_filtered)
    return img_filtered

#設置參數並執行頻率域處理
D0_values = [50, 100, 150]
n = 2

for i, D0 in enumerate(D0_values):
    #根據不同截上半徑取得不同濾波器
    H = filter(img.shape, D0, n)
    #進行濾波處理並反轉換為影像
    img_filtered = apply_filter(dft_shift, H)
    
    #顯示處理後圖像
    plt.subplot(2, 3, i+4)
    plt.imshow(img_filtered, cmap='gray')
    plt.title(f'D0={D0}, n={n}')
    plt.axis('off')

#顯示原圖
plt.subplot(231)
plt.imshow(img, cmap='gray')
plt.title('Input')
plt.axis('off')

plt.show()
