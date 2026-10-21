

package MATHS_L1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factors {

    public static void main(String[] args) {
     int n=100;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 1; i*i<=n; i++) {
            if(n%i==0) {
               list1.add(i);
              if(i*i!=n){
                 list1.add(n/i);           }
            }
        } Collections.sort(list1);
        System.out.println(list1);
    }
}



