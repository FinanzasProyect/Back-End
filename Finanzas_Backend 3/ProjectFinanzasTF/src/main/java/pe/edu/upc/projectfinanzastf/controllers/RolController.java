package pe.edu.upc.projectfinanzastf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.projectfinanzastf.dtos.RolDTO;
import pe.edu.upc.projectfinanzastf.entities.Rol;
import pe.edu.upc.projectfinanzastf.servicesinterfaces.IRolService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private IRolService rolS;

    @GetMapping("/listar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<RolDTO> listar() {
       return rolS.list().stream().map(x->{
           ModelMapper m=new ModelMapper();
           return m.map(x,RolDTO.class);
       }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void insertar(@RequestBody RolDTO dto) {
        ModelMapper m=new ModelMapper();
        Rol r=m.map(dto,Rol.class);
        rolS.insert(r);
    }

    @GetMapping("/listarid/{id}")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public RolDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        RolDTO dto=m.map(rolS.listId(id),RolDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void modificar(@RequestBody RolDTO dto) {
        ModelMapper m=new ModelMapper();
        Rol r=m.map(dto,Rol.class);
        rolS.update(r);
    }

    @DeleteMapping("/eliminar/{id}")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void eliminar(@PathVariable("id") int id) {rolS.delete(id);}



}
