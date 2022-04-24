package com.project.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.Models.Administrateur;
import com.project.Service.AdministrateurService;
@RestController
@RequestMapping("/administrateur")
public class AdministrateurController {
	private final AdministrateurService AdministrateurService;
	public AdministrateurController(AdministrateurService c)
	{this.AdministrateurService=c;
		
	}
	@GetMapping("/all")
	public ResponseEntity<List<Administrateur>> getAllAdministrateurs(){
		List<Administrateur> Administrateurs=AdministrateurService.findAllAdministrateurs();
		return new ResponseEntity<>(Administrateurs,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Administrateur> addAdministrateur(@RequestBody Administrateur Administrateur)
	
	{
		Administrateur newAdministrateur=AdministrateurService.addAdministrateur(Administrateur);
	 return new ResponseEntity<>(newAdministrateur,HttpStatus.CREATED);
	}
	
	

}
