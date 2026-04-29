package cl.franco.pacientes.dto;

import lombok.Data;
import java.time.LocalDate;



@Data
public class PacienteRequestDTO {
    
    private String nombre;
    private String documento;
    private LocalDate fechanacimiento;
}
