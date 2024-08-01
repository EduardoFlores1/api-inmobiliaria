package com.quevedo.inmobiliaria_backend.application.usecases.empleado.create;

import com.quevedo.inmobiliaria_backend.domain.enums.TipoContrato;
import com.quevedo.inmobiliaria_backend.domain.models.Contrato;
import com.quevedo.inmobiliaria_backend.domain.models.Empleado;
import com.quevedo.inmobiliaria_backend.application.repositories.IContratoRepository;
import com.quevedo.inmobiliaria_backend.application.repositories.IEmpleadoRepository;
import com.quevedo.inmobiliaria_backend.infraestructure.mappers.CargoMapper;
import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoCreateDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class EmpleadoCreateUseCase implements IEmpleadoCreateUseCase{

    private final IEmpleadoRepository empleadoRepository;
    private final IContratoRepository contratoRepository;

    public EmpleadoCreateUseCase(IEmpleadoRepository empleadoRepository, IContratoRepository contratoRepository) {
        this.empleadoRepository = empleadoRepository;
        this.contratoRepository = contratoRepository;
    }

    @Transactional
    @Override
    public void execute(EmpleadoCreateDTO empleado) {
        Empleado empleadoCreate = Empleado.builder()
                .nombres(empleado.nombres())
                .apellidos(empleado.apellidos())
                .dni(empleado.dni())
                .telefono(empleado.telefono())
                .direccion(empleado.direccion())
                .email(empleado.email())
                .cargo(empleado.cargo())
                .createdAt(LocalDateTime.parse(empleado.createdAt()))
                .updatedAt(LocalDateTime.parse(empleado.updatedAt()))
                .estado(true)
                .build();
        empleadoRepository.save(empleadoCreate);

        contratoRepository.save(
                Contrato.builder()
                        .empleado(empleadoCreate)
                        .fechaInicio(LocalDateTime.parse(empleado.contrato().fechaInicio()))
                        .fechaFin(LocalDateTime.parse(empleado.contrato().fechaFin()))
                        .tipoContrato(TipoContrato.valueOf(empleado.contrato().tipoContrato()))
                        .cargo(CargoMapper.fromResponse(empleado.contrato().cargo()))
                        .createAt(LocalDateTime.parse(empleado.contrato().createAt()))
                        .estado(true)
                        .build()
        );
    }
}
