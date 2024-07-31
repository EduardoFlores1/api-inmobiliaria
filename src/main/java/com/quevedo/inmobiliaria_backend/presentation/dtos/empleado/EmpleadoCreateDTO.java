package com.quevedo.inmobiliaria_backend.presentation.dtos.empleado;

import com.quevedo.inmobiliaria_backend.presentation.dtos.contrato.ContratoCreateDTO;

public record EmpleadoCreateDTO(
        String nombres,
        String apellidos,
        String dni,
        String telefono,
        String direccion,
        String email,
        String cargo,
        String createdAt,
        String updatedAt,
        Boolean estado,
        ContratoCreateDTO contrato) {
}
