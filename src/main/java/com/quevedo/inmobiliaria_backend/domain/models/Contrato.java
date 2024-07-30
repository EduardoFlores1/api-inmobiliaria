package com.quevedo.inmobiliaria_backend.domain.models;

import com.quevedo.inmobiliaria_backend.domain.enums.TipoContrato;
import com.quevedo.inmobiliaria_backend.helpers.builder.IBuilder;

import java.time.LocalDateTime;

public class Contrato {
    private Long idContrato;
    private Empleado empleado;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private TipoContrato tipoContrato;
    private Cargo cargo;
    private LocalDateTime createAt;
    private Boolean estado;

    public Contrato() {
    }

    public Contrato(Builder builder) {
        this.idContrato = builder.idContrato;
        this.empleado = builder.empleado;
        this.fechaInicio = builder.fechaInicio;
        this.fechaFin = builder.fechaFin;
        this.tipoContrato = builder.tipoContrato;
        this.cargo = builder.cargo;
        this.createAt = builder.createAt;
        this.estado = builder.estado;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements IBuilder<Contrato> {
        private Long idContrato;
        private Empleado empleado;
        private LocalDateTime fechaInicio;
        private LocalDateTime fechaFin;
        private TipoContrato tipoContrato;
        private Cargo cargo;
        private LocalDateTime createAt;
        private Boolean estado;

        public Builder() {}

        public Builder idContrato(Long idContrato) {
            this.idContrato = idContrato;
            return this;
        }
        public Builder empleado(Empleado empleado) {
            this.empleado = empleado;
            return this;
        }
        public Builder fechaInicio(LocalDateTime fechaInicio) {
            this.fechaInicio = fechaInicio;
            return this;
        }
        public Builder fechaFin(LocalDateTime fechaFin) {
            this.fechaFin = fechaFin;
            return this;
        }
        public Builder tipoContrato(TipoContrato tipoContrato) {
            this.tipoContrato = tipoContrato;
            return this;
        }
        public Builder cargo(Cargo cargo) {
            this.cargo = cargo;
            return this;
        }
        public Builder createAt(LocalDateTime createAt) {
            this.createAt = createAt;
            return this;
        }
        public Builder estado(Boolean estado) {
            this.estado = estado;
            return this;
        }

        @Override
        public Contrato build() {
            return new Contrato(this);
        }
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "idContrato=" + idContrato +
                ", empleado=" + empleado +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", tipoContrato=" + tipoContrato +
                ", cargo=" + cargo +
                ", createAt=" + createAt +
                ", estado=" + estado +
                '}';
    }
}
