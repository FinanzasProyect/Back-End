package pe.edu.upc.projectfinanzastf.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.projectfinanzastf.entities.ValoracionBono;
import pe.edu.upc.projectfinanzastf.repositories.IValoracionRepository;
import pe.edu.upc.projectfinanzastf.servicesinterfaces.IValoracionService;

import java.util.List;

@Service
public class ValoracionServiceImplement implements IValoracionService {

    @Autowired
    private IValoracionRepository valoR;

    @Override
    public List<ValoracionBono> list() {
        return valoR.findAll();
    }

    @Override
    public void insert(ValoracionBono valo) {
           valoR.save(valo);
    }

    @Override
    public ValoracionBono listId(int id) {
        return valoR.findById(id).orElse(new ValoracionBono());
    }

    @Override
    public void update(ValoracionBono valo) {
       valoR.save(valo);
    }

    @Override
    public void delete(int id) {
       valoR.deleteById(id);
    }
}
