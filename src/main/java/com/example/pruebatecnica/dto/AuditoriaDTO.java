package com.example.pruebatecnica.dto;

import com.example.pruebatecnica.enumers.Estado;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuditoriaDTO {
    private Long idAuditorias;
    private String nombre;
    private String enteDeControl;
    private Date fechaDeInicio;
    private Date fechaDeFinalizacion;
    private Estado estado;
}
