package com.quevedo.inmobiliaria_backend.infraestructure.repositories.empleado;

import com.quevedo.inmobiliaria_backend.domain.models.Empleado;
import com.quevedo.inmobiliaria_backend.domain.repositories.IEmpleadoRepository;
import com.quevedo.inmobiliaria_backend.infraestructure.mappers.EmpleadoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmpleadoRepositoryJpa implements IEmpleadoRepository {

    private final IEmpleadoRepositoryJpa empleadoRepositoryJpa;

    public EmpleadoRepositoryJpa(IEmpleadoRepositoryJpa empleadoRepositoryJpa) {
        this.empleadoRepositoryJpa = empleadoRepositoryJpa;
    }

    @Override
    public List<Empleado> readAll() {
        return empleadoRepositoryJpa.findAll()
                .stream()
                .map(EmpleadoMapper::fromEntity)
                .toList();
    }

    @Override
    public Optional<Empleado> readById(Long id) {
        return empleadoRepositoryJpa.findById(id).map(EmpleadoMapper::fromEntity);
    }

    @Override
    public void save(Empleado empleado) {
        empleadoRepositoryJpa.save(EmpleadoMapper.toEntity(empleado));
    }

    @Override
    public void delete(Long id) {
        empleadoRepositoryJpa.setEstadoFalse(id);
    }
}
