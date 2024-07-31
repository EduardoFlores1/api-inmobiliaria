package com.quevedo.inmobiliaria_backend.infraestructure.mappers;

import com.quevedo.inmobiliaria_backend.domain.models.Contrato;
import com.quevedo.inmobiliaria_backend.domain.models.Empleado;
import com.quevedo.inmobiliaria_backend.infraestructure.entities.EmpleadoEntity;
import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;

import java.time.LocalDateTime;
import java.util.List;

public class EmpleadoMapper {

    public static EmpleadoEntity toEntity(Empleado empleado) {
        return new EmpleadoEntity(
                empleado.getIdEmpleado(),
                empleado.getNombres(),
                empleado.getApellidos(),
                empleado.getDni(),
                empleado.getTelefono(),
                empleado.getDireccion(),
                empleado.getEmail(),
                empleado.getCargo(),
                empleado.getCreatedAt(),
                empleado.getUpdatedAt(),
                empleado.getEstado()
        );
    }

    public static Empleado fromEntity(EmpleadoEntity empleado) {
        return Empleado.builder()
                .idEmpleado(empleado.getIdEmpleado())
                .nombres(empleado.getNombres())
                .apellidos(empleado.getApellidos())
                .dni(empleado.getDni())
                .telefono(empleado.getTelefono())
                .direccion(empleado.getDireccion())
                .email(empleado.getEmail())
                .cargo(empleado.getCargo())
                .createdAt(empleado.getCreatedAt())
                .updatedAt(empleado.getUpdatedAt())
                .estado(empleado.getEstado())
                .build();
    }

    public static EmpleadoDTO toResponse(Empleado empleado) {
        return new EmpleadoDTO(
                empleado.getIdEmpleado(),
                empleado.getNombres(),
                empleado.getApellidos(),
                empleado.getDni(),
                empleado.getTelefono(),
                empleado.getDireccion(),
                empleado.getEmail(),
                empleado.getCargo(),
                empleado.getCreatedAt().toString(),
                empleado.getUpdatedAt().toString(),
                empleado.getEstado()
        );
    }

    public static EmpleadoDTO toResponseDetallado(Empleado empleado, List<Contrato> contratos) {
        return new EmpleadoDTO(
                empleado.getIdEmpleado(),
                empleado.getNombres(),
                empleado.getApellidos(),
                empleado.getDni(),
                empleado.getTelefono(),
                empleado.getDireccion(),
                empleado.getEmail(),
                empleado.getCargo(),
                empleado.getCreatedAt().toString(),
                empleado.getUpdatedAt().toString(),
                empleado.getEstado(),
                contratos.stream().map(ContratoMapper::toResponse).toList()
        );
    }

    public static Empleado fromResponse(EmpleadoDTO empleado) {
        return Empleado.builder()
                .idEmpleado(empleado.getIdEmpleado())
                .nombres(empleado.getNombres())
                .apellidos(empleado.getApellidos())
                .dni(empleado.getDni())
                .telefono(empleado.getTelefono())
                .direccion(empleado.getDireccion())
                .email(empleado.getEmail())
                .cargo(empleado.getCargo())
                .createdAt(LocalDateTime.parse(empleado.getCreatedAt()))
                .updatedAt(LocalDateTime.parse(empleado.getUpdatedAt()))
                .estado(empleado.getEstado())
                .build();
    }
}
