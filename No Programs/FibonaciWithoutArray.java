public class FibonaciWithoutArray {
    public static void main(String[] args) {
        int n=15;
        int current;
        int firstno=0;
        int secondno=1;
        for (int i = 2; i <=n; i++) {
            current=firstno+secondno;
            firstno=secondno;
            secondno=current;
            System.out.println(current);
        }

    }
}
