package com.quevedo.inmobiliaria_backend.domain.repositories;

import java.util.List;
import java.util.Optional;

public interface ICommonRepository<T> {
    List<T> readAll();
    Optional<T> readById(Long id);
    void save(T t);
    void delete(Long id);
}
