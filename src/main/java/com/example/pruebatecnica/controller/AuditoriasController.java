package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.entity.AuditoriasEntity;
import com.example.pruebatecnica.service.impl.ImpAuditoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auditorias")
public class AuditoriasController {

    @Autowired
    ImpAuditoriaService impAuditoriaService;

    @PutMapping("/actualizar")
    public void update (@RequestBody AuditoriasEntity auditoriasEntity){
        impAuditoriaService.updateAuditoria(auditoriasEntity);
    }

    @DeleteMapping("/delete")
    public void delete (@PathVariable Long idAuditorias ){
        impAuditoriaService.deleteAuditoriaById(idAuditorias);
    }
}
