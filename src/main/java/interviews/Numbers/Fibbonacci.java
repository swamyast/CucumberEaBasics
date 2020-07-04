package interviews.Numbers;

public class Fibbonacci {
    public static void main(String[] args) {
        int a=0,b=1,c=1,num=5;
        for(int i=0;i<num;i++){
            System.out.println(a);
            a=b;
            b=c;
            c=a+b;
        }
    }
}
