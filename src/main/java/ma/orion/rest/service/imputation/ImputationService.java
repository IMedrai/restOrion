package ma.orion.rest.service.imputation;


import ma.orion.rest.model.Imputation;

import java.util.List;

public interface ImputationService {
    void add(Imputation imputation);
    List<Imputation> getByDate(String date);
    Imputation getById(Long id);

}
