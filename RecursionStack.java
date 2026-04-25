public class RecursionStack {
    public static int calPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 0;
        }
        if(n%2==0){
            return calPower(n,n/2)* calPower(n,n/2);

        }
        else{
            return calPower(n,n/2)*calPower(n,n/2)*x;
        }

    }
    public statiic void main(String[] args){
        int x=2, n =5;
        int ans = calPower(x ,n);
        System.out.println(ans);
    }
    
}
