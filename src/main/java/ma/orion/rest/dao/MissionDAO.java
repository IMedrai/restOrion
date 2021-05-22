package ma.orion.rest.dao;

import ma.orion.rest.model.Mission;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MissionDAO extends JpaRepository<Mission, Long> {
    @Override
    List<Mission> findAll();
}
