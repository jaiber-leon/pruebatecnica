package com.example.pruebatecnica.entity;

import com.example.pruebatecnica.enumers.Estado;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "auditorias")
public class AuditoriasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuditorias;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "ente_de_control")
    private String enteDeControl;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_de_inicio")
    private Date fechaDeInicio;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_de_finalizacion")
    private Date fechaDeFinalizacion;
    @Enumerated
    private Estado estado;
}
