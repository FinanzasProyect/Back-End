package pe.edu.upc.projectfinanzastf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.projectfinanzastf.entities.Rol;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {

}
