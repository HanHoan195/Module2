package Bai13;

import java.util.Date;

public class Certificate {
  private String id;
   private String name;
   private String rank;
   private Date day;

    public Certificate() {

    }

    public Certificate(String id, String name, String rank, Date day) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
