package ma.orion.rest.dao;

import ma.orion.rest.model.Imputation;
import ma.orion.rest.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ImputationDAO extends JpaRepository<Imputation, Long> {

    List<Imputation> findAllByDate(String date);


}
