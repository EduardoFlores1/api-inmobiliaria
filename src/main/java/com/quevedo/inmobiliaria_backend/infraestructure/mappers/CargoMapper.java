package com.quevedo.inmobiliaria_backend.infraestructure.mappers;

import com.quevedo.inmobiliaria_backend.domain.models.Cargo;
import com.quevedo.inmobiliaria_backend.infraestructure.entities.CargoEntity;
import com.quevedo.inmobiliaria_backend.presentation.dtos.cargo.CargoDTO;

import java.time.LocalDateTime;

public class CargoMapper {

    public static CargoEntity toEntity(Cargo cargo) {
        return new CargoEntity(
                cargo.getIdCargo(),
                cargo.getNombre(),
                cargo.getCreatedAt(),
                cargo.getUpdatedAt(),
                cargo.getEstado()
        );
    }

    public static Cargo fromEntity(CargoEntity cargo) {
        return new Cargo(
                cargo.getIdCargo(),
                cargo.getNombre(),
                cargo.getCreatedAt(),
                cargo.getUpdatedAt(),
                cargo.getEstado()
        );
    }

    public static CargoDTO toResponse(Cargo cargo) {
        return new CargoDTO(
                cargo.getIdCargo(),
                cargo.getNombre(),
                cargo.getCreatedAt().toString(),
                cargo.getUpdatedAt().toString(),
                cargo.getEstado()
        );
    }

    public static Cargo fromResponse(CargoDTO cargo) {
        return new Cargo(
                cargo.getIdCargo(),
                cargo.getNombre(),
                LocalDateTime.parse(cargo.getCreatedAt()),
                LocalDateTime.parse(cargo.getUpdatedAt()),
                cargo.getEstado()
        );
    }
}
