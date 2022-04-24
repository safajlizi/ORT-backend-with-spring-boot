package com.project.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Models.Condidat;
import com.project.Service.CondidatService;
@RestController
@RequestMapping("/condidat")
public class CondidatController {
	private final CondidatService condidatService;
	public CondidatController(CondidatService c)
	{this.condidatService=c;
		
	}
	@GetMapping("/all")
	public ResponseEntity<List<Condidat>> getAllCondidats(){
		List<Condidat> condidats=condidatService.findAllCondidats();
		return new ResponseEntity<>(condidats,HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Condidat> getCondidatById(@PathVariable("id")long id ){
		Condidat condidat=condidatService.findCondidatById(id);
		return new ResponseEntity<>(condidat,HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Condidat> addCondidat(@RequestBody Condidat condidat)
	
	{
		Condidat newcondidat=condidatService.addCondidat(condidat);
	 return new ResponseEntity<>(newcondidat,HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<Condidat> updateCondidat(@RequestBody Condidat condidat)
	
	{
		Condidat updatecondidat=condidatService.updateCondidat(condidat);
	 return new ResponseEntity<>(updatecondidat,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCondidat(@PathVariable("id")long id )
	
	{
		condidatService.deleteCondidat(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
