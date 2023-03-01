package com.example.swagger_project.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Scheme {

    private String companyName;
    private String clnPolCode;
    private String startDate;
    private String endDate;
    private String polTypeId;
    private String userId;
    private String countryCode;
    private String policyCurrencyId;
    private String anniv;
    private String customerid;
    private String country;
}
