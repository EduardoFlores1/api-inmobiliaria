package com.quevedo.inmobiliaria_backend.application.usecases.empleado;

import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;

public interface IEmpleadoReadOneUseCase {
    EmpleadoDTO execute(Long id);
}
