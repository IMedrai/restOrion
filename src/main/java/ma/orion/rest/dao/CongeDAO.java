package ma.orion.rest.dao;

import ma.orion.rest.model.Conge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CongeDAO extends JpaRepository<Conge, Long> {

@Override
List<Conge> findAll();

}
