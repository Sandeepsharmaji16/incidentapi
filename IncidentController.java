package in.sandeep.controller;

import in.sandeep.model.IncidentEntity;
import in.sandeep.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/incident")
public class IncidentController {


    @Autowired
    private IncidentService incidentService;

    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @GetMapping("/{incidentId}")
    public IncidentEntity getIncident(String incidentId) {
        return incidentService.getIncident(incidentId);
    }

    @GetMapping
    public List<IncidentEntity> getAllIncidents(@PathVariable String IncidentEntityid) {
        return incidentService.getAllIncidents();
    }
     @PostMapping()
    public String createIncident(IncidentEntity incidentEntity) {
         incidentService.createIncident(incidentEntity);
         return "Incident created successfully";
     }
     @PutMapping
     public String updateIncident(@RequestBody IncidentEntity incidentEntity) {
         incidentService.updateIncident(incidentEntity);
         return "Incident updated successfully";
     }
        @DeleteMapping("/{incidentId}")
    public String deleteIncident(@PathVariable String incidentId) {
        incidentService.deleteIncident(incidentId);
        return "Incident deleted successfully";
        }
}
