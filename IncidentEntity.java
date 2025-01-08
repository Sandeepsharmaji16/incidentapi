package in.sandeep.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="inm_incident")
public class IncidentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String incidentId;

    private String incidentName;
    private String incidentPhoneNumber;
    private String incidentCity;


}
