package pe.edu.upc.projectfinanzastf.servicesinterfaces;
import pe.edu.upc.projectfinanzastf.entities.FlujoCaja;

import java.util.List;

public interface IFlujoCajaService {

    public List<FlujoCaja> list();
    public void insert(FlujoCaja flujo);
    public FlujoCaja listId(int id);
    public void update(FlujoCaja flujo);
    public void delete(int id);
}
