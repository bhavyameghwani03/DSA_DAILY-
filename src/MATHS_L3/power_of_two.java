package MATHS_L3;

public class power_of_two {
    public static boolean ispower(int n){
        if(n==1){
            return true ;
        }if (n==0 || n%2!=0){
            return false ;
        }
        return ispower(n/2);
    }

    static void main() {
        System.out.println(ispower(9));
    }
}
