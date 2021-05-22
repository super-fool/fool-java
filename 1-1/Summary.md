JRE: Java Runtime Environment: 运行环境, 即不同的CPU类型有着相应的JRE, 可以将代码编译成**字节码**
JDK: Java Development Kit: 开发工具

JDK包含了JRE,还包含了编译器IDE, 调试器等开发工具.

Java三个版本:
- Java EE: enterprise edition 
- Java SE: standard edition
- Java ME: micro editionf

Java 属于解释型语言, 与Python, JavaScript, Ruby, PHP一样.

javac: java的编译器, 将.java文件编译成字节码文件(.class文件);
jar: 将一组字节码文件打包成.jar文件, 便于发布;
javadoc: 将注释提取, 生成doc;
jdb: java调试器, 用于开发阶段的运行调试;
jvm: java虚拟机, cli中输入java Hello, 代表着使用jvm执行Hello的字节码文件(.class文件);

文件名必须是内部定义的类名.

Java 是面向对象的语言, 并且是**基于类**的面向对象. 而JavaScript既可以是基于类的,也可以是基于原型的.

## 基本类型
- 整数类型: byte, short, int, long
- 浮点数类型: float, double
- 字符类型: char
- 布尔类型: boolean

byte: 字节, 是计算机中最小的存储单位. 1byte = 8bit, bit是一个二进制数, 0 或 1.

内存可以分为多个内存单元, 每个单元有着自己的内存地址; 单元就是房子, 地址就是门牌号;

不同的数据类型占据着不同的内存单元: byte(1) < short(2) = char(2) < int(4) = float(4) < long(8) = double(8)

> `Integer(128) == Integer(128) // false` 参考: https://github.com/super-fool/fool-java/blob/master/1-1/Test.java

> JS中, 默认使用的float类型

引用类型就是除了基本类型外的类型, 比如`String`

> JS中, string属于基本类型.

字符类型: 可以表示一个Unicode字符: `char zh = '中'`

### 整数

几乎所有的语言中, 不同类型的整数都有着各自的边界范围. 如果超出了边界, 就会产生**溢出**

```java
var max = Integer.MAX_VALUE;
var min = Integer.MAX_VALUE - 10; 
var mid = (max + min) / 2;
System.out.printLn("中间值: " + mid); // ????
```

上面的打印输出就很奇怪啦, 原因就是因为`max + min`超出了类型的精度范围就会**精度损失**, 解决办法可以用以下代码:

```java
var mid = min + (max - min) / 2;
```

var 关键字: 与JS一样, 都是利用编译器自动推断变量类型

#### 自增/自减

与JS一样的!

- `n++`: 先引用,再加一
- `++n`: 先加一,再引用
  
#### 移位运算

与JS一样的~

- `>>`: `8>>1`代表着8的二进制向右移动一位. 其实就是`8/2`; `8>>2 === 8/2/2`; `9>>2 === Math.floor(9/2/2)
- `<<`: 自己猜吧~

#### 位运算

JS一样~

```java
// 与运算
1 & 1 // 1
0 & 0 // 0
1 & 0 // 0 
0 & 1 // 0

// 或运算
1 | 1 // 1
1 | 0 // 1
0 | 1 // 1 
0 | 0 // 0


var i = 167776589;
var n = 167776512;
System.out.printLn(i & n); // return n; 将两个数转为二进制进行与运算.
```