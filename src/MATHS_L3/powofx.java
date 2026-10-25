package MATHS_L3;

public class powofx {
    public  static double myPow(double  x, int n) {

        boolean flag = false;
        long p =n;
        if(p<0){
            p=-p;
            flag=true;
        }
        double ans = pow(x,p);
        return flag ? 1/ans : ans ;
    }
    public  static double pow(double x, long n){
        if(n==0) return 1;
        if(n==1) return x;
        double hero = pow(x , n/2);
        if(n%2==0){
            return (hero*hero );
        } else return (hero*hero*x);
    }

    static void main() {
        System.out.println(myPow(3,3));
    }
}
