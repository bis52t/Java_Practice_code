public class primenumber{
    public static void main(String[] args){
        int n=7;
        int i;
        for(    i=2; i <n; i++){
            if(n%i ==0){
                System.out.println("not prime");
                break;

            }
        }
        if(i==n){
            System.out.println("Prime");
        }
        }
}