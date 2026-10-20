
// Find Greatest Common Divisor of Array
public static  class GCDarray {
    public int GCD1 (int [] arry){
      int min = arry[0];
      int max = arry[arry.length -1];
        for (int i = 0; i < arry.length; i++) {
            if(arry[i]<min){
                min =arry[i];
            }if (arry[i]>max){
                max= arry[i];
            }
        }
       return gcd(min,max);
    }
    }
    public static  int gcd(int a , int b){
    if (b==0){
        return a ;
    } return gcd(b , a%b) ;
    }
    public static void main(String[] args){
        int[] arr = {14, 7, 2};

        GCDarray obj = new GCDarray();

        int result = obj.GCD1(arr);

        System.out.println("GCD = " + result);
}
