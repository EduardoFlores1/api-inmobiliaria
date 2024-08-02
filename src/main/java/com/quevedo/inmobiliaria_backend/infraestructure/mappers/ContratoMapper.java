package com.quevedo.inmobiliaria_backend.infraestructure.mappers;

import com.quevedo.inmobiliaria_backend.domain.models.Contrato;
import com.quevedo.inmobiliaria_backend.infraestructure.entities.ContratoEntity;
import com.quevedo.inmobiliaria_backend.presentation.dtos.contrato.ContratoDTO;

public class ContratoMapper {

    public static ContratoEntity toEntity(Contrato contrato) {
        return new ContratoEntity(
                contrato.getIdContrato(),
                EmpleadoMapper.toEntity(contrato.getEmpleado()),
                contrato.getFechaInicio(),
                contrato.getFechaFin(),
                contrato.getTipoContrato(),
                CargoMapper.toEntity(contrato.getCargo()),
                contrato.getCreateAt(),
                contrato.getEstado()
        );
    }

    public static Contrato fromEntity(ContratoEntity contrato) {
        return Contrato.builder()
                .idContrato(contrato.getIdContrato())
                .empleado(EmpleadoMapper.fromEntity(contrato.getEmpleado()))
                .fechaInicio(contrato.getFechaInicio())
                .fechaFin(contrato.getFechaFin())
                .tipoContrato(contrato.getTipoContrato())
                .cargo(CargoMapper.fromEntity(contrato.getCargo()))
                .createAt(contrato.getCreatedAt())
                .estado(contrato.getEstado())
                .build();
    }

    public static ContratoDTO toResponse(Contrato contrato) {
        return new ContratoDTO(
                contrato.getIdContrato(),
                contrato.getFechaInicio().toString(),
                contrato.getFechaFin().toString(),
                contrato.getTipoContrato(),
                CargoMapper.toResponse(contrato.getCargo()),
                contrato.getCreateAt().toString(),
                contrato.getEstado()
        );
    }
}
