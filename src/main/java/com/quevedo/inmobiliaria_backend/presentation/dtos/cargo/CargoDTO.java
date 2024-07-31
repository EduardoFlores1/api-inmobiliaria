package com.quevedo.inmobiliaria_backend.presentation.dtos.cargo;

import java.time.LocalDateTime;

public class CargoDTO {
    private Long idCargo;
    private String nombre;
    private String createdAt;
    private String updatedAt;
    private Boolean estado;

    public CargoDTO() {}

    public CargoDTO(Long idCargo, String nombre, String createdAt, String updatedAt, Boolean estado) {
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
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
        return "CargoDTO{" +
                "idCargo=" + idCargo +
                ", nombre='" + nombre + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", estado=" + estado +
                '}';
    }
}
