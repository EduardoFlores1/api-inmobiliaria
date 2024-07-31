package com.quevedo.inmobiliaria_backend.domain.repositories;

import com.quevedo.inmobiliaria_backend.domain.models.Contrato;

import java.util.List;

public interface IContratoRepository extends ICommonRepository<Contrato>{
    List<Contrato> readAllByEmpleadoId(Long id);
}
