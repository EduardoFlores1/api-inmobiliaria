package com.quevedo.inmobiliaria_backend.presentation.dtos.contrato;

import com.quevedo.inmobiliaria_backend.domain.enums.TipoContrato;
import com.quevedo.inmobiliaria_backend.presentation.dtos.cargo.CargoDTO;

public class ContratoDTO {
    private Long idContrato;
    private String fechaInicio;
    private String fechaFin;
    private TipoContrato tipoContrato;
    private CargoDTO cargo;
    private String createAt;
    private Boolean estado;

    public ContratoDTO() {}

    public ContratoDTO(Long idContrato, String fechaInicio, String fechaFin, TipoContrato tipoContrato, CargoDTO cargo, String createAt, Boolean estado) {
        this.idContrato = idContrato;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoContrato = tipoContrato;
        this.cargo = cargo;
        this.createAt = createAt;
        this.estado = estado;
    }

    public Long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public CargoDTO getCargo() {
        return cargo;
    }

    public void setCargo(CargoDTO cargo) {
        this.cargo = cargo;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
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
        return "ContratoDTO{" +
                "idContrato=" + idContrato +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", tipoContrato=" + tipoContrato +
                ", cargo=" + cargo +
                ", createAt='" + createAt + '\'' +
                ", estado=" + estado +
                '}';
    }
}
