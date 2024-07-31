package com.quevedo.inmobiliaria_backend.application.usecases.empleado.readAll;

import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;

import java.util.List;

public interface IEmpleadoReadAllUseCase {
    List<EmpleadoDTO> execute();
}
