/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 * 2020/3/10
 * @author 93102
 */


import java.util.Scanner;

public class Test1 {
    public static void main(String args[]) {
        //创建Scanner类对象
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an degree in Celsius:");
        //定义输入摄氏温度数据类型为double类型
        double celsius = input.nextDouble();
        //摄氏温度和华氏温度转换
        double fahrenheit = (9.0/5)*celsius + 30;
        //System.out.println();
        System.out.println(celsius + "Celsius is " + fahrenheit + " Fahrenheit");

    }
}

