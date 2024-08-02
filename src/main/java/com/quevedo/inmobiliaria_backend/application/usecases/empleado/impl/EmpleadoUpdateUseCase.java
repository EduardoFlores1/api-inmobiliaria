package com.quevedo.inmobiliaria_backend.application.usecases.empleado.impl;

import com.quevedo.inmobiliaria_backend.application.usecases.empleado.IEmpleadoUpdateUseCase;
import com.quevedo.inmobiliaria_backend.domain.models.Empleado;
import com.quevedo.inmobiliaria_backend.application.repositories.IEmpleadoRepository;
import com.quevedo.inmobiliaria_backend.infraestructure.mappers.EmpleadoMapper;
import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EmpleadoUpdateUseCase implements IEmpleadoUpdateUseCase {

    private final IEmpleadoRepository empleadoRepository;

    public EmpleadoUpdateUseCase(IEmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Transactional
    @Override
    public void execute(Long id, EmpleadoDTO empleado) {
        Optional<Empleado> opt = empleadoRepository.readById(id);
        if (opt.isPresent()) {
            // no cambian o no se alteran en este metodo
            empleado.setIdEmpleado(id);
            empleado.setEstado(opt.get().getEstado());
            empleado.setCargo(opt.get().getCargo());
            empleadoRepository.save(EmpleadoMapper.fromResponse(empleado));
        }
        throw new EntityNotFoundException(id.toString());
    }
}
