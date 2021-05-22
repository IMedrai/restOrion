package ma.orion.rest.service.conge;

import ma.orion.rest.model.Conge;



import java.util.List;

public interface CongeService {
    void add(Conge conge);
    List<Conge> getAll( );
}
