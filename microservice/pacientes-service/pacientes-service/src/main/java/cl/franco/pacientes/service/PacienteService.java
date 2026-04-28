package cl.franco.pacientes.service;

import cl.franco.pacientes.dto.PacienteResponseDTO;
import cl.franco.pacientes.model.Paciente;
import cl.franco.pacientes.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PacienteService {

    private PacienteRepository pacienteRepository;

    public PacienteResponseDTO obtenerPorId(Long id){
        //buscamos la entidad de la base de datos

        Paciente paciente = pacienteRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Paciente no encontrado."));

        //Mapear
        PacienteResponseDTO dto = new PacienteResponseDTO();
        dto.setId(paciente.getId());
        dto.setNombre(paciente.getNombre());
        dto.setDocumento(paciente.getDocumento());
        dto.setFechanacimiento(paciente.getFechanacimiento());

        return dto;
    }

    //Metodo para guardar un paciente
    public Paciente guardar(Paciente paciente){
        return pacienteRepository.save(paciente);
    }
}
