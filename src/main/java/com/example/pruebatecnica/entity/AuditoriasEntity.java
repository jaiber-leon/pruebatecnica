package com.example.pruebatecnica.entity;

import com.example.pruebatecnica.enumers.Estado;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Entidad auditorias en Base de datos
 *
 */
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

    @NotEmpty(message = "El nombre no puede estar vacío")
    @Column(name = "nombre")
    @Size(min=3, message = "El nombre debe tener al menos 3 caracteres")
    private String nombre;

    @NotEmpty
    @Column(name = "ente_de_control")
    private String enteDeControl;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past(message = "La fecha de inicio debe ser anterior a la fecha de finalización")
    @Column(name = "fecha_de_inicio")
    @JsonFormat(pattern ="yyyy-MM-dd")
    private Date fechaDeInicio;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_de_finalizacion")
    @Future(message= "La fecha de inicio debe ser anterior a la fecha de finalización")
    private Date fechaDeFinalizacion;

    @Enumerated
    private Estado estado;
}
