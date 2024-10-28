// 327×2=654

// 327×3=981

// Now, concatenate the above results to the given number (n).

// "327"+"654"+ "981"= 327654981
/**
 * FascinatingNo
 */
public class FascinatingNo {

    public static void main(String[] args) {
        int n=8975;

        boolean Fascinatingno=true;

        int n2=n*2;
        int n3=n*3;

        String concatstr=n+""+n2+n3;
        
        for (char i = '1'; i <='9'; i++) {
            int count=0;

            for (int j = 0; j <concatstr.length(); j++) {
                if (concatstr.charAt(j)==i) {
                    count++;
                }
                
            }

            if (count!=1) {
                Fascinatingno=false;
                break;
            }

        }

        if (Fascinatingno){
            System.out.println(n+" is Fascinating no");
            
        }
        else{
            System.out.println(n+" is not Fascinating no");
        }


    }
}