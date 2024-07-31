package com.quevedo.inmobiliaria_backend.infraestructure.repositories.contrato;

import com.quevedo.inmobiliaria_backend.infraestructure.entities.ContratoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IContratoRepositoryJpa extends JpaRepository<ContratoEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM Contratos WHERE empleado_id = :id")
    List<ContratoEntity> contratosByEmpleadoId(@Param("id") Long id);

    @Modifying
    @Query(nativeQuery = true, value = "UPDATE Contratos SET estado = false WHERE id_contrato = :id")
    void setEstadoFalse(@Param("id") Long id);
}
