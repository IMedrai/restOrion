package ma.orion.rest.service.auth;


import ma.orion.rest.dao.UserDAO;
import ma.orion.rest.dto.AuthRequest;
import ma.orion.rest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{
    @Autowired
    private UserDAO userDAO;


    public boolean login(AuthRequest authRequest){
        User user = this.userDAO.findUserByUserName(authRequest.getUserName());
        if ( user != null && user.getUserName().equals(authRequest.getUserName())
                && user.getPassword().equals(authRequest.getPassword())){
            return true;
        }
        else return false;

    }

}
