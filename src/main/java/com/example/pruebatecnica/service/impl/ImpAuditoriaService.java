package com.example.pruebatecnica.service.impl;

import com.example.pruebatecnica.dto.AuditoriaDTO;
import com.example.pruebatecnica.entity.AuditoriasEntity;
import com.example.pruebatecnica.enumers.Estado;
import com.example.pruebatecnica.excepcions.ResourceNotFound;
import com.example.pruebatecnica.mapper.AuditoriasMapper;
import com.example.pruebatecnica.repository.IAuditoriaRepository;
import com.example.pruebatecnica.service.IAuditoriaService;
import com.example.pruebatecnica.util.Constante;
import jdk.jshell.execution.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class ImpAuditoriaService implements IAuditoriaService {
    @Autowired
    IAuditoriaRepository iAuditoriaRepository;

    @Autowired
    AuditoriasMapper auditoriasMapper;
    @Override
    public void updateAuditoria(Long idAuditorias,AuditoriasEntity auditoriasEntityact) {
        try{
        AuditoriasEntity auditoriasEntityupd = iAuditoriaRepository.findById(idAuditorias).orElseThrow(()-> new ResourceNotFound(Constante.ERROR_ID_NO_ENCONTRADO));
        auditoriasEntityupd.setNombre(auditoriasEntityact.getNombre());
        auditoriasEntityupd.setEnteDeControl(auditoriasEntityact.getEnteDeControl());
        auditoriasEntityupd.setFechaDeInicio(auditoriasEntityact.getFechaDeInicio());
        auditoriasEntityupd.setEstado(auditoriasEntityact.getEstado());
        if (auditoriasEntityupd.getEstado() == Estado.FINALIZADA){
            auditoriasEntityupd.setFechaDeFinalizacion(new Date());
        }
        iAuditoriaRepository.save(auditoriasEntityupd);
    }catch (Exception e){
            new ResourceNotFound(Constante.ERROR_ACTUALUZAR);
        }
    }

    @Override
    public void deleteAuditoriaById(Long idAuditorias) {
       try {
           iAuditoriaRepository.deleteById(idAuditorias);
       }catch (Exception e){
           throw new ResourceNotFound(Constante.ERROR_ID_NO_ENCONTRADO+idAuditorias);
       }
    }

    @Override
    public AuditoriaDTO findBynombre(String nombre) {
        AuditoriasEntity auditoriasEntity = iAuditoriaRepository.findByNombre(nombre);
        AuditoriaDTO auditoriaDTO = auditoriasMapper.convertirEntidadADTO(auditoriasEntity);
        return auditoriaDTO;
    }

    @Override
    public void deleteAuditoriaByNombre(String nombre) {
        iAuditoriaRepository.deleteByNombre(nombre);
    }

    @Override
    public AuditoriaDTO findById(Long idAuditoria) {
        AuditoriasEntity auditoria = iAuditoriaRepository.findById(idAuditoria)
                .orElseThrow(() -> new ResourceNotFound(Constante.ERROR_ID_NO_ENCONTRADO + idAuditoria));
        AuditoriaDTO auditoriaDTO = auditoriasMapper.convertirEntidadADTO(auditoria);
        return auditoriaDTO;
    }


    @Override
    public List<AuditoriaDTO> obtenerAuditorias() {
        List<AuditoriasEntity> auditoriasEntity = iAuditoriaRepository.findAll();
        List<AuditoriaDTO> auditoriaDTOList = new ArrayList<>();
        for (AuditoriasEntity auditoriasEntity1 : auditoriasEntity){
            AuditoriaDTO auditoriaDTO = auditoriasMapper.convertirEntidadADTO(auditoriasEntity1);
            auditoriaDTOList.add(auditoriaDTO);

        }
        return auditoriaDTOList;
    }

    @Override
    public AuditoriaDTO createAuditoria(AuditoriasEntity auditoriasEntity) {
        AuditoriasEntity auditoriasEntity1 = iAuditoriaRepository.save(auditoriasEntity);
        AuditoriaDTO auditoriaDTO = auditoriasMapper.convertirEntidadADTO(auditoriasEntity1);
        return auditoriaDTO;
    }


}
