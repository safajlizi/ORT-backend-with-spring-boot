package com.project.Models;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
@Entity
@Table(name="recruteur")
public class Recruteur extends Utilisateur {
	
	 private long numero;
	 private String email;
    private String fonction;
	private String adresse;
   private String pays;
   private String image;
    

	@OneToMany(mappedBy="recruteuro",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JsonIgnore
    private Set<Offre> loffres= new LinkedHashSet<>();
	
    
	 public Recruteur( long numero, String email, String fonction, String adresse, String pays,String image ) {
		super();
		
		this.numero = numero;
		this.email = email;
		this.fonction = fonction;
		this.adresse = adresse;
		this.pays = pays;
		this.image=image;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set<Offre> getLoffres() {
		return loffres;
	}
	public void setLoffres(Set<Offre> loffres) {
		this.loffres = loffres;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	@Override
	public String toString() {
		return "Recruteur [ numero=" + numero + ", email=" + email + ", fonction=" + fonction
				+ ", adresse=" + adresse + ", pays=" + pays + "]";
	}
	
	public Recruteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

}
