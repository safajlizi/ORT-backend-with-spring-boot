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

import com.project.Models.Recruteur;
import com.project.Service.RecruteurService;
@RestController
@RequestMapping("/recruteur")
public class RecruteurController {
	private final RecruteurService recruteurService;
	
	public RecruteurController(RecruteurService c)
	{this.recruteurService=c;
		
	}
	@GetMapping("/all")
	public ResponseEntity<List<Recruteur>> getAllRecruteurs(){
		List<Recruteur> recruteurs=recruteurService.findAllRecruteurs();
		return new ResponseEntity<>(recruteurs,HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Recruteur> getRecruteurById(@PathVariable("id")long id ){
		Recruteur recruteur=recruteurService.findRecruteurById(id);
		return new ResponseEntity<>(recruteur,HttpStatus.OK);
	}
	@PostMapping("/add")
	
	public ResponseEntity<Recruteur> addRecruteur(@RequestBody Recruteur recruteur)
	
	{
		Recruteur newrecruteur=recruteurService.addRecruteur(recruteur);
	 return new ResponseEntity<>(newrecruteur,HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<Recruteur> updateRecruteur(@RequestBody Recruteur condidat)
	
	{
		Recruteur updaterecruteur=recruteurService.updateRecruteur(condidat);
	 return new ResponseEntity<>(updaterecruteur,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteRecruteur(@PathVariable("id")long id )
	
	{
		recruteurService.deleteRecruteur(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
