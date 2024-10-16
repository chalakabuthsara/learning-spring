package com.cbuthsara.lil.learning_spring.webservice;

import com.cbuthsara.lil.learning_spring.business.ReservationService;
import com.cbuthsara.lil.learning_spring.business.RoomReservation;
import com.cbuthsara.lil.learning_spring.util.DateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebserviceController {
    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public WebserviceController(DateUtils dateUtils, ReservationService reservationService) {

        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = false) String dateString ) {
        Date date = this.dateUtils.createDateFromDateString(dateString);
        return  this.reservationService.getRoomReservationsForDate(date);
    }
}
