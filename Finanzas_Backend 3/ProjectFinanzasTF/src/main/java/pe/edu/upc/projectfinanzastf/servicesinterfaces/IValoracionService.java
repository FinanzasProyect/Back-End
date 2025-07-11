package pe.edu.upc.projectfinanzastf.servicesinterfaces;

import pe.edu.upc.projectfinanzastf.entities.Usuario;
import pe.edu.upc.projectfinanzastf.entities.ValoracionBono;

import java.util.List;

public interface IValoracionService {

    public List<ValoracionBono> list();

    public void insert(ValoracionBono valo);

    public ValoracionBono listId(int id);

    public void update(ValoracionBono valo);

    public void delete(int id);

}
