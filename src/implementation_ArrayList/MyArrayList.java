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
         //valid index
        if(ind<0 || ind>p+1){
            throw new ArrayIndexOutOfBoundsException("index" + ind + "size"+ size());
        }
        capcheck();
        for (int i = p; i >=ind ; i--) {
            data[i+1]=data[i];

        }
        data[ind]= valv;
        p++;
    }
    public int size(){
        return p+1;
    }
    public int get(int index){
        if(index<0 || index>p){
            throw new ArrayIndexOutOfBoundsException("at indx"+ index + "size"+ size());
        }
        return data[index];
    }
    public int remove(int index){
        if(index<0 || index>p){
            throw new ArrayIndexOutOfBoundsException("at indx"+ index + "size"+ size());
        }
        int remdata = data[index];
        //shift left
        for (int i = index; i <size()-1; i++) {
            data[i]=data[i+1];


        }p--;
        return remdata;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i <size(); i++) {
            sb.append(data[i]);
            if (i<p){
                sb.append(", ");
            }
        } sb.append(" ]");
        return sb.toString();
    }
}
