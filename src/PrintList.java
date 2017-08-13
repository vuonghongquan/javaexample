import java.util.List;

public class PrintList {
    List lst;

    public PrintList(List lst) {
        this.lst = lst;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < lst.size(); i++) {
            str += i + ", ";
        }
        return str + "]";
    }
}
