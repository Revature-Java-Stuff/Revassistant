package com.revature.revassistant.entities;

import javax.persistence.*;

@Entity
@Table(name = "test_table")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String value;

    public Test() {
    }

    public Test(String value) {
        this.value = value;
    }

    public Test(Integer id, String value) {
        this.id = id;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
