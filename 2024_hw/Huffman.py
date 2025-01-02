#!/usr/bin/env python
# coding: utf-8

# In[2]:


from collections import Counter

#定義節點
class Node:
    def __init__(self, value, freq):
        self.value = value # 字元數值
        self.freq = freq # 頻率次數
        self.left = None
        self.right = None

#計算字元出現頻率
#使用Counter計算每個字元在整個字串裡的頻率次數
def calc_frequency(text):
    frequency = Counter(text)
    return frequency

#建造huffman樹
def build_huffman_tree(frequency):
    #將每個字元及其頻率轉換為節點
    nodes = [Node(char, freq) for char, freq in frequency.items()]
    while len(nodes) > 1:
        #依照頻率排序節點
        nodes = sorted(nodes, key=lambda x: x.freq)
        left = nodes.pop(0) # 取出頻率最小的節點來做左子節點
        right = nodes.pop(0) # 取出頻率第二小的節點來做右子節點
        
        #創建一個新的父節點
        #頻率為兩個子節點頻率之和
        parent = Node(None, left.freq + right.freq)
        parent.left = left
        parent.right = right
        nodes.append(parent) # 將此父節點加到樹中
        
    return nodes[0]

#建構huffman編碼
def build_huffman_codes(root, code="", codes={}):
    #空節點就返回
    if root is None:
        return
    
    #將子節點的數值及其編碼添加到字典中
    if root.value is not None:
        codes[root.value] = code
    
    #遞迴處理左右子節點的編碼
    build_huffman_codes(root.left, code + "0", codes)
    build_huffman_codes(root.right, code + "1", codes)
    
    return codes

#將每個字元編碼並壓縮成新的字串huffman編碼
def encode(text, codes):
    #將每個字元轉換成對應的huffman編碼
    encoded_text = "".join([codes[char] for char in text])
    return encoded_text

#解壓縮字串
def decode(encoded_text, root):
    decoded_text = ""
    current_node = root # 從根節點開始
    index = 0
    
    #遍歷整個字串
    while index < len(encoded_text):
        if encoded_text[index] == "0":
            current_node = current_node.left # (=0)移動到左子節點
        else:
            current_node = current_node.right # (=1)移動到左子節點
        
        #如果到達子節點，將子節點的值添加到解碼字串中
        if current_node.value is not None:
            decoded_text += current_node.value
            current_node = root # 重置為根
        
        index += 1
        
    return decoded_text

#題目
text = "DACBDCDBDCDCD"
#用題目字串計算頻率次數
frequency = calc_frequency(text)
#用頻率次數來建造huffman樹
huffman_tree = build_huffman_tree(frequency)
#用huffman樹來建構huffman編碼
huffman_codes = build_huffman_codes(huffman_tree)
#編碼 解碼
encoded_text = encode(text, huffman_codes)
decoded_text = decode(encoded_text, huffman_tree)

#輸出
print("題目:", text)
print("經過Huffman Code壓縮後:", encoded_text)
print("再經過Huffman Code解壓縮後:", decoded_text)

