package com.quevedo.inmobiliaria_backend.application.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICommonRepository<T> {
    Page<T> readAll(Pageable pageable);
    Optional<T> readById(Long id);
    void save(T t);
    void delete(Long id);
}
