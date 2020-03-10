/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;
/**
 * 2020/3/10
 * @author 93102
 */
import java.util.Scanner;

public class Test2 {
    public static void main(String args[]) {
        //创建Scanner类对象
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder:");
        //定义圆柱体的半径和高
        double radius = input.nextDouble();
        double length = input.nextDouble();
        //计算面积和体积
        double area = Math.PI * radius * radius;  //引用Math类中PI
        double volume = Math.PI * radius * radius * length;
        System.out.println("The area is " + (int)(area*10000) / 10000.0);
        System.out.println("The volume is " +(int)(volume*10) / 10.0);
    }
}

