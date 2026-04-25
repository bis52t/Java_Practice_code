import java.util.Scanner;
public class ConditionStatement{
    public static void main(String[] args){
        //pen=10 and nootbook=40
        Scanner sc = new Scanner(System.in);
        int cash =  sc.nextInt();
        if(cash < 10){
            System.out.println("you cannot buy anything");
            System.out.println("you need more money");
        }
        else if (cash > 10 && cash <40){
            System.out.println("you can  buy one thing");
        }
        else{
            System.out.println("ccan buy both the things");
        }
    }

}
