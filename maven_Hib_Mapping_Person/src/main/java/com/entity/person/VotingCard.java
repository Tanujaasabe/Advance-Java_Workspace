package com.entity.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VotingCard {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  int vid;

@Column(nullable=false,unique=true)
private  int epic;

@Column(nullable=false,unique=true)
 private String constituency;


@Column(nullable=false)
 private String city;


@OneToOne(mappedBy = "vcard")
private Person person;


public VotingCard() {
	super();
	// TODO Auto-generated constructor stub
}


public VotingCard(int epic, String constituency, String city) {
	super();
	this.epic = epic;
	this.constituency = constituency;
	this.city = city;
}


public int getVid() {
	return vid;
}


public void setVid(int vid) {
	this.vid = vid;
}


public int getEpic() {
	return epic;
}


public void setEpic(int epic) {
	this.epic = epic;
}


public String getConstituency() {
	return constituency;
}


public void setConstituency(String constituency) {
	this.constituency = constituency;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}



}
