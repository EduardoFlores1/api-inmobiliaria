package com.quevedo.inmobiliaria_backend.application.usecases.empleado.delete;

import com.quevedo.inmobiliaria_backend.domain.models.Empleado;
import com.quevedo.inmobiliaria_backend.application.repositories.IEmpleadoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EmpleadoDeleteUseCase implements IEmpleadoDeleteUseCase {

    private final IEmpleadoRepository empleadoRepository;

    public EmpleadoDeleteUseCase(IEmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Transactional
    @Override
    public void execute(Long id) {
        Optional<Empleado> opt = empleadoRepository.readById(id);
        if (opt.isPresent()) {
            empleadoRepository.delete(id);
        }
        throw new EntityNotFoundException(id.toString());
    }
}
