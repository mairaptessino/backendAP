
package com.porfolio.mpt.Repository;

import com.porfolio.mpt.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Integer>{
    public Optional<Skills> findByNombreE(String nombreE);
    public boolean existsByNombreE(String nombreE);
    
    
    
       
}
