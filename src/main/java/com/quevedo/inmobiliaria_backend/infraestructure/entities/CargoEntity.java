package com.quevedo.inmobiliaria_backend.infraestructure.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cargos")
public class CargoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargo")
    private Long idCargo;
    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
    @Column(name = "estado", nullable = false)
    private Boolean estado;

    public CargoEntity() {
    }

    public CargoEntity(Long idCargo, String nombre, LocalDateTime createdAt, LocalDateTime updatedAt, Boolean estado) {
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
        return "CargoEntity{" +
                "idCargo=" + idCargo +
                ", nombre='" + nombre + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", estado=" + estado +
                '}';
    }
}
