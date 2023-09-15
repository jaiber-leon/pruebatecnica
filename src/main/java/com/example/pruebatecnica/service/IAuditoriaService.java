package com.example.pruebatecnica.service;

import com.example.pruebatecnica.dto.AuditoriaDTO;
import com.example.pruebatecnica.entity.AuditoriasEntity;
import org.springframework.expression.spel.ast.OpAnd;

import java.util.List;
import java.util.Optional;

public interface IAuditoriaService {

    void updateAuditoria (Long idAuditorias, AuditoriasEntity auditoriasEntity);
    void deleteAuditoriaById (Long idAuditorias);
    AuditoriaDTO findBynombre (String nombre);
    void deleteAuditoriaByNombre (String nombre);

    AuditoriaDTO findById (Long idAuditoria);
    List<AuditoriaDTO> obtenerAuditorias ();
    AuditoriaDTO createAuditoria (AuditoriasEntity auditoriasEntity);
}
