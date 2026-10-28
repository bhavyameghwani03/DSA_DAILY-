package implementation_ArrayList;

public class demo {
    static void main() {
        //MyArrayList list = new MyArrayList();
      //  list.add(4);
        //System.out.println(list);
        MyArrayList list = new MyArrayList(2);

        list.add(10);
        list.add(20);
        list.add(30);
        list.addAtindex(1, 15);

        System.out.println(list);  // [10, 15, 20, 30]

        System.out.println(list.remove(2)); // 20

        System.out.println(list);  // [10, 15, 30]
        System.out.println(list.size()); // 3
    }
}
