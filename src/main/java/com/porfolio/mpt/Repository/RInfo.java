
package com.porfolio.mpt.Repository;

import com.porfolio.mpt.Entity.Info;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RInfo extends JpaRepository<Info, Integer>{
    public Optional<Info> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
