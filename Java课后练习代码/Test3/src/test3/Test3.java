/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;
/**
 * 2020/3/10
 * @author 93102
 */
import java.util.Scanner;

public class Test3 {
    public static void main(String args[]) {
        //创建Scanner类对象
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an value for feet:");
        //定义feet变量
        double feet = input.nextDouble();
        //将英尺转换成米
        double meters = feet * 0.305;
        System.out.println(feet + "feet is " + meters + " meters");
    }
}
