package com.project.Models;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.GeneratedValue;

@Entity
@Table(name="offre")
public class Offre{
	 @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private long id;
	 private String titre;
	 private String domaine;
	 private String region;
	 private String condition ;
	 private Date date_fin;

	 @ManyToOne(fetch=FetchType.EAGER)
	 private Recruteur recruteuro;
	 
	 
	 @ManyToMany
	 @JoinTable(name="offre_condidat",joinColumns= @JoinColumn (name="id_offre"),
				inverseJoinColumns=@JoinColumn(name="id_condidt"))
	private List<Condidat>listcond;
	public Recruteur getRecruteuro() {
		return recruteuro;
	}
	public void setRecruteuro(Recruteur recruteuro) {
		this.recruteuro = recruteuro;
	}
	public List<Condidat> getListcond() {
		return listcond;
	}
	public void setListcond(List<Condidat> listcond) {
		this.listcond = listcond;
	}
	public Recruteur getRec_offre() {
		return recruteuro;
	}
	public void setRec_offre(Recruteur rec_offre) {
		this.recruteuro= rec_offre;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	@Override
	public String toString() {
		return "Offre [id=" + id + ", titre=" + titre + ", domaine=" + domaine + ", region=" + region + ", condition="
				+ condition + ", date_fin=" + date_fin + "]";
	}
	public Offre(long id, String titre, String domaine, String region, String condition, Date date_fin) {
		super();
		this.id = id;
		this.titre = titre;
		this.domaine = domaine;
		this.region = region;
		this.condition = condition;
		this.date_fin = date_fin;
	}
	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
