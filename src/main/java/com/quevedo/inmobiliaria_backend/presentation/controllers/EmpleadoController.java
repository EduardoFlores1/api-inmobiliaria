package com.quevedo.inmobiliaria_backend.presentation.controllers;

import com.quevedo.inmobiliaria_backend.application.usecases.empleado.create.IEmpleadoCreateUseCase;
import com.quevedo.inmobiliaria_backend.application.usecases.empleado.delete.IEmpleadoDeleteUseCase;
import com.quevedo.inmobiliaria_backend.application.usecases.empleado.readAll.IEmpleadoReadAllUseCase;
import com.quevedo.inmobiliaria_backend.application.usecases.empleado.readOne.IEmpleadoReadOneUseCase;
import com.quevedo.inmobiliaria_backend.application.usecases.empleado.update.IEmpleadoUpdateUseCase;
import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoCreateDTO;
import com.quevedo.inmobiliaria_backend.presentation.dtos.empleado.EmpleadoDTO;
import com.quevedo.inmobiliaria_backend.presentation.dtos.generic.PageableDTO;
import com.quevedo.inmobiliaria_backend.presentation.dtos.generic.ResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/empleados", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmpleadoController {

    private final IEmpleadoReadAllUseCase empleadoReadAllUseCase;
    private final IEmpleadoReadOneUseCase empleadoReadOneUseCase;
    private final IEmpleadoCreateUseCase empleadoCreateUseCase;
    private final IEmpleadoUpdateUseCase empleadoUpdateUseCase;
    private final IEmpleadoDeleteUseCase empleadoDeleteUseCase;

    public EmpleadoController(IEmpleadoReadAllUseCase empleadoReadAllUseCase, IEmpleadoReadOneUseCase empleadoReadOneUseCase, IEmpleadoCreateUseCase empleadoCreateUseCase, IEmpleadoUpdateUseCase empleadoUpdateUseCase, IEmpleadoDeleteUseCase empleadoDeleteUseCase) {
        this.empleadoReadAllUseCase = empleadoReadAllUseCase;
        this.empleadoReadOneUseCase = empleadoReadOneUseCase;
        this.empleadoCreateUseCase = empleadoCreateUseCase;
        this.empleadoUpdateUseCase = empleadoUpdateUseCase;
        this.empleadoDeleteUseCase = empleadoDeleteUseCase;
    }

    @GetMapping
    public ResponseEntity<ResponseDTO<Page<EmpleadoDTO>>> readAll(PageableDTO pageableDTO) {
        return ResponseEntity.ok(ResponseDTO.of(HttpStatus.OK, empleadoReadAllUseCase.execute(pageableDTO)));
    }

    @GetMapping(value = "/{idEmpleado}")
    public ResponseEntity<ResponseDTO<EmpleadoDTO>> readOne(@PathVariable Long idEmpleado) {
        return ResponseEntity.ok(ResponseDTO.of(HttpStatus.OK, empleadoReadOneUseCase.execute(idEmpleado)));
    }

    @PostMapping
    public ResponseEntity<ResponseDTO<Void>> create(@RequestBody EmpleadoCreateDTO empleado) {
        empleadoCreateUseCase.execute(empleado);
        return ResponseEntity.ok(ResponseDTO.of(HttpStatus.CREATED));
    }

    @PutMapping(value = "/{idEmpleado}")
    public ResponseEntity<ResponseDTO<Void>> update(@PathVariable Long idEmpleado, @RequestBody EmpleadoDTO empleado) {
        empleadoUpdateUseCase.execute(idEmpleado, empleado);
        return ResponseEntity.ok(ResponseDTO.of(HttpStatus.OK));
    }

    @DeleteMapping(value = "/{idEmpleado}")
    public ResponseEntity<ResponseDTO<Void>> delete(@PathVariable Long idEmpleado) {
        empleadoDeleteUseCase.execute(idEmpleado);
        return ResponseEntity.ok(ResponseDTO.of(HttpStatus.NO_CONTENT));
    }
}
