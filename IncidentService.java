package in.sandeep.service;

import in.sandeep.model.IncidentEntity;

import java.util.List;

public interface IncidentService {

    String createIncident(IncidentEntity incidentEntity);
    String updateIncident(IncidentEntity incidentEntity);
    String deleteIncident(String incidentId);
    IncidentEntity getIncident(String incidentId);
    List<IncidentEntity> getAllIncidents();
}

