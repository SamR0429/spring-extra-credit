package com.codeup.extracredit.models;


import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "UNSIGNED")
    private Long id;

    @Column(columnDefinition = "varchar(80) NOT NULL")
    private String email;


    @Column(columnDefinition = "NOT NULL")
    private Double price;

    public Order(){

    }

    public Order(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Order(Long id, String email, Double price) {
        this.id = id;
        this.email = email;
        this.price = price;
    }

    public Order(String email, Double price) {
        this.email = email;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
