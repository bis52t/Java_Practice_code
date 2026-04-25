public class logicalOperator {
    public static void main(String[] args){
        //and operator&& bith conditon need to be true so it can print it
        int a = 40;
        int b = 30;
        if(a<50 && b<50)
            System.out.println("both are less than 50");
    }
    
}
//or opeator if one condition is true so it can print it 
if(a<50 || b<50)
    System.out.println("at least one is less than 50");
//inigation operator
boolean isadult = false;
if(!isadult)
    System.out.println("is adult");
else
    System.out.println("is not adult");
