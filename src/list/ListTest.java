package list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    @Test
    public void demo1() throws Exception {

        //create list contains names John, Marry, Daance, Zoo
        List<String> lstNames = new ArrayList<>();
        lstNames.add("John");
        lstNames.add("Marry");
        lstNames.add("Dance");
        lstNames.add("Zoo");

        for (String name : lstNames) {
            System.out.println(name);
        }

        for (Object name : lstNames) {
            System.out.println((String) name);
        }

        lstNames.remove("John");
        lstNames.remove(1);
    }
}
