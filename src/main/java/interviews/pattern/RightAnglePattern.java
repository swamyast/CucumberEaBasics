package interviews.pattern;

public class RightAnglePattern {
    public static void main(String[] args) {
        for(int x=1;x<=8;x++){
            for(int y=1;y<=x;y++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
