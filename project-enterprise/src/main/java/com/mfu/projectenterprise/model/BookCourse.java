package com.mfu.projectenterprise.model;
import java.sql.Date;
import java.util.Set;

import javax.xml.crypto.Data;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
public class BookCourse {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="COURSE_ID")
    private int id;

    @Column(name="NAME")
    private int courseid;

    @Column(name="TEACHER_ID")
    private int teacherid;

    @Column(name="PRICE")
    private Date datetime;

    // @JsonIgnore
    // @OneToMany(mappedBy = "user")
    // private Set<Booking> booking;

    public BookCourse() {}

    public BookCourse(int id, int courseid,int teacherid, Date datetime) {
        this.id = id;
        this.courseid = courseid;
        this.teacherid = teacherid;
        this.datetime = datetime;
    }

    public BookCourse(int courseid,int teacherid, Date datetime) {
        this((Integer) null, courseid,teacherid, datetime);
    }

    public int getId() {
        return id;
    }

    public int getCourseId() {
        return courseid;
    }

    public int getTeacherId() {
        return teacherid;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseId(int courseid) {
        this.courseid = courseid;
    }

    public void setTeacherId(int teacherid) {
        this.teacherid = teacherid;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

   
}
