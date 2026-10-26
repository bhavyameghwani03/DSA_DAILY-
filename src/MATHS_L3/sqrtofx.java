package MATHS_L3;

public class sqrtofx {
    public  static int mySqrt(int x) {
        long l =1;
        long  h = x;
        long  ans=0;
        while(l<=h){
            long  mid= l + (h-l)/2;
            if(mid*mid<=x){
                ans = mid ;
                l=mid +1 ;
            }else h=mid-1;
        }
        return (int)ans ;
    }

    static void main() {
        System.out.println(mySqrt(10));
    }
}
