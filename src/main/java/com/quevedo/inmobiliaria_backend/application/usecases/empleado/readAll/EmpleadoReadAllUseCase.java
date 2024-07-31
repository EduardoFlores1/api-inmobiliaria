package com.quevedo.inmobiliaria_backend.application.usecases.empleado.readAll;

import com.quevedo.inmobiliaria_backend.domain.repositories.IEmpleadoRepository;
import com.quevedo.inmobiliaria_backend.infraestructure.mappers.EmpleadoMapper;
import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpleadoReadAllUseCase implements IEmpleadoReadAllUseCase{

    private final IEmpleadoRepository empleadoRepository;

    public EmpleadoReadAllUseCase(IEmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<EmpleadoDTO> execute() {
        return empleadoRepository.readAll()
                .stream()
                .map(EmpleadoMapper::toResponse)
                .toList();
    }
}
