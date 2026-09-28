package b_lists.app;
import b_lists.utils.DynamicArray;

import java.util.Random;

public class TestApp {
    public static void main(String[] args) {
        DynamicArray myList = new DynamicArray();
        Random rg = new Random();
        for(int i = 0; i < 10; i++){
            myList.add(rg.nextInt(100));
        }

        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        myList.set(0, 3);

        System.out.println(myList.get(0));

        System.out.println(myList.indexOf(3));

    }
}
