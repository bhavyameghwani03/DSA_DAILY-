package implementation_ArrayList;

import java.util.Arrays;

public class MyArrayList {
    int data[];
    int p = -1;
    public MyArrayList(){
        data = new int[7];
    }
    public MyArrayList(int initialcap){
        data = new int[initialcap];
    } private void capcheck(){
        if(p+1 == data.length){
            data= Arrays.copyOf(data, data.length*2);
        }
    }
    public void add(int val){
        capcheck();
        data[++p]=val;

    }public void addAtindex(int ind, int valv){
        capcheck();
        for (int i = p; i >=ind ; i--) {
            data[i+1]=data[i];

        }
        data[ind]= valv;
        p++;
    }
}
