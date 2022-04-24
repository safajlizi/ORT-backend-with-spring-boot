package com.project.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Models.Recruteur;
import com.project.Repository.RecruteurRepository;
import com.project.exception.UserNotFoundException;

@Service
public class RecruteurService {
  private final RecruteurRepository recruteurRepository ;
  
  @Autowired
  public RecruteurService(RecruteurRepository c)
  {this.recruteurRepository=c ;}
  
 public Recruteur addRecruteur(Recruteur c) {
	 return recruteurRepository.save(c); 
  }
  public List<Recruteur> findAllRecruteurs(){
	  return recruteurRepository.findAll();
  }
  public Recruteur updateRecruteur(Recruteur c)
  {
	  return recruteurRepository.save(c);
  }
  public Recruteur findRecruteurById(long id)
  {
	  return recruteurRepository.findRecruteurById(id)
			  .orElseThrow(()->new UserNotFoundException ("User by id"+id+"was not found"));
  }
  public void deleteRecruteur(long id)
  {
	  Recruteur c=  recruteurRepository.getById(id);
	 recruteurRepository.delete(c);
  }
  
}
