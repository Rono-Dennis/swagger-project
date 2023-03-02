package com.example.swagger_project.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;
import org.yaml.snakeyaml.events.Event;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Scheme {

    private String companyName;
    private String clnPolCode;
    private String startDate;
    private String endDate;
    private String polTypeId;
    @Id
    private Long  userId;
    private String countryCode;
    private String policyCurrencyId;
    private String anniv;
    private String customerid;
    private String country;
}
