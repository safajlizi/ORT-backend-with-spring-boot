package com.project.Models;

import javax.persistence.Table;
import javax.persistence.Entity;
@Entity
@Table(name="administrateur")
public class Administrateur extends Utilisateur  {
   
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateur(long id, String nom, String prenom, String pseudo, String mot_de_passe) {
		super(id, nom, prenom, pseudo, mot_de_passe);
	}


}
