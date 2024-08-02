package com.quevedo.inmobiliaria_backend.application.usecases.empleado;

import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;

public interface IEmpleadoUpdateUseCase {
    void execute(Long id, EmpleadoDTO empleado);
}
