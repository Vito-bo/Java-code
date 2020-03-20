//5.5
package homework.java;
public class Test1 {
    public static void main (String args[]) {
        //输出第一个
        System.out.println("Kilogram       Pound");
        for (int i = 1; i <= 199; i = i + 2) {
            System.out.printf("%d            %.1f\n",i, i * 2.2);
        }
        //输出第二个
        float a = 9.09f;
        System.out.println("Kilogram       Pound");
        for (int j = 20; j <= 515; j = j + 5) {
            System.out.printf("%d            %.2f\n",j, a);
            a += 2.27;
        }
    }
}


5.11：
package homework.java;

public class Test2 {
    public static void main (String args[]) {
        //遍历100至1000数字
        for (int n = 100; n <= 1000; n++) {
            boolean a = n % 5 == 0;
            boolean b = n % 6 == 0;
            //判断是否只能被5或6一个整除
            if ((!a && b) || (a && !b)) {
                System.out.printf("%d ",n);
            }
        }
    }
}

6.2：
package homework.java;
public class Test3 {
    public static void main (String args[]) {
        //创建Test3类对象
        Test3 test3 = new Test3();
        //调用用户自定义子方法
        test3.hello();
    }
    //编写用户子函数，功能为输出hello,world!
    public static void hello() {
        System.out.printf("hello,world!");
    }
}

6.10：
package homework.java;
public class Test4 {
    public static void main (String args[]) {
        //创建Test4类对象
        Test4 test4 = new Test4();
        System.out.println(test4.method(12,25.7));
    }
    //找到比i小的数值
    public static double method (double i, double j) {
        //若i > j 直接返回j
        //否则j做自减运算，直到第一次找到比i小的值
        while (i < j) {
            j--;
        }
        return j ;
    }
}
