import java.util.Scanner;

public class U1test2 {
    
    public static void main(String args[]) {

    final double pi=3.14;

    Scanner scan1=new Scanner(System.in);
    System.out.println("please enter the radius:  ");
    double i1=scan1.nextDouble();
   
    if(i1>0){
   double area=pi*i1*i1;
   System.out.println("The circle area is "+area);



    }
else{

    System.out.println("Negative input");


}
    
}
}