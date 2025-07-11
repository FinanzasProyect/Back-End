package pe.edu.upc.projectfinanzastf.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.projectfinanzastf.dtos.BonoDTO;
import pe.edu.upc.projectfinanzastf.dtos.FlujoCajaDTO;
import pe.edu.upc.projectfinanzastf.entities.Bono;
import pe.edu.upc.projectfinanzastf.entities.FlujoCaja;
import pe.edu.upc.projectfinanzastf.servicesinterfaces.IBonoService;
import pe.edu.upc.projectfinanzastf.servicesinterfaces.IFlujoCajaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/flujocaja")
public class FlujoCajaController {

    @Autowired
    private IFlujoCajaService cajaS;

    @GetMapping("/listar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<FlujoCajaDTO> listar() {
        return cajaS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,FlujoCajaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void insertar(@RequestBody FlujoCajaDTO dto) {
        ModelMapper m=new ModelMapper();
        FlujoCaja r=m.map(dto,FlujoCaja.class);
        cajaS.insert(r);
    }

    @GetMapping("/listarid/{id}")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public FlujoCajaDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        FlujoCajaDTO dto=m.map(cajaS.listId(id),FlujoCajaDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void modificar(@RequestBody FlujoCajaDTO dto) {
        ModelMapper m=new ModelMapper();
        FlujoCaja r=m.map(dto,FlujoCaja.class);
        cajaS.update(r);
    }

    @DeleteMapping("/eliminar/{id}")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void eliminar(@PathVariable("id") int id) {cajaS.delete(id);}



}
