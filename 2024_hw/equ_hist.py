import cv2
import numpy as np
import matplotlib.pyplot as plt

img = cv2.imread('pout.tif')
#圖像轉灰階
img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

#直方圖均化
#ori_img = cv2.calcHist([img],[0],None,[256],[0,256])
equ_img = cv2.equalizeHist(img)

#輸出圖像
cv2.imshow('ori_img', img)
cv2.imshow('equ_img', equ_img)

#繪製直方圖並輸出
ori_hist = plt.hist(img.ravel(),256,[0,256])
plt.figure()
equ_hist = plt.hist(equ_img.ravel(),256,[0,256])
plt.show()

cv2.waitKey(0)
cv2.destroyAllWindows()