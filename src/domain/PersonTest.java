package domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test
    public void testPerson() throws  Exception {

        Person employ = new Person(1, "Henry", 25, 1);
        Person manger = new Manager(2, "John", 30, 1);
        Person worker = new Worker(3, "Marry", 21, 0);

        List<Deparment> deparments = new ArrayList<>();
        deparments.add(new Deparment(1, "Marketing"));
        deparments.add(new Deparment(2, "Human resource"));
        deparments.add(new Deparment(3, "Accounting"));

        List<Deparment> managerDept = new ArrayList<>();
        managerDept.add(deparments.get(0));
        managerDept.add(deparments.get(1));

        ((Manager)manger).setDeparments(managerDept);

        ((Worker)worker).setDeparment(deparments.get(2));

        System.out.println(manger);
        System.out.println(worker);
    }
}
