package com.quevedo.inmobiliaria_backend.presentation.dtos.empleado;

import com.quevedo.inmobiliaria_backend.presentation.dtos.contrato.ContratoDTO;

import java.util.List;

public class EmpleadoDTO {
    private Long idEmpleado;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String direccion;
    private String email;
    private String cargo;
    private String createdAt;
    private String updatedAt;
    private Boolean estado;
    private List<ContratoDTO> contratos;

    public EmpleadoDTO() {}

    public EmpleadoDTO(Long idEmpleado, String nombres, String apellidos, String dni, String telefono, String direccion, String email, String cargo, String createdAt, String updatedAt, Boolean estado) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.cargo = cargo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.estado = estado;
    }

    public EmpleadoDTO(Long idEmpleado, String nombres, String apellidos, String dni, String telefono, String direccion, String email, String cargo, String createdAt, String updatedAt, Boolean estado, List<ContratoDTO> contratos) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.cargo = cargo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.estado = estado;
        this.contratos = contratos;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public List<ContratoDTO> getContratos() {
        return contratos;
    }

    public void setContratos(List<ContratoDTO> contratos) {
        this.contratos = contratos;
    }

    @Override
    public String toString() {
        return "EmpleadoDTO{" +
                "idEmpleado=" + idEmpleado +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", estado=" + estado +
                '}';
    }
}
