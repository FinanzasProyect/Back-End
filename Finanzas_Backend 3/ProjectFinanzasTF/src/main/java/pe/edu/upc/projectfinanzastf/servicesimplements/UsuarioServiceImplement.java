package pe.edu.upc.projectfinanzastf.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.upc.projectfinanzastf.entities.Usuario;
import pe.edu.upc.projectfinanzastf.repositories.IUsuarioRepository;
import pe.edu.upc.projectfinanzastf.servicesinterfaces.IUsuarioService;


import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioR;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Usuario> list() {
        return usuarioR.findAll();
    }

    @Override
    public void insert(Usuario usuario) {
        usuario.setPassword_usuario(passwordEncoder.encode(usuario.getPassword_usuario()));
        usuarioR.save(usuario);
    }

    @Override
    public Usuario listId(int id) {
        return usuarioR.findById(id).orElse(new Usuario());
    }

    @Override
    public void update(Usuario usuario) {
        usuario.setPassword_usuario(passwordEncoder.encode(usuario.getPassword_usuario()));
        usuarioR.save(usuario);
    }

    @Override
    public void delete(int id) {
        usuarioR.deleteById(id);
    }



}
