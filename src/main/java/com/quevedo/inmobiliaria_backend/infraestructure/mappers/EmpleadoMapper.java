package com.quevedo.inmobiliaria_backend.infraestructure.mappers;

import com.quevedo.inmobiliaria_backend.domain.models.Empleado;
import com.quevedo.inmobiliaria_backend.infraestructure.entities.EmpleadoEntity;

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
}
