练习题：字符串处理
import java.util.Scanner;
public class StringUtil {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String a=in.nextLine();
        //获取String值
        StringBuilder stringBuilder = new StringBuilder(a);//用StringBuilder比String好用，操作性更强
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i)==' ') {
                stringBuilder.deleteCharAt(i);
                i--;
            }else {
                stringBuilder.charAt(i);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}

练习题：对比字符串
import java.util.Scanner;
public class ContrastString{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        String c = "不同";
        if (a.length() == b.length()){
            for (int i = 0;i <= a.length()-1; i++){
                if(a.charAt(i) == b.charAt(i)){
                    c = "相同";
                }else{
                    c = "不同";
                    break;
                }
            }
        }
        else{
            c = "不同";
        }
        System.out.println(c);
    }
}
在/home/project/目录下新建一个源代码文件PrintWeek.java。
实验代码：
import java.util.Scanner;
public class PrintWeek{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //获取int值
        int x = in.nextInt();
        switch(x){
        case 1:
            System.out.println("今天是星期一");
            break;
        case 2:
            System.out.println("今天是星期二"); 
            break;   
        case 3:
            System.out.println("今天是星期三");
            break;
        case 4:
            System.out.println("今天是星期四");
            break;
        case 5:
            System.out.println("今天是星期五");
            break;
        case 6:
            System.out.println("今天是星期六");
            break;
        case 7:
            System.out.println("今天是星期七");
            break;
        default:
            break;    
        }    
    }
}
练习题：数组应用

实验代码：
public class AverageScore{
    public static void main(String[] args){
        int[] a = {61,57,95,85,75,65,44,66,90,32};
        int sum=0;
        int i=1;
        for(int A:a){
            sum+=A;
            i++;
        }
        int AverageScore = sum/a.length;
        System.out.println("平均成绩为："+ AverageScore);
    }
}
练习题：用户输入
实验代码：
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        String[] data = new String[100];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            if ((data[i] = in.nextLine()).equals("end")) {
                break;
            }
        }
        for (String a : data) {
            if (a.equals("end")) {
                break;
            }
            System.out.println(a);
        }
    }
}

练习题：最大最小值
import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] data = {313, 89, 123, 323, 313, 15, 90, 56, 39};
        //    方法1
        int max = data[0];
        int min = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

