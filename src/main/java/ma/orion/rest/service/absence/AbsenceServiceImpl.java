package ma.orion.rest.service.absence;

import ma.orion.rest.dao.AbsenceDAO;
import ma.orion.rest.model.Absence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AbsenceServiceImpl implements AbsenceService{

    @Autowired
    private AbsenceDAO absenceDAO;

    @Override
    public List<Absence> getAll() {
        return this.absenceDAO.findAll();
    }
}
