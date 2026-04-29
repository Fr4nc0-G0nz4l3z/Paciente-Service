package cl.franco.pacientes.controller;

import cl.franco.pacientes.dto.PacienteRequestDTO;
import cl.franco.pacientes.dto.PacienteResponseDTO;
import cl.franco.pacientes.model.Paciente;
import cl.franco.pacientes.service.PacienteService;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/api/v1/pacientes")
@RequiredArgsConstructor
public class PacienteController {
    
    private final PacienteService pacienteService;

    //Metodo para usar el feig client desde citas
    @GetMapping("/{id}")
    public PacienteResponseDTO obtenerPaciente(@PathVariable Long id){
        return pacienteService.obtenerPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PacienteResponseDTO guardarPaciente(@RequestBody PacienteRequestDTO pacienteRequestDTO){
        return pacienteService.guardar(pacienteRequestDTO);
    }
}
