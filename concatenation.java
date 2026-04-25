import java.util.Scanner;
public class concatenation{
    public static void main (String[] args){
        String FirstName = "tony";
        String LastName = "stark";
        String FullName = FirstName +" "+ LastName;
        System.out.println(FullName.length());
    
// to count the string lenght
        for( int i=0; i<FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }
    }
}
