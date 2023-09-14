package com.example.pruebatecnica.service;

import com.example.pruebatecnica.entity.AuditoriasEntity;

import java.util.List;

public interface IAuditoriaService {

    void updateAuditoria (Long idAuditorias, AuditoriasEntity auditoriasEntity);
    void deleteAuditoriaById (Long idAuditorias);

    List<AuditoriasEntity> obtenerAuditorias ();
    AuditoriasEntity createAuditoria ();

    List<AuditoriasEntity> getAllAudiorias();
}
