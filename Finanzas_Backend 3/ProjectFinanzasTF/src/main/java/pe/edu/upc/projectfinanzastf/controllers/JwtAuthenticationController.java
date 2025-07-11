package pe.edu.upc.projectfinanzastf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.projectfinanzastf.securities.JwtRequest;
import pe.edu.upc.projectfinanzastf.securities.JwtResponse;
import pe.edu.upc.projectfinanzastf.securities.JwtTokenUtil;
import pe.edu.upc.projectfinanzastf.servicesimplements.JwtUserDetailsService;
import pe.edu.upc.projectfinanzastf.entities.Usuario;
import pe.edu.upc.projectfinanzastf.repositories.IUsuarioRepository;
import java.util.HashMap;
import java.util.Map;


@RestController
@CrossOrigin
public class JwtAuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private JwtUserDetailsService userDetailsService;

    @Autowired
    private IUsuarioRepository userRepo;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody JwtRequest req) throws Exception {
        authenticate(req.getUsername(), req.getPassword());

        final UserDetails userDetails = userDetailsService.loadUserByUsername(req.getUsername());
        final String token = jwtTokenUtil.generateToken(userDetails);

        Usuario usuario = userRepo.findByUsername(req.getUsername());

        Map<String, Object> response = new HashMap<>();
        response.put("jwttoken", token);
        response.put("id_usuario", usuario.getId_usuario());
        response.put("nombre", usuario.getNombre_usuario());
        response.put("rol", usuario.getId_rol().getTipo_rol());

        return ResponseEntity.ok(response);
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }

}