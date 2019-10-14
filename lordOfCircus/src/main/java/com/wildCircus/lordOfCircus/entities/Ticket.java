package com.wildCircus.lordOfCircus.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Ticket{

    public Ticket(){
    }

    public Ticket(String category, int price, String nbTicket){
        this.category = category;
        this.price = price;
        this.nbTicket = nbTicket;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String category;
    private int price;
    private String nbTicket;

    @ManyToMany(mappedBy = "tickets")
    private Set<User> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getnbTicket() {
        return nbTicket;
    }

    public void setnbTicket(String nbTicket) {
        this.nbTicket = nbTicket;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

}
