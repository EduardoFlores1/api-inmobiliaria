package com.quevedo.inmobiliaria_backend.application.usecases.empleado.update;

import com.quevedo.inmobiliaria_backend.domain.models.Empleado;
import com.quevedo.inmobiliaria_backend.domain.repositories.IEmpleadoRepository;
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
            empleado.setIdEmpleado(id);
            empleadoRepository.save(EmpleadoMapper.fromResponse(empleado));
        }
        throw new EntityNotFoundException(id.toString());
    }
}
