
package com.porfolio.mpt.Repository;

import com.porfolio.mpt.Entity.Acerca;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAcerca extends JpaRepository<Acerca, Integer> {
    public Optional<Acerca>findByInfo(String info);
    public boolean existsByInfo(String info);
    
}
