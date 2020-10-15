package org.example.model;

import javax.persistence.*;

@Entity
public class Informations {
    @Id
    @Column
    @GeneratedValue
    private int id;

    @Column
     private MyName name;

    @Column
    //@Transient //is used to skip specific data
    private String status;

    public Informations() {
        super();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MyName getName() {
        return name;
    }

    public void setName(MyName name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Informations{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
