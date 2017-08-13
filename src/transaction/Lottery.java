package transaction;

public class Lottery {
    private int id;
    private String num;

    public Lottery(int id, String num) {
        this.id = id;
        this.num = num;
    }

    public int getID(int id) {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setID(String num) {
        this.num = num;
    }
public String toString(){
        return "Lottery:"+"Id= "+id+", Num="+num;
}
}