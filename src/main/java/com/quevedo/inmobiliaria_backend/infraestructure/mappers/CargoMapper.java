package com.quevedo.inmobiliaria_backend.infraestructure.mappers;

import com.quevedo.inmobiliaria_backend.domain.models.Cargo;
import com.quevedo.inmobiliaria_backend.infraestructure.entities.CargoEntity;

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
}
