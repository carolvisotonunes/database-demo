package com.minutes.database.databasedemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import java.util.Date;

@Entity
@NamedQuery(name="find_all_persons", query="select p from Person p")
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String location;
    private Date birthday;

    public Person() {
    }

//    public Person(int id, String name, String location, Date birthday) {
//        this.id = id;
//        this.name = name;
//        this.location = location;
//        this.birthday = birthday;
//    }

    public Person(String name, String location, Date birthday) {
        super();
        this.name = name;
        this.location = location;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
