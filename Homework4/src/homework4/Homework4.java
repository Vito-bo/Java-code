

//4.4
 import  java.util.Scanner;
public  class   AreaOfHexagon18 {
    public  static  void  main(String[] args) {
        System.out.print("Please enter the side length of the hexagon:");
        Scanner  input =new  Scanner(System.in);
        double  side = input.nextDouble();
        double  area = 6*(side*side)/(4*Math.tan(Math.PI/6.0));
        System.out.println("The area of the hexagon is ");
String.format("%.2f",area);

    }
}


4.25 
public  class  PlateNumber20 {
    public  static  void  main(String[] args) {
        
        System.out.print((char)('A'+Math.random()*('Z'-'A'+1)));
        System.out.print((char)('A'+Math.random()*('Z'-'A'+1)));
        System.out.print((char)('A'+Math.random()*('Z'-'A'+1)));
        System.out.print((int)(Math.random()*10));
        System.out.print((int)(Math.random()*10));
        System.out.print((int)(Math.random()*10));
        System.out.print((int)(Math.random()*10));
    }
}

