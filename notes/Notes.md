# Notes

1.java类加载过程

`.java`文件首先需要经过Javac编译为`.class`字节码文件

jvm虚拟机通过将字节码中的信息载入内存，并进行符号解析，初始化完成类加载。

加载阶段可以划分为: 

加载->链接(验证->准备->解析)->初始化

