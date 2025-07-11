package pe.edu.upc.projectfinanzastf.servicesinterfaces;

import pe.edu.upc.projectfinanzastf.entities.Bono;
import pe.edu.upc.projectfinanzastf.entities.Rol;

import java.util.List;

public interface IBonoService {

    public List<Bono> list();
    public void insert(Bono bono);
    public Bono listId(int id);
    public void update(Bono bono);
    public void delete(int id);

}
