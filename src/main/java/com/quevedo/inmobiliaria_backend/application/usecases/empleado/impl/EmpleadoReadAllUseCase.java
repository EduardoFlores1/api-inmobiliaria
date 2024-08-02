package com.quevedo.inmobiliaria_backend.application.usecases.empleado.impl;

import com.quevedo.inmobiliaria_backend.application.repositories.IEmpleadoRepository;
import com.quevedo.inmobiliaria_backend.application.usecases.empleado.IEmpleadoReadAllUseCase;
import com.quevedo.inmobiliaria_backend.helpers.pageable.PageableUtil;
import com.quevedo.inmobiliaria_backend.infraestructure.mappers.EmpleadoMapper;
import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;
import com.quevedo.inmobiliaria_backend.presentation.dtos.generic.PageableDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpleadoReadAllUseCase implements IEmpleadoReadAllUseCase {

    private final IEmpleadoRepository empleadoRepository;

    public EmpleadoReadAllUseCase(IEmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public Page<EmpleadoDTO> execute(PageableDTO pageableDTO) {
        return empleadoRepository.readAll(PageableUtil.getPageable(pageableDTO))
                .map(EmpleadoMapper::toResponse);
    }
}
