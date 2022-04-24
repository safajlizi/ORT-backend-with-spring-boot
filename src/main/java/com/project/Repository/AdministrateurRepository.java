package com.project.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.Models.Administrateur;
@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur,Long > {

	void deleteAdministrateurById(long id);

	Optional<Administrateur> findAdministrateurById(long id);
    
}
