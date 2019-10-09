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

    public Ticket(String category, double price, int ticketTaken){
        this.category = category;
        this.price = price;
        this.ticketTaken = ticketTaken;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String category;
    private double price;
    private int ticketTaken;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTicketTaken() {
        return ticketTaken;
    }

    public void setTicketTaken(int ticketTaken) {
        this.ticketTaken = ticketTaken;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
