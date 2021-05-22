package ma.orion.rest.service.auth;

import ma.orion.rest.dto.AuthRequest;

public interface AuthService {
     boolean login(AuthRequest authRequest);
}
