package com.quevedo.inmobiliaria_backend.presentation.dtos.contrato;

import com.quevedo.inmobiliaria_backend.presentation.dtos.cargo.CargoDTO;

public record ContratoCreateDTO(
        String fechaInicio,
        String fechaFin,
        String tipoContrato,
        CargoDTO cargo,
        String createAt,
        Boolean estado
) {
}
