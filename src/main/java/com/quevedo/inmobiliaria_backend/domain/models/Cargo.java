package com.quevedo.inmobiliaria_backend.domain.models;

import java.time.LocalDateTime;

public class Cargo {
    private Long idCargo;
    private String nombre;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean estado;

    public Cargo() {
    }

    public Cargo(Long idCargo, String nombre, LocalDateTime createdAt, LocalDateTime updatedAt, Boolean estado) {
        this.idCargo = idCargo;
        this.nombre = nombre;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.estado = estado;
    }

    public Long getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Long idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "idCargo=" + idCargo +
                ", nombre='" + nombre + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", estado=" + estado +
                '}';
    }
}
