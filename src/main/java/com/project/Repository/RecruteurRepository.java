package com.project.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Models.Recruteur;
@Repository
public interface RecruteurRepository extends JpaRepository<Recruteur,Long > {

	void deleteRecruteurById(long id);

	Optional<Recruteur> findRecruteurById(long id);


    
}
