import java.util.Scanner;
public class Dowhile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=0;
        do{
            System.out.println("input the number");
            number = sc.nextInt();
            System.out.print("input the number");
            System.out.println("number");
        }while(number>=0);
        System.out.println("the end");
    }
}
