package domain;

public class Worker extends Person{

    private Deparment deparment;

    public Worker() {
    }

    public Worker(int id, String name, int age, int sex) {
        super(id, name, age, sex);
    }

    public Deparment getDeparment() {
        return deparment;
    }

    public void setDeparment(Deparment deparment) {
        this.deparment = deparment;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "deparment=" + deparment.toString() +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
