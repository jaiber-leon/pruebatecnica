package com.example.pruebatecnica.service.impl;

import com.example.pruebatecnica.dto.AuditoriaDTO;
import com.example.pruebatecnica.entity.AuditoriasEntity;
import com.example.pruebatecnica.enumers.Estado;
import com.example.pruebatecnica.excepcions.ResourceNotFound;
import com.example.pruebatecnica.mapper.AuditoriasMapper;
import com.example.pruebatecnica.repository.IAuditoriaRepository;
import com.example.pruebatecnica.service.IAuditoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ImpAuditoriaService implements IAuditoriaService {
    @Autowired
    IAuditoriaRepository iAuditoriaRepository;

    @Autowired
    AuditoriasMapper auditoriasMapper;
    @Override
    public void updateAuditoria(Long idAuditorias,AuditoriasEntity auditoriasEntityact) {
        try{

        AuditoriasEntity auditoriasEntityupd = iAuditoriaRepository.findById(idAuditorias).orElseThrow(()-> new ResourceNotFound("no se encontro"));
        auditoriasEntityupd.setNombre(auditoriasEntityact.getNombre());
        auditoriasEntityupd.setEnteDeControl(auditoriasEntityact.getEnteDeControl());
        auditoriasEntityupd.setFechaDeInicio(auditoriasEntityact.getFechaDeInicio());
        auditoriasEntityupd.setEstado(auditoriasEntityact.getEstado());
        if (auditoriasEntityupd.getEstado() == Estado.FINALIZADA){
            auditoriasEntityupd.setFechaDeFinalizacion(new Date());
        }
        iAuditoriaRepository.save(auditoriasEntityupd);
    }catch (Exception e){
            new ResourceNotFound("no se pudo actualizar");
        }
    }

    @Override
    public void deleteAuditoriaById(Long idAuditorias) {
       try {
           iAuditoriaRepository.deleteById(idAuditorias);
       }catch (Exception e){
           throw new ResourceNotFound("No se encontro la auditoria con el id: "+idAuditorias);
       }
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
    public AuditoriaDTO createAuditoria() {
        return null;
    }


}
