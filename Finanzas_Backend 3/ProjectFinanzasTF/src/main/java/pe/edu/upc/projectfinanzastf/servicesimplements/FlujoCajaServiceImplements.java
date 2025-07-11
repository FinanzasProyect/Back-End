package pe.edu.upc.projectfinanzastf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.projectfinanzastf.entities.FlujoCaja;
import pe.edu.upc.projectfinanzastf.repositories.IFlujoCajaRepository;
import pe.edu.upc.projectfinanzastf.servicesinterfaces.IFlujoCajaService;

import java.util.List;
@Service
public class FlujoCajaServiceImplements implements IFlujoCajaService {

    @Autowired
    private IFlujoCajaRepository flujoR;

    @Override
    public List<FlujoCaja> list() {
        return flujoR.findAll();
    }

    @Override
    public void insert(FlujoCaja fl) {
          flujoR.save(fl);
    }

    @Override
    public FlujoCaja listId(int id) {
        return flujoR.findById(id).orElse(new FlujoCaja());
    }

    @Override
    public void update(FlujoCaja fl) {
    flujoR.save(fl);
    }

    @Override
    public void delete(int id) {
    flujoR.deleteById(id);
    }
}
