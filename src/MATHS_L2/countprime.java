package MATHS_L2;
import java.util.Arrays;
public class countprime {
    public  static int countp(int n){
        int c=0;
        boolean arr[]= new boolean[n+1];
        Arrays.fill(arr, true);
        if(n<=2){
            return c;
        }
        for(int i=2;i*i<n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<n;j=j+i){
                    arr[j]=false;
                }
            }
        }
      for(int k =2;k<n;k++){

         if(arr[k]==true){
             c++;
         }
      }

        return c ;
    }
    public static void main(String[] args){
        System.out.println(countp(12));
    }
}

