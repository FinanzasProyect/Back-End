package pe.edu.upc.projectfinanzastf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.projectfinanzastf.entities.Bono;
import pe.edu.upc.projectfinanzastf.repositories.IBonoRepository;
import pe.edu.upc.projectfinanzastf.servicesinterfaces.IBonoService;

import java.util.List;

@Service
public class BonoServiceImplement implements IBonoService {

    @Autowired
    private IBonoRepository bonoR;


    @Override
    public List<Bono> list() {
        return bonoR.findAll();
    }

    @Override
    public void insert(Bono bono) {
      bonoR.save(bono);
    }

    @Override
    public Bono listId(int id) {
        return bonoR.findById(id).orElse(new Bono());
    }

    @Override
    public void update(Bono bono) {
        bonoR.save(bono);
    }

    @Override
    public void delete(int id) {
      bonoR.deleteById(id);
    }
}
