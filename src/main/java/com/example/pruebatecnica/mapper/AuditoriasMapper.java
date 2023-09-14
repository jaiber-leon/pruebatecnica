package com.example.pruebatecnica.mapper;

import com.example.pruebatecnica.dto.AuditoriaDTO;
import com.example.pruebatecnica.entity.AuditoriasEntity;
import org.springframework.stereotype.Service;

@Service
public class AuditoriasMapper {

    public AuditoriaDTO convertirEntidadADTO (AuditoriasEntity auditoriasEntity){
        return AuditoriaDTO.builder()
                .idAuditorias(auditoriasEntity.getIdAuditorias())
                .nombre(auditoriasEntity.getNombre())
                .enteDeControl(auditoriasEntity.getEnteDeControl())
                .fechaDeInicio(auditoriasEntity.getFechaDeInicio())
                .fechaDeFinalizacion(auditoriasEntity.getFechaDeFinalizacion())
                .estado(auditoriasEntity.getEstado())
                .build();
    }

    public AuditoriasEntity convertirDTOAEntidad (AuditoriaDTO auditoriaDTO){
        AuditoriasEntity auditoriasEntity = new AuditoriasEntity();
        auditoriasEntity.setIdAuditorias(auditoriaDTO.getIdAuditorias());
        auditoriasEntity.setNombre(auditoriaDTO.getNombre());
        auditoriasEntity.setEnteDeControl(auditoriaDTO.getEnteDeControl());
        auditoriasEntity.setFechaDeInicio(auditoriaDTO.getFechaDeInicio());
        auditoriasEntity.setFechaDeFinalizacion(auditoriaDTO.getFechaDeFinalizacion());
        auditoriasEntity.setEstado(auditoriaDTO.getEstado());
        return auditoriasEntity;
    }
}
