
public class Test {
  public static void main(String[] args) {
    Integer a = new Integer(5);
    Integer b = new Integer(5);
    Integer bb = new Integer(128);

    Integer c = 5;
    Integer d = 5;

    Integer e = 128;
    Integer f = 128;

    int g = 128;
    int h = 5;

    System.out.println(a == b); // 地址比较, new的时候产生了不同的对象, false
    System.out.println(b == c); // 也是地址比较, b是一个对象, 但是c是一个常量, false
    System.out.println(c == d); // 地址比较, 都是常量 10, true
    System.out.println(e == f); // -128~127的值都是从缓存中获取, 大于128就需要new, 所以Integer e = new Integer(128); false
    System.out.println(f == g); // 通过上面的解释得到: f 是 new Integer(128), 先进行拆箱为int, 再和 g 比较, true
    System.out.println(bb == g); // bb是 new Integer(128), 先进行拆箱为int, 再和 g 比较, true
    System.out.println(c == h); // c 是 integer类型, h 是int类型, c先拆箱再比较, true
  }
}

/**
 * 知识点1: Java的引用类型的值(即对象)存储在堆中, 变量名和基本类型的值存储在栈中. 这与JS的存储一致.
 * 知识点2: Java 自动装箱, 拆箱: 发生在运算操作和比较操作中.
 * 知识点3: Java 的 new(即开启一个新的堆空间)都会占用大量的资源, 所以Java规定了-128~127都会指向常量池中的缓存地址, 不会new.所以 上述的 c == d 为true, 如果大于了127就会使用new, 导致 e 和 f都会在堆中开辟新的空间使其不一致.
 */

// 

// 参考: https://blog.csdn.net/weixin_43849277/article/details/108275997

// 拆装箱参考: https://www.cnblogs.com/dolphin0520/p/3780005.html