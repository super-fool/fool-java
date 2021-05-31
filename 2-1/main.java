import javax.swing.plaf.TreeUI;

/**
 * switch
 * 1. case 只能是匹配结果, 无法与JS一样可以写一个表达式
 */

public class Main {
  public static void main(String[] args) {
    // Java12升级: 使用 -> 代替 break;
    var check = 60;
    switch (check) {
      case 50 -> System.out.println("true");
      case 60 -> System.out.println("false");
      default -> {
        check = 50;
        System.out.println("false");
      }
    }

    // 新语法: 返回值
    var ret = switch (check) {
      case 50 -> 1;
      case 60 -> { // 多行语句中, 可以使用yield关键字返回.
        var mid = 60;
        yield mid;
      } // 这里不需要使用分号.
      default -> 3;
    }; // 这里注意赋值要以;结尾.
  }
}