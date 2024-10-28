import java.util.*;
public  class AreaOfCircle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle"); 
        int radius=sc.nextInt();
        double pai=3.14;
        double Area=pai*(radius*radius);

        System.out.println("Area of circle is "+Area);

    }
}