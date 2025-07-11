package pe.edu.upc.projectfinanzastf.servicesinterfaces;

import pe.edu.upc.projectfinanzastf.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();
    public void insert(Rol rol);
    public Rol listId(int id);
    public void update(Rol rol);
    public void delete(int id);
}
