package pe.edu.upc.projectfinanzastf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.projectfinanzastf.entities.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {

    @Query("SELECT u FROM Usuario u WHERE u.nombre_usuario = :username")
    public Usuario findByUsername(@Param("username") String username); //requerido para UserDetails


}
