package com.quevedo.inmobiliaria_backend.application.usecases.empleado.update;

import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;

public interface IEmpleadoUpdateUseCase {
    void execute(Long id, EmpleadoDTO empleado);
}
