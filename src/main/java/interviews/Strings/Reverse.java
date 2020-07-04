package interviews.Strings;

public class Reverse {
    public static void main(String[] args) {
        String s="helo", rev="";char c;
        StringBuffer b=new StringBuffer("Dark");
        System.out.println(b.reverse());
        System.out.println(s.length());

        for(int i=s.length()-1;i>0;i--){
            c=s.charAt(i);
            rev=rev+c;
        }
        System.out.println(rev);
    }
}
