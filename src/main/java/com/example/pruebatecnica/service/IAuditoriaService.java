package com.example.pruebatecnica.service;

import com.example.pruebatecnica.entity.AuditoriasEntity;

import java.util.List;

public interface IAuditoriaService {

    void updateAuditoria (AuditoriasEntity auditoriasEntity);
    void deleteAuditoriaById (Long idAuditorias);
    AuditoriasEntity createAuditoria ();

    List<AuditoriasEntity> getAllAudiorias();
}
