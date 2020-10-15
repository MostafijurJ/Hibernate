package org.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {

    @Id
    private  int lid;
    private  String laptop_name;

    @ManyToMany

    private List<Student> student = new ArrayList<Student>();

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int laptop_id) {
        this.lid = laptop_id;
    }

    public String getLaptop_name() {
        return laptop_name;
    }

    public void setLaptop_name(String laptop_name) {
        this.laptop_name = laptop_name;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptop_id=" + lid +
                ", laptop_name='" + laptop_name + '\'' +
                '}';
    }
}
