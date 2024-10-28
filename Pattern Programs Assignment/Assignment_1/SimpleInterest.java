import java.util.*;
public class SimpleInterest {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Amount"); 
        int Amount=sc.nextInt();

        System.out.println("Enter the Time in years"); 
        int Time=sc.nextInt();

        System.out.println("Enter the percentage"); 
        int percent=sc.nextInt();

        int SimpleInterest=Amount*Time*percent/100;
        int TotalAmountGivent=SimpleInterest+Amount;
        
        System.out.println("The simple interest is "+SimpleInterest);

        System.out.println("Total amount givent is "+TotalAmountGivent);

    }
}
