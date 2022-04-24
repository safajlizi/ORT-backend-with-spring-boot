package com.project.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Models.Offre;
@Repository
public interface OffreRepository extends JpaRepository<Offre,Long > {

	void deleteOffreById(long id);

	Optional<Offre> findOffreById(long id);
    
}
