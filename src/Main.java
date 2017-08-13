import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = a + b;

        List lst = new ArrayList();

        lst.add(a);
        lst.add(b);
        lst.add(c);
        lst.add(6);
        lst.add("A");
        lst.add(1.6);

        System.out.println(lst.toString());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        for (Object obj: lst) {
            System.out.println(obj);
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        Iterator ite = lst.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");
        //checking exist
        if(lst.contains(6)) {
            System.out.println("6 has been existed!");
        }
    }
}
