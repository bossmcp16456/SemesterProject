package com.mfu.projectenterprise.model;
import java.util.Set;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
public class Course {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="COURSE_ID")
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="TEACHER_ID")
    private int teacherid;

    @Column(name="PRICE")
    private int price;

    // @JsonIgnore
    // @OneToMany(mappedBy = "user")
    // private Set<Booking> booking;

    public Course() {}

    public Course(int id, String name,int teacherid, int price) {
        this.id = id;
        this.name = name;
        this.teacherid = teacherid;
        this.price = price;
    }

    public Course(String name,int teacherid, int price) {
        this((Integer) null, name,teacherid, price);
    }

   

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTeacherId() {
        return teacherid;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeacherId(int teacherid) {
        this.teacherid = teacherid;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   
}
