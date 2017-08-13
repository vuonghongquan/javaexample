package transaction;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TransactionTest {
    @Test
    public void testTran()
    {
        Lottery lot1= new Lottery(1,"01-02-03-04-05-06");
        Lottery lot2= new Lottery(2,"02-03-04-05-06-07");
        List<Lottery> lst= new ArrayList<>();
        lst.add(lot1);
        lst.add(lot2);
        for (Lottery obj:lst)
            System.out.print(obj.toString());
        TransactionDetail trd= new TransactionDetail(1, lst);
        System.out.println(trd);

    }


    @Test
    public void demo1() {
        
    }

}
