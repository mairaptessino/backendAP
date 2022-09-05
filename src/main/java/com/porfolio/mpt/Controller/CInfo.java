
package com.porfolio.mpt.Controller;

import com.porfolio.mpt.Dto.dtoInfo;
import com.porfolio.mpt.Entity.Info;
import com.porfolio.mpt.Security.Controller.Mensaje;
import com.porfolio.mpt.Service.SInfo;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
@CrossOrigin(origins="http://localhost:4200")
public class CInfo {
    @Autowired
    SInfo sInfo;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Info>> list(){
        List<Info> list=sInfo.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Info> getById(@PathVariable("id") int id){
        if(!sInfo.existsById(id))
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        Info info = sInfo.getOne(id).get();
        return new ResponseEntity(info, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id){
        if(!sInfo.existsById(id))
            return new ResponseEntity(new Mensaje("No existte el ID"), HttpStatus.NOT_FOUND);
        sInfo.delete(id);
        return new ResponseEntity(new Mensaje("Información eliminada"), HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<?> create (@RequestBody dtoInfo dtoinfo){
        if(StringUtils.isBlank(dtoinfo.getNombre()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sInfo.existsByNombre(dtoinfo.getNombre()))
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        Info info = new Info(dtoinfo.getNombre(), dtoinfo.getApellido(), dtoinfo.getImagen(), dtoinfo.getTitulo(), dtoinfo.getDatos());
        sInfo.save(info);
        return new ResponseEntity(new Mensaje("Información creada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoInfo dtoinfo){
        if(!sInfo.existsById(id))
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        if(sInfo.existsByNombre(dtoinfo.getNombre()) && sInfo.getByNombre(dtoinfo.getNombre()).get().getId() != id)
        return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        if(StringUtils.isBlank(dtoinfo.getNombre()))
            return new ResponseEntity(new Mensaje("El campo no puede estar vacío"), HttpStatus.BAD_REQUEST);
        Info info = sInfo.getOne(id).get();
        info.setNombre(dtoinfo.getNombre());
        info.setApellido(dtoinfo.getApellido());
        info.setImagen(dtoinfo.getImagen());
        info.setTitulo(dtoinfo.getTitulo());
        info.setDatos(dtoinfo.getDatos());
        sInfo.save(info);
        return new ResponseEntity(new Mensaje("Información actualizada"), HttpStatus.OK);
    }
    
    
    
  
}
