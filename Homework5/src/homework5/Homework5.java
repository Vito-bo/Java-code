//7.1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the number of students: ");
       int number = input.nextInt();//输入学生总数
        //以此输入学生分数
        System.out.print("Enter " + number + " scores:");
        int[] arr = new int[number];
        int best = 0;//统计分数的最大值
        for(int i = 0; i < number; i++){
            arr[i] = input.nextInt();
            if(best < arr[i])
                best = arr[i];
        }
        
        for(int i = 0; i < number; i++){
            System.out.println("Student " + i + " scores is " + arr[i] +
                    " and grade is " + GetGeade(best,arr[i]));
        }
    }

    static char GetGeade(int best,int score){
        char grede = 'A';
        int count = 10;
        while(score < best - count){
            grede++;
            count += 10;
            if(count == 50){
                return 'F';
            }
        }
        return grede;
    }
 }

7.8
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter data of double type of 10： ");
        double[] arr = new double[10];

        for(int i = 0; i < 10; i++){
            arr[i] = input.nextDouble();
        }

        System.out.println("The average of these data :" + average(arr));
    }

    public  static double average(double[] array){
        System.out.println("double average");
        double sum = 0;//计算总和
        for(double each : array){
            sum += each;
        }

        return sum / 10;
    }

    public  static int average(int[] array){
        System.out.println("int average");
        int sum = 0;//计算总和
        for(int each : array){
            sum += each;
        }
        return sum / 10;
    }
 }

7.9
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] arr = new double[10];

        for(int i = 0; i < 10; i++){
            arr[i] = input.nextDouble();
        }
        System.out.println("The minimum number is : " + Minimum(arr));
    }
    public static double Minimum(double[] arr){
        double num = arr[0];//找最小数
        for(double each : arr){
            if(num > each){
                num = each;
            }
        }
        return num;
    }
 }

