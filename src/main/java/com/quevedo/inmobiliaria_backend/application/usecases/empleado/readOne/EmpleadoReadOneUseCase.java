package com.quevedo.inmobiliaria_backend.application.usecases.empleado.readOne;

import com.quevedo.inmobiliaria_backend.domain.models.Contrato;
import com.quevedo.inmobiliaria_backend.domain.models.Empleado;
import com.quevedo.inmobiliaria_backend.domain.repositories.IContratoRepository;
import com.quevedo.inmobiliaria_backend.domain.repositories.IEmpleadoRepository;
import com.quevedo.inmobiliaria_backend.infraestructure.mappers.EmpleadoMapper;
import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoReadOneUseCase implements IEmpleadoReadOneUseCase {

    private final IEmpleadoRepository empleadoRepository;
    private final IContratoRepository contratoRepository;

    public EmpleadoReadOneUseCase(IEmpleadoRepository empleadoRepository, IContratoRepository contratoRepository) {
        this.empleadoRepository = empleadoRepository;
        this.contratoRepository = contratoRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public EmpleadoDTO execute(Long id) {
        Optional<Empleado> opt = empleadoRepository.readById(id);
        if (opt.isPresent()) {
            List<Contrato> contratos = contratoRepository.readAllByEmpleadoId(id);
            return EmpleadoMapper.toResponseDetallado(opt.get(), contratos);
        }
        throw new EntityNotFoundException(id.toString());
    }
}
