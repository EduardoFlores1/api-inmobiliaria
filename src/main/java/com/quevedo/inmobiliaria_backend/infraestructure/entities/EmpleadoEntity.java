package com.quevedo.inmobiliaria_backend.infraestructure.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "empleados")
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long idEmpleado;
    @Column(name = "nombres", nullable = false)
    private String nombres;
    @Column(name = "apellidos", nullable = false)
    private String apellidos;
    @Column(name = "dni", nullable = false, unique = true)
    private String dni;
    @Column(name = "telefono", nullable = false, unique = true)
    private String telefono;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
    @Column(name = "cargo", nullable = false)
    private String cargo;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
    @Column(name = "estado", nullable = false)
    private Boolean estado;

    public EmpleadoEntity() {
    }

    public EmpleadoEntity(Long idEmpleado, String nombres, String apellidos, String dni, String telefono, String direccion, String email, String cargo, LocalDateTime createdAt, LocalDateTime updatedAt, Boolean estado) {
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
        return "EmpleadoEntity{" +
                "idEmpleado=" + idEmpleado +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", estado=" + estado +
                '}';
    }
}
