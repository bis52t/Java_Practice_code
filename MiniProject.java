import java.util.Scanner;
public class MiniProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do{
            System.out.println("Guess the number");
            userNumber = sc.nextInt();
            if(userNumber==myNumber){
                System.out.println("you gusssed is right(1-100)");
                break;
            }
            else if(userNumber>myNumber){
                System.out.println("our number is too large");
            }
            else{
                System.out.println("our numberis too small");
            }
        }while(userNumber>=0);
        System.out.print("My number was :");
        System.out.println(myNumber);


    }
    
}
