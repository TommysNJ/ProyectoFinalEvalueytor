package com.udla.evaluaytor.businessdomain.evaluacion.dto;

import lombok.Data;

@Data
public class DetalleFormularioCreateUpdateDTO {
    private int cumplimiento;
    private String observacion;
    private Long estadoDetalleId;
    private Long documentoId;
    private Long formularioId; 
    private Long id_matrizevaluacion; 

}
