//Given, N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. Hence 80 is a sunny number.
public class SunnyNo {
    public static void main(String[] args) {
        int n = 10;
        boolean isSunny = false;
        
        for (int i = 1; i * i <= n + 1; i++) {
            if (i * i == n + 1) {
                isSunny = true;
                break;
            }
        }
        
        if (isSunny) {
            System.out.println(n + " is a sunny number");
        } else {
            System.out.println(n + " is not a sunny number");
        }
    }
}
