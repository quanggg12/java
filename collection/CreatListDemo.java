package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CreatListDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        list1.add("Hello");
        list1.add("java");
        list1.add("Collection");
        
        System.out.println("1. Using iterator: ");
        Iterator<String> it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.print("\n");
        System.out.println("2. Using for: ");
        for (String s : list1) {
            System.out.println(s);
        }
        System.out.print("\n");
        System.out.println("3. Using index: ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }   
}
