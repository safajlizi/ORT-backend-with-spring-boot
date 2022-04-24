package com.project.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Models.Offre;
import com.project.Repository.OffreRepository;
import com.project.exception.UserNotFoundException;

@Service
public class OffreService {
  private final OffreRepository offreRepository ;
  
  @Autowired
  public OffreService(OffreRepository c)
  {this.offreRepository=c ;}
  
 public Offre addOffre(Offre c) {
	 return offreRepository.save(c); 
  }
  public List<Offre> findAllOffres(){
	  return offreRepository.findAll();
  }
  public Offre updateOffre(Offre c)
  {
	  return offreRepository.save(c);
  }
  public Offre findOffreById(long id)
  {
	  return offreRepository.findOffreById(id)
			  .orElseThrow(()->new UserNotFoundException ("User by id"+id+"was not found"));
  }
  public void deleteOffre(long id)
  {
	  Offre c=  offreRepository.getById(id);
	 offreRepository.delete(c);
  }
  
}
