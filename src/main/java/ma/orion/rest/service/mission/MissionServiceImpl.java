package ma.orion.rest.service.mission;
import ma.orion.rest.dao.MissionDAO;
import ma.orion.rest.model.Mission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionServiceImpl implements MissionService {

    @Autowired
    private MissionDAO missionDAO;
    @Override
    public List<Mission> getAll()
    {
        return this.missionDAO.findAll();

    }
}
