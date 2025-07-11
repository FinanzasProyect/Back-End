package pe.edu.upc.projectfinanzastf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.projectfinanzastf.dtos.UserMostrarDTO;
import pe.edu.upc.projectfinanzastf.dtos.UsuarioDTO;
import pe.edu.upc.projectfinanzastf.entities.Usuario;
import pe.edu.upc.projectfinanzastf.servicesinterfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioS;

    @GetMapping("/listar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<UserMostrarDTO> listar() {
        return usuarioS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, UserMostrarDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void insertar(@RequestBody UsuarioDTO u_dto) {
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(u_dto, Usuario.class);
        usuarioS.insert(usuario);
    }


    @GetMapping("/listarid/{id}")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public UserMostrarDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        UserMostrarDTO dto=m.map(usuarioS.listId(id),UserMostrarDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void modificar(@RequestBody UsuarioDTO dto) {
        ModelMapper m=new ModelMapper();
        Usuario u=m.map(dto,Usuario.class);
        usuarioS.update(u);
    }

    @DeleteMapping("/eliminar/{id}")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void eliminar(@PathVariable("id") int id) {usuarioS.delete(id);}



}
