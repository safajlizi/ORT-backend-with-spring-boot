package com.project.Models;
import java.util.Date;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="condidat")
public class Condidat extends Utilisateur  {
	
	 private String sexe;
	 private Date date_naissance;
	 private long numero;
	 private String email;
	 
	 private String fonction;
	 private String adresse;
	 private String pays;
	 private String image;
	 public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	
	@ManyToMany
	@JoinTable(name="offre_condidat",joinColumns= @JoinColumn (name="id_condidt"),
	inverseJoinColumns=@JoinColumn(name="id_offre"))
	private List<Offre> loffre;
	public List<Offre> getLoffre() {
		return loffre;
	}
	public void setLoffre(List<Offre> loffre) {
		this.loffre = loffre;
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

	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
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
	
	public Condidat( String sexe, Date date_naissance, long numero, String email, String fonction,
			String adresse, String pays,String image) {
		super();
	
		this.sexe = sexe;
		this.date_naissance = date_naissance;
		this.numero = numero;
		this.email = email;
		this.fonction = fonction;
		this.adresse = adresse;
		this.pays = pays;
		this.image=image;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Condidat [sexe=" + sexe + ", date_naissance=" + date_naissance + ", numero=" + numero
				+ ", email=" + email + ", fonction=" + fonction + ", adresse=" + adresse + ", pays=" + pays + "]";
	}
	
	public Condidat() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

}
