package com.wellsfargo.counselor.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Portfolio {
	
	@Id
	@GeneratedValue()
	private long portfolioId;
	
	@ManyToOne
	@JoinColumn(name = "clientId", nullable = false)
	private Client client;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date creationDate;
	
	pr