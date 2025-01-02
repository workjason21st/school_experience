import cv2
import numpy as np
import matplotlib.pyplot as plt

#讀取影片
video = cv2.VideoCapture('video.mp4')

#設定要取用的y軸高度
y_height1 = 300
y_height2 = 1000
#儲存不同高度的像素列表
frames1 = []
frames2 = []

while video.isOpened():
    #讀取每一幀
    ret, frame = video.read()
    if not ret:
        break
    #提取特定y軸高度的像素
    y1_slice = frame[y_height1, :, :]
    y2_slice = frame[y_height2, :, :]
    #增加到各自的列表中
    frames1.append(y1_slice)
    frames2.append(y2_slice)
video.release()

#將提取的列表轉換為時間&空間切片
temporal_slice1 = np.stack(frames1, axis=0)
temporal_slice2 = np.stack(frames2, axis=0)

#顯示時間&空間切片
plt.subplot(211)
plt.title('y = {}'.format(y_height1))
plt.imshow(temporal_slice1)
plt.xlabel('X'), plt.ylabel('T')

plt.subplot(212)
plt.title('y = {}'.format(y_height2))
plt.imshow(temporal_slice2)
plt.xlabel('X'), plt.ylabel('T')
plt.show()