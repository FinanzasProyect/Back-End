package pe.edu.upc.projectfinanzastf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.projectfinanzastf.dtos.BonoDTO;
import pe.edu.upc.projectfinanzastf.entities.Bono;
import pe.edu.upc.projectfinanzastf.servicesinterfaces.IBonoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bono")
public class BonoController {

    @Autowired
    private IBonoService bonoS;

    @GetMapping("/listar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<BonoDTO> listar() {
        return bonoS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,BonoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void insertar(@RequestBody BonoDTO dto) {
        ModelMapper m=new ModelMapper();
        Bono r=m.map(dto,Bono.class);
        bonoS.insert(r);
    }

    @GetMapping("/listarid/{id}")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public BonoDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        BonoDTO dto=m.map(bonoS.listId(id),BonoDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void modificar(@RequestBody BonoDTO dto) {
        ModelMapper m=new ModelMapper();
        Bono r=m.map(dto,Bono.class);
        bonoS.update(r);
    }

    @DeleteMapping("/eliminar/{id}")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void eliminar(@PathVariable("id") int id) {bonoS.delete(id);}




}
