package ma.orion.rest.dao;

import ma.orion.rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserDAO extends JpaRepository<User, Long> {
    User findUserByUserName(String username);

}
