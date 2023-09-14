package com.example.pruebatecnica.entity;

import com.example.pruebatecnica.enumers.Estado;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuditoriasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuditorias;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ente_de_control")
    private String enteDeControl;
    @Column(name = "fecha_de_inicio")
    private Date fechaDeInicio;
    @Column(name = "fecha_de_finalizacion")
    private Date fechaDeFinalizacion;
    @Enumerated
    private Estado estado;
}
