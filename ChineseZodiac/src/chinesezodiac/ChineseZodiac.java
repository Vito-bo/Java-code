/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinesezodiac;
import java.util.Scanner; 

/**
 *
 * @author 93102
 */
public class ChineseZodiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);    
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    
    switch (year % 12) {
      case 0: 	System.out.println("monkey"); 	break;
      case 1: 	System.out.println("rooster"); 	break;
      case 2: 	System.out.println("dog"); 	break;
      case 3: 	System.out.println("pig"); 	break;
      case 4: 	System.out.println("rat"); 	break;
      case 5: 	System.out.println("ox"); 	break;
      case 6: 	System.out.println("tiger"); 	break;
      case 7: 	System.out.println("rabbit"); 	break;
      case 8: 	System.out.println("dragon"); 	break;
      case 9: 	System.out.println("snake"); 	break;
      case 10: 	System.out.println("horse"); 	break;
      case 11: 	System.out.println("sheep"); 	break;
    }
    }
}
