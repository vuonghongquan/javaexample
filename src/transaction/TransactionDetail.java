package transaction;

import java.util.List;

public class TransactionDetail {
   private int id;
   private List<Lottery> loteries;

public TransactionDetail(int id, List<Lottery> loteries){
    this.id=id;
    this.loteries=loteries;
}
public int getId(){
    return id;
}
public void setID(int id){
    this.id=id;
}
public List<Lottery> getLottery(){
return loteries;}
public void setLoteries(List<Lottery> loteries){
    this.loteries=loteries;
}

    @Override
    public String toString() {
        return "TransactionDetail{" +
                "id=" + id +
                ", loteries=" + loteries +
                '}';
    }
}