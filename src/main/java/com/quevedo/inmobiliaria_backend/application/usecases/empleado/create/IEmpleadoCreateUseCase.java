package com.quevedo.inmobiliaria_backend.application.usecases.empleado.create;

import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoCreateDTO;

public interface IEmpleadoCreateUseCase {
    void execute(EmpleadoCreateDTO empleado);
}
