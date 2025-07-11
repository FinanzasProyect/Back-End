package pe.edu.upc.projectfinanzastf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pe.edu.upc.projectfinanzastf.entities.Rol;
import pe.edu.upc.projectfinanzastf.repositories.IRolRepository;

/**
 * Esta clase se ejecuta al iniciar la aplicación para inicializar datos base.
 */
@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private IRolRepository rolRepository;

    @Override
    public void run(String... args) throws Exception {
        if (rolRepository.count() == 0) {
            System.out.println("No se encontraron roles, inicializando datos por defecto...");

            Rol adminRol = new Rol();
            adminRol.setTipo_rol("ADMIN");
            rolRepository.save(adminRol);

            Rol userRol = new Rol();
            userRol.setTipo_rol("USER");
            rolRepository.save(userRol);

            System.out.println("Roles por defecto (ADMIN, USER) han sido creados.");
        } else {
            System.out.println("Los roles ya existen en la base de datos. No se requiere inicialización.");
        }
    }
}