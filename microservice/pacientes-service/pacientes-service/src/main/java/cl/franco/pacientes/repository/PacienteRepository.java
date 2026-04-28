package cl.franco.pacientes.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import cl.franco.pacientes.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente,Long>{

}
