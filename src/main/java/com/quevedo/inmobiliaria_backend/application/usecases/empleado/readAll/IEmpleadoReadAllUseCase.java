package com.quevedo.inmobiliaria_backend.application.usecases.empleado.readAll;

import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;
import com.quevedo.inmobiliaria_backend.presentation.dtos.generic.PageableDTO;
import org.springframework.data.domain.Page;

public interface IEmpleadoReadAllUseCase {
    Page<EmpleadoDTO> execute(PageableDTO pageableDTO);
}
