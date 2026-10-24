package MATHS_L2;
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class kth_factor {
    public static  int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>() ;
        for (int i=1; i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        if (list.size()>=k){
            return list.get(k-1);
        }else return -1;

    }

    static void main() {
        System.out.println(kthFactor(30,5));
    }
}
