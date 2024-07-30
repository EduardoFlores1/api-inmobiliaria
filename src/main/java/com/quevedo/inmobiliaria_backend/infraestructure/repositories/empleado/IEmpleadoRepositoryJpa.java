package com.quevedo.inmobiliaria_backend.infraestructure.repositories.empleado;

import com.quevedo.inmobiliaria_backend.infraestructure.entities.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEmpleadoRepositoryJpa extends JpaRepository<EmpleadoEntity, Long> {
    @Modifying
    @Query(nativeQuery = true, value = "UPDATE Empleados SET estado = false WHERE id_empleado = :id")
    void setEstadoFalse(@Param("id") Long id);
}
