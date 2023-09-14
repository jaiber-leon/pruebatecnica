package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.AuditoriasEntity;
import com.example.pruebatecnica.service.impl.ImpAuditoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auditorias")
public class AuditoriasController {

    @Autowired
    ImpAuditoriaService impAuditoriaService;

    @PutMapping("/actualizar/{idAuditorias}")
    public void update (@PathVariable Long idAuditorias, @RequestBody AuditoriasEntity auditoriasEntity){
        impAuditoriaService.updateAuditoria(idAuditorias,auditoriasEntity);
    }

    @DeleteMapping("/borrar/{idAuditorias}")
    public void delete (@PathVariable Long idAuditorias ){
        impAuditoriaService.deleteAuditoriaById(idAuditorias);
    }

    @GetMapping("/traer")
    public List<AuditoriasEntity> traer (){
        return impAuditoriaService.obtenerAuditorias();
    }
}
