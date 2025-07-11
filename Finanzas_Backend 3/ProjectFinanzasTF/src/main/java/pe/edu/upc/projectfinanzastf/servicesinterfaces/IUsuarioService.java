package pe.edu.upc.projectfinanzastf.servicesinterfaces;

import pe.edu.upc.projectfinanzastf.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> list();

    public void insert(Usuario usuario);

    public Usuario listId(int id);

    public void update(Usuario usuario);

    public void delete(int id);


}
