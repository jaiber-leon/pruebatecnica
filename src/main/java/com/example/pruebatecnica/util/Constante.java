package com.example.pruebatecnica.util;

/**
 * Clase Constantes
 *
 * @author Jaiber Antonio
 */
public class Constante {

    /** endpoints */

    public static final  String PATH_AUDITORIAS = "/auditorias";
    public static final String PATH_ACTUALIZAR = "/actualizat";
    /** Mensajes de error */
    public static final String ERROR_ID_NO_ENCONTRADO= "Auditoria no encontrada con ID: ";
    public static final String ERROR_ACTUALUZAR = "no se pudo actualizar";


    /** Validaciones */

    public static final String EL_NOMBRE_NO_PUEDE_ESTAR_VACIO = "El nombre no puede estar vacío";
    public static final String MINIMO_DE_CARACTERES_DE_NOMBRE = "El nombre debe tener al menos 3 caracteres";
    public static final String FECHA_DE_INICIO_DEBE_SER_ANTERIOR_A_LA_DE_FINALIZACION = "La fecha de inicio debe ser anterior a la fecha de finalización";
}
