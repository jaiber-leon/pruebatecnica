package com.example.pruebatecnica.controller;

import com.example.pruebatecnica.dto.AuditoriaDTO;
import com.example.pruebatecnica.entity.AuditoriasEntity;
import com.example.pruebatecnica.service.impl.ImpAuditoriaService;
import com.example.pruebatecnica.util.Constante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Clase controller de auditoria
 *
 * @author Jaiber Antonio
 */
@RestController
@RequestMapping(Constante.PATH_AUDITORIAS)
@CrossOrigin(originPatterns = "http://localhost:4200")
public class AuditoriasController {

    @Autowired
    ImpAuditoriaService impAuditoriaService;

    @PutMapping("/actualizar/{idAuditorias}")
    public void update (@PathVariable Long idAuditorias, @RequestBody AuditoriasEntity auditoriasEntity){
        impAuditoriaService.updateAuditoria(idAuditorias,auditoriasEntity);
    }
    @PostMapping("/crear")
    public AuditoriaDTO create (@RequestBody AuditoriasEntity auditoriasEntity){
        return impAuditoriaService.createAuditoria(auditoriasEntity);
    }

    @DeleteMapping("/borrar/{idAuditorias}")
    public void delete (@PathVariable Long idAuditorias ){
        impAuditoriaService.deleteAuditoriaById(idAuditorias);
    }

    @GetMapping("/traerpornombre/{nombre}")
    public AuditoriaDTO findByNombre (@PathVariable String nombre){
    return impAuditoriaService.findBynombre(nombre);

    }
    @GetMapping("/traerporid/{idAuditorias}")
    public AuditoriaDTO findById (@PathVariable Long idAuditorias){
        return impAuditoriaService.findById(idAuditorias);
    }
    @GetMapping("/traer")
    public List<AuditoriaDTO> get (){
        return impAuditoriaService.obtenerAuditorias();
    }
    @DeleteMapping("/borrarpornombre/{nombre}")
    public void delete (@PathVariable String nombre){
        impAuditoriaService.deleteAuditoriaByNombre(nombre);
    }
}
