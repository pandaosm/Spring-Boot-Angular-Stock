package com.projet.stock.dto;

import java.io.Serializable;
import java.util.Date;

public class AgentDTO implements Serializable{

	private String nom;
	private String mat;
	private Date dat;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public Date getDat() {
		return dat;
	}
	public void setDat(Date dat) {
		this.dat = dat;
	}
	
	
	
}
