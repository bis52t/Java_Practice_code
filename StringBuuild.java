import java.util.Scanner;
public class StringBuuild{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println("sb");
        System.out.println(sb.charAt(0));
        // this for change the letter
       // sb.setCharAt(0,'P');
       // this is for insert
       sb.insert(0, 'n');
        System.out.println(sb);
        //  for delete
        sb.delete(0, 1);
        System.out.println(sb);
    }
}