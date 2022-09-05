
package com.porfolio.mpt.Service;

import com.porfolio.mpt.Entity.Acerca;
import com.porfolio.mpt.Repository.RAcerca;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAcerca {
    @Autowired
    RAcerca rAcerca;
    
    public List<Acerca> list(){
    return rAcerca.findAll();
}
    public Optional<Acerca> getOne(int id){
        return rAcerca.findById(id);
    }
    
public Optional<Acerca> getByInfo(String info){
    return rAcerca.findByInfo(info);
}

public void save(Acerca acerca){
    rAcerca.save(acerca);
}

public void delete(int id){
    rAcerca.deleteById(id);
}

public boolean existsById(int id){
    return rAcerca.existsById(id);
}

public boolean existsByInfo(String info){
    return rAcerca.existsByInfo(info);
}
}


    



