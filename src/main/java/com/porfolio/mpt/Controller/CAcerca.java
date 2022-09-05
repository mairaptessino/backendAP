package com.porfolio.mpt.Controller;

import com.porfolio.mpt.Dto.dtoAcerca;
import com.porfolio.mpt.Entity.Acerca;
import com.porfolio.mpt.Security.Controller.Mensaje;
import com.porfolio.mpt.Service.SAcerca;
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
@RequestMapping("/acerca")
@CrossOrigin(origins = "http://localhost:4200")
public class CAcerca {

    @Autowired
    SAcerca sAcerca;

    @GetMapping("/lista")
    public ResponseEntity<List<Acerca>> list() {
        List<Acerca> list = sAcerca.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Acerca> getById(@PathVariable("id") int id) {
        if (!sAcerca.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        Acerca acerca = sAcerca.getOne(id).get();
        return new ResponseEntity(acerca, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sAcerca.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        sAcerca.delete(id);
        return new ResponseEntity(new Mensaje("Información eliminada"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoAcerca dtoacerca) {
        if (StringUtils.isBlank(dtoacerca.getInfo())) {
            return new ResponseEntity(new Mensaje("El campo es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Acerca acerca = new Acerca(dtoacerca.getInfo());
        sAcerca.save(acerca);
        return new ResponseEntity(new Mensaje("Información agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoAcerca dtoacerca) {
        if (!sAcerca.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }

        if (StringUtils.isBlank(dtoacerca.getInfo())) {
            return new ResponseEntity(new Mensaje("El campo no puede estar vacío"), HttpStatus.BAD_REQUEST);
        }
        Acerca acerca = sAcerca.getOne(id).get();
        acerca.setInfo(dtoacerca.getInfo());
        sAcerca.save(acerca);
        return new ResponseEntity(new Mensaje("Información actualizada"), HttpStatus.OK);
    }
}
