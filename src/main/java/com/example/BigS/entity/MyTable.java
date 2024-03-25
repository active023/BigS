package com.example.BigS.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="my_table")
public class MyTable {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "create_at")
    private Timestamp createdAt;


}
