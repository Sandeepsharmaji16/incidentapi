package in.sandeep.impl;

import in.sandeep.model.IncidentEntity;
import in.sandeep.repositories.IncidentRepo;
import in.sandeep.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IncidentServiceImpl implements IncidentService {


    @Autowired
    private IncidentRepo incidentRepo;

    public IncidentServiceImpl(IncidentRepo incidentRepo) {
        this.incidentRepo = incidentRepo;
    }

    @Override
    public String createIncident(IncidentEntity incidentEntity) {
         incidentRepo.save(incidentEntity);
         return  "Success";
    }

    @Override
    public String updateIncident(IncidentEntity incidentEntity) {
        incidentRepo.save(incidentEntity);
        return "Success";
    }

    @Override
    public String deleteIncident(String incidentId) {
        incidentRepo.deleteById(incidentId);
        return "Success";
    }

    @Override
    public IncidentEntity getIncident(String incidentId) {
        return incidentRepo.findById(incidentId).get();

    }

    @Override
    public List<IncidentEntity> getAllIncidents() {
        return incidentRepo.findAll();
    }
}
