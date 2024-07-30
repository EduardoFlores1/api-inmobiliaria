package com.quevedo.inmobiliaria_backend.infraestructure.repositories.contrato;

import com.quevedo.inmobiliaria_backend.domain.models.Contrato;
import com.quevedo.inmobiliaria_backend.domain.repositories.IContratoRepository;
import com.quevedo.inmobiliaria_backend.infraestructure.mappers.ContratoMapper;
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
    public List<Contrato> readAll() {
        return contratoRepositoryJpa.findAll()
                .stream().map(ContratoMapper::fromEntity)
                .toList();
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
}
