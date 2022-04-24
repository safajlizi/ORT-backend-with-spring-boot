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

import com.project.Models.Offre;
import com.project.Service.OffreService;
@RestController
@RequestMapping("/offre")
public class OffreController {
	private final OffreService offreService;
	
	public OffreController(OffreService c)
	{this.offreService=c;
		
	}
	@GetMapping("/all")
	public ResponseEntity<List<Offre>> getAllOffres(){
		List<Offre> offres=offreService.findAllOffres();
		return new ResponseEntity<>(offres,HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Offre> getOffreById(@PathVariable("id")long id ){
		Offre offre=offreService.findOffreById(id);
		return new ResponseEntity<>(offre,HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Offre> addOffre(@RequestBody Offre offre)
	
	{
		Offre newoffre=offreService.addOffre(offre);
	 return new ResponseEntity<>(newoffre,HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<Offre> updateOffre(@RequestBody Offre offre)
	
	{
		Offre updateoffre=offreService.updateOffre(offre);
	 return new ResponseEntity<>(updateoffre,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteOffre(@PathVariable("id")long id )
	
	{
		offreService.deleteOffre(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	

}
