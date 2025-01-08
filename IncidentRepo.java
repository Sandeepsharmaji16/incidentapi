package in.sandeep.repositories;

import in.sandeep.model.IncidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentRepo extends JpaRepository<IncidentEntity, String> {
}
