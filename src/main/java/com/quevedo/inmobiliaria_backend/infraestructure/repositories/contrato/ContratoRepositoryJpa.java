package com.quevedo.inmobiliaria_backend.infraestructure.repositories.contrato;

import com.quevedo.inmobiliaria_backend.domain.models.Contrato;
import com.quevedo.inmobiliaria_backend.application.repositories.IContratoRepository;
import com.quevedo.inmobiliaria_backend.infraestructure.mappers.ContratoMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ContratoRepositoryJpa implements IContratoRepository {

    private final IContratoRepositoryJpa contratoRepositoryJpa;

    public ContratoRepositoryJpa(IContratoRepositoryJpa contratoRepositoryJpa) {
        this.contratoRepositoryJpa = contratoRepositoryJpa;
    }

    @Override
    public Page<Contrato> readAll(Pageable pageable) {
        return contratoRepositoryJpa.findAll(pageable)
                .map(ContratoMapper::fromEntity);
    }

    @Override
    public Optional<Contrato> readById(Long id) {
        return contratoRepositoryJpa.findById(id).map(ContratoMapper::fromEntity);
    }

    @Override
    public void save(Contrato contrato) {
        contratoRepositoryJpa.save(ContratoMapper.toEntity(contrato));
    }

    @Override
    public void delete(Long id) {
        contratoRepositoryJpa.setEstadoFalse(id);
    }

    @Override
    public List<Contrato> readAllByEmpleadoId(Long id) {
        return contratoRepositoryJpa.contratosByEmpleadoId(id)
                .stream()
                .map(ContratoMapper::fromEntity)
                .toList();
    }
}
