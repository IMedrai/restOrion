package ma.orion.rest.service.imputation;


import ma.orion.rest.dao.ImputationDAO;
import ma.orion.rest.dao.MissionDAO;
import ma.orion.rest.model.Imputation;
import ma.orion.rest.model.Mission;
import ma.orion.rest.service.mission.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ImputationServiceImpl implements ImputationService {

    @Autowired
    private ImputationDAO imputationDAO;

    public void add(Imputation imputation){
        if(imputation != null) this.imputationDAO.save(imputation);
    }

    public Imputation getById(Long id){
        Optional<Imputation> imputation = this.imputationDAO.findById(id);
        return imputation.orElse(null);
    }

    public List<Imputation> getByDate(String date){
        return this.imputationDAO.findAllByDate(date);
    }
}
