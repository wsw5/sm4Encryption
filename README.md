# sm4Encryption
SMS4算法是在国内广泛使用的WAPI无线网络标准中使用的加密算法，是一种32轮的迭代非平衡Feistel结构的分组加密算法，其密钥长度和分组长度均为128。SMS4算法的加解密过程中使用的算法是完全相同的，唯一不同点在于该算法的解密密钥是由它的加密密钥进行逆序变换后得到的。
# SM4算法的原理
![image](https://user-images.githubusercontent.com/58759391/143515018-83719f56-87ff-4505-a15a-7ff1c9718d56.png)

明文加上128bit的秘钥，进过多轮变换，最后输出是加密的反序，解密时只是将轮密钥的使用顺序进行逆向进行。
# SM4加密算法应用场景
SM4常用于政府系统的数据传输加密，我们使用前端向后端传递信息，或者分布式场景下不同模块之间的调用，可以使用此算法。对参数的数据进行加密，然后后台对加密的数据进行解密再存储到数据库中，保证数据传输过程中，不受泄露。
# 加密模式
![image](https://user-images.githubusercontent.com/58759391/143515075-a50ceca9-845d-44b7-9c39-c43578bda90f.png)

可提供后端java加密文件与前端js加密文件。
