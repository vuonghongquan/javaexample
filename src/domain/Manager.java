package domain;

import java.util.List;

public class Manager extends Person{

    private int bonus;
    private List<Deparment> deparments;

    public Manager(int id, String name, int age, int sex) {
        super(id, name, age, sex);
    }

    public Manager(int id, String name, int age, int sex, int bonus, List<Deparment> deparments) {
        super(id, name, age, sex);
        this.bonus = bonus;
        this.deparments = deparments;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public List<Deparment> getDeparments() {
        return deparments;
    }

    public void setDeparments(List<Deparment> deparments) {
        this.deparments = deparments;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "deparments=" + deparments +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
