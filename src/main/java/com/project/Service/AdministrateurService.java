package com.project.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Models.Administrateur;
import com.project.Repository.AdministrateurRepository;

@Service
public class AdministrateurService {
  private final AdministrateurRepository AdministrateurRepository ;
  
  @Autowired
  public AdministrateurService(AdministrateurRepository c)
  {this.AdministrateurRepository=c ;}
  
 public Administrateur addAdministrateur(Administrateur c) {
	 return AdministrateurRepository.save(c); 
  }
  public List<Administrateur> findAllAdministrateurs(){
	  return AdministrateurRepository.findAll();
  }
 
  
}
