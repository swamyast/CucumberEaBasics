package interviews.Numbers;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int val=sn.nextInt();
        int num=7; boolean flag=false;
        for(int i=2;i<val;i++){
            if(val%i==0){
                flag=true;
               break;
            }
            else flag=false;
        }
        if(flag)
            System.out.println("The number is not prime "+val);
        else
            System.out.println("The number is prime "+val);

    }
}
