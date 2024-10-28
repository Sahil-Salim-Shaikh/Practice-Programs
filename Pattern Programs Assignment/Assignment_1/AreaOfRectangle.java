import java.util.*;
public  class AreaOfRectangle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of Rectangle"); 
        int Length=sc.nextInt();

        System.out.println("Enter the Width of Rectangle"); 
        int Width=sc.nextInt();

        int Area=Length*Width;
        
        System.out.println("Area of Rectangle is "+Area);

    }
}