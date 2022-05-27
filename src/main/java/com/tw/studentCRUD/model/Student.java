package com.tw.studentCRUD.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "studentDetails")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @Size(min=1,message="required")
    private String name;

    @Column(name = "email")
    @Email
    private String email;

    @Column(name = "mobile")
    private String mobileNumber;

    @Column(name = "age")
    private int age;

    public Student() {
        super();
    }

    public Student(String name, String email, String mobileNumber, int age) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
