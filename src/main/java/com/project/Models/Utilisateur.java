package com.project.Models;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Utilisateur {
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
	 private String nom;
	 private String prenom;
	 
	 private String pseudo;
	 private String mot_de_passe;
	
	
	public Utilisateur(long id, String nom, String prenom, String pseudo, String mot_de_passe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	
		this.pseudo = pseudo;
		this.mot_de_passe = mot_de_passe;
		
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", pseudo="
				+ pseudo + ", mot_de_passe=" + mot_de_passe +  "]";
	}

	
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	

}
