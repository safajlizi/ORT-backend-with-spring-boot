package com.project.Repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.Models.Condidat;
@Repository
public interface CondidatRepository extends JpaRepository<Condidat,Long > {

	void deleteCondidatById(long id);

	Optional<Condidat> findCondidatById(long id);
  
}
