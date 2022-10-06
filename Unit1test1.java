
import java.util.Scanner;

public class Unit1test1 {

   
    public static void main(String args[]) {
       
       Scanner scan1=new Scanner(System.in);
       System.out.println("please input two int numbers: ");
       int i1=scan1.nextInt();
       int i2=scan1.nextInt();
    
       int add=i1+i2;
       int minus=i1-i2;
       int times =i1*i2;
       int divide=i1/i2;
    
       Scanner scan2=new Scanner(System.in);
       System.out.println("please enter the operation you want: 1.add 2. substraction 3. times 4. divide ");
       int i3=scan2.nextInt();

        switch (i3) {

        case 1:
        System.out.println("unmber1+number2= "+ add);
        break;
        
        case 2:
            System.out.println("unmber1-number2= "+ minus);
             break;
         
        case 3:

            System.out.println("unmber1 x number2= "+ times);
            break;
        
         case 4:
               System.out.println("unmber1 / number2= "+ divide);
               break;

    }
}
}

            

    

