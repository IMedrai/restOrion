package ma.orion.rest.dao;


import ma.orion.rest.model.Absence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbsenceDAO extends JpaRepository<Absence, Long> {

        @Override
        List<Absence> findAll();
}
