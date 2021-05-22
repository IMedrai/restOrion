package ma.orion.rest.controller;


import ma.orion.rest.dto.AuthRequest;
import ma.orion.rest.service.auth.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private AuthService authService;


    @PostMapping("/auth")
    public ResponseEntity<Boolean> authenticate(@RequestBody AuthRequest authRequest){
        boolean isAuthenticate = this.authService.login(authRequest);
        return new ResponseEntity<>(isAuthenticate, HttpStatus.OK);
    }



}
