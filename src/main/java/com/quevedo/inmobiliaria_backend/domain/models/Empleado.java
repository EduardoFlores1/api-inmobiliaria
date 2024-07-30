package com.quevedo.inmobiliaria_backend.domain.models;

import com.quevedo.inmobiliaria_backend.helpers.builder.IBuilder;

import java.time.LocalDateTime;

public class Empleado {
    private Long idEmpleado;
    private String nombres;
    private String apellidos;
    private String dni;
    private String telefono;
    private String direccion;
    private String email;
    private String cargo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Boolean estado;

    public Empleado() {}

    public Empleado(Builder builder) {
        this.idEmpleado = builder.idEmpleado;
        this.nombres = builder.nombres;
        this.apellidos = builder.apellidos;
        this.dni = builder.dni;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
        this.email = builder.email;
        this.cargo = builder.cargo;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.estado = builder.estado;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements IBuilder<Empleado> {
        private Long idEmpleado;
        private String nombres;
        private String apellidos;
        private String dni;
        private String telefono;
        private String direccion;
        private String email;
        private String cargo;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private Boolean estado;

        public Builder() {}

        public Builder idEmpleado(Long idEmpleado) {
            this.idEmpleado = idEmpleado;
            return this;
        }
        public Builder nombres(String nombres) {
            this.nombres = nombres;
            return this;
        }
        public Builder apellidos(String apellidos) {
            this.apellidos = apellidos;
            return this;
        }
        public Builder dni(String dni) {
            this.dni = dni;
            return this;
        }
        public Builder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }
        public Builder direccion(String direccion) {
            this.direccion = direccion;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder cargo(String cargo) {
            this.cargo = cargo;
            return this;
        }
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Builder estado(Boolean estado) {
            this.estado = estado;
            return this;
        }

        @Override
        public Empleado build() {
            return new Empleado(this);
        }
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
        return "Empleado{" +
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
