package com.example.swagger_project.rest;

import com.example.swagger_project.request.PassengerInfo;
import com.example.swagger_project.response.TicketInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiKenyaRestController {

    @PostMapping("/bookFlightTicket")
    public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passengerInfo){

        //logic to book ticket

        //send ticket info
        TicketInfo ticketInfo = new TicketInfo();
        ticketInfo.setName(passengerInfo.getFname()+" "+passengerInfo.getLname());
        ticketInfo.setFrom(passengerInfo.getFrom());
        ticketInfo.setTo(passengerInfo.getTo());
        ticketInfo.setTicketStatus("CONFIRMED");
        ticketInfo.setTicketPrice("KSH 4500.00");
        ticketInfo.setJourneyDate(passengerInfo.getJourneyDate());

        return new ResponseEntity<>(ticketInfo, HttpStatus.CREATED);
    }
}
