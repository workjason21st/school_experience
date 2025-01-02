import cv2
import numpy as np

img = cv2.imread('lenna.jpg')
#圖像轉灰階
img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
#偵測水平和垂直邊緣
grad_X = cv2.Sobel(img, -1, 1, 0)
grad_Y = cv2.Sobel(img, -1, 0, 1)
#設定閾值去除雜訊
ret, grad_X = cv2.threshold(grad_X, 70, 255, cv2.THRESH_TOZERO)
ret, grad_Y = cv2.threshold(grad_Y, 70, 255, cv2.THRESH_TOZERO)
grad = np.sqrt(grad_X^2 + grad_Y^2)
output = (grad * 255 / grad.max()).astype(np.uint8)
#輸出及儲存
cv2.imshow('image', output)
cv2.imwrite('output.jpg', output)
cv2.waitKey(0)
cv2.destroyAllWindows()