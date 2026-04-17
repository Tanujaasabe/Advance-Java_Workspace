package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;

    @Column(nullable = false, unique = true)
    private int aadharId;

    @Column(nullable = false)
    private String name;

    // ================== RELATIONS ==================

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pincode")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "voter_id")
    private VotingCard votingCard;


    // ================== CONSTRUCTORS ==================

    public Person() {
    }

    public Person(int aadharId, String name, VotingCard votingCard, Address address) {
        this.aadharId = aadharId;
        this.name = name;
        this.votingCard = votingCard;
        this.address = address;
    }

    // ================== GETTERS & SETTERS ==================

    public int getPid() {
        return pid;
    }

    public int getAadharId() {
        return aadharId;
    }

    public void setAadharId(int aadharId) {
        this.aadharId = aadharId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VotingCard getVotingCard() {
        return votingCard;
    }

    public void setVotingCard(VotingCard votingCard) {
        this.votingCard = votingCard;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
