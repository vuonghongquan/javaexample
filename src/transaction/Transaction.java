package transaction;

import domain.Person;

public class Transaction {
    private int id;
    private long createdDate;
    private String content;
    private Person createdBy;

    public Transaction(int id, Long createdDate, String content, Person createdBy) {
        this.id=id;
        this.createdDate=createdDate;
        this.content=content;
        this.createdBy=createdBy;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }
    public Long getCreatedDate(){
       return createdDate;
    }
    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
    public Person getCreatedBy(){
        return createdBy;
    }
    public void setCreatedBy(Person createdBy){
        this.createdBy = createdBy;
    }
    @Override
    public String toString(){
        return "person ["+"id="+id+", createdDate="+createdDate+", content="+content+", createdBy="+createdBy;
    }

}

