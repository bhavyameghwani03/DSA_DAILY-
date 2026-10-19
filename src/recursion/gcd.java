package recursion;
 //GCD of Two Numbers (Euclidean Algorithm)

public class gcd{
    public   static int  gcdans (int a , int b ){
        if(b==0){
            return a ;
        }  return gcdans(b , a% b);
    }

public static void main(String[] args) {
    System.out.println(gcdans(14, 21));
}
}