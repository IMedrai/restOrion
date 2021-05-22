package ma.orion.rest.service.conge;

import ma.orion.rest.dao.CongeDAO;
import ma.orion.rest.model.Conge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CongeServiceImpl implements CongeService {

    @Autowired
    private CongeDAO congeDAO;

    @Override
    public void add(Conge conge) {
        this.congeDAO.save(conge);
    }
    @Override
    public List<Conge> getAll() {
        return this.congeDAO.findAll();
    }
}
