package com.quevedo.inmobiliaria_backend.infraestructure.entities;

import com.quevedo.inmobiliaria_backend.domain.enums.TipoContrato;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "contratos")
public class ContratoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato")
    private Long idContrato;
    @ManyToOne
    @JoinColumn(name = "empleado_id", nullable = false)
    private EmpleadoEntity empleado;
    @Column(name = "fecha_inicio", nullable = false)
    private LocalDateTime fechaInicio;
    @Column(name = "fecha_fin", nullable = false)
    private LocalDateTime fechaFin;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_contrato", nullable = false)
    private TipoContrato tipoContrato;
    @ManyToOne
    @JoinColumn(name = "cargo_id", nullable = false)
    private CargoEntity cargo;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "estado", nullable = false)
    private Boolean estado;

    public ContratoEntity() {
    }

    public ContratoEntity(Long idContrato, EmpleadoEntity empleado, LocalDateTime fechaInicio, LocalDateTime fechaFin, TipoContrato tipoContrato, CargoEntity cargo, LocalDateTime createdAt, Boolean estado) {
        this.idContrato = idContrato;
        this.empleado = empleado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoContrato = tipoContrato;
        this.cargo = cargo;
        this.createdAt = createdAt;
        this.estado = estado;
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public EmpleadoEntity getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EmpleadoEntity empleado) {
        this.empleado = empleado;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public CargoEntity getCargo() {
        return cargo;
    }

    public void setCargo(CargoEntity cargo) {
        this.cargo = cargo;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ContratoEntity{" +
                "idContrato=" + idContrato +
                ", empleado=" + empleado +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", tipoContrato=" + tipoContrato +
                ", cargo=" + cargo +
                ", createdAt=" + createdAt +
                ", estado=" + estado +
                '}';
    }
}
