package com.project.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Models.Condidat;
import com.project.Repository.CondidatRepository;
import com.project.exception.UserNotFoundException;

@Service
public class CondidatService {
  private final CondidatRepository condidatRepository ;
  
  @Autowired
  public CondidatService(CondidatRepository c)
  {this.condidatRepository=c ;}
  
 public Condidat addCondidat(Condidat c) {
	 return condidatRepository.save(c); 
  }
  public List<Condidat> findAllCondidats(){
	  return condidatRepository.findAll();
  }
  public Condidat updateCondidat(Condidat c)
  {
	  return condidatRepository.save(c);
  }
  public Condidat findCondidatById(long id)
  {
	  return condidatRepository.findCondidatById(id)
			  .orElseThrow(()->new UserNotFoundException ("User by id"+id+"was not found"));
  }
  public void deleteCondidat(long id)
  {
	 Condidat c=  condidatRepository.getById(id);
	 condidatRepository.delete(c);
  }
  
}
