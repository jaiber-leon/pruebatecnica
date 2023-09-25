package com.example.pruebatecnica.entity;

import com.example.pruebatecnica.enumers.Estado;
import com.example.pruebatecnica.util.Constante;
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

    @NotEmpty(message = Constante.EL_NOMBRE_NO_PUEDE_ESTAR_VACIO)
    @Column(name = "nombre")
    @Size(min=3, message = Constante.MINIMO_DE_CARACTERES_DE_NOMBRE)
    private String nombre;

    @NotEmpty
    @Column(name = "ente_de_control")
    private String enteDeControl;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past(message = Constante.FECHA_DE_INICIO_DEBE_SER_ANTERIOR_A_LA_DE_FINALIZACION)
    @Column(name = "fecha_de_inicio")
    @JsonFormat(pattern ="yyyy-MM-dd")
    private Date fechaDeInicio;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "fecha_de_finalizacion")
    @Future(message=Constante.FECHA_DE_INICIO_DEBE_SER_ANTERIOR_A_LA_DE_FINALIZACION)
    private Date fechaDeFinalizacion;

    @Enumerated
    private Estado estado;
}
