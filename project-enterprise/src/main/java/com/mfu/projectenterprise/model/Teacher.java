package com.mfu.projectenterprise.model;
import java.util.Set;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
public class Teacher {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="TEACHER_ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="LASTNAME")
    private String lastname;

    @Column(name="COURSE_ID")
    private int courseid;

    // @JsonIgnore
    // @OneToMany(mappedBy = "user")
    // private Set<Booking> booking;

    public Teacher() {}

    public Teacher(Long id, String name,String lastname, int courseid) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.courseid = courseid;
    }

    public Teacher(String name,String lastname, int courseid) {
        this(null, name,lastname, courseid);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getCourseId() {
        return courseid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCourseId(int courseid) {
        this.courseid = courseid;
    }

   
}
