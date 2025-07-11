package pe.edu.upc.projectfinanzastf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.projectfinanzastf.entities.ValoracionBono;

public interface IValoracionRepository extends JpaRepository<ValoracionBono,Integer> {
}
