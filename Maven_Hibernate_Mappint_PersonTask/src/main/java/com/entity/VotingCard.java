package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VotingCard")
public class VotingCard {
	
 @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int voter_id ;


@Column(nullable=false)
	 private String constituency;



	 public VotingCard( String constituency) {
		super();
		this.constituency = constituency;
	 }
	 public VotingCard() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public int getVoter_id() {
		 return voter_id;
	 }
	 public void setVoter_id(int voter_id) {
		 this.voter_id = voter_id;
	 }
	 public String getConstituency() {
		 return constituency;
	 }
	 public void setConstituency(String constituency) {
		 this.constituency = constituency;
	 }
	 

}
