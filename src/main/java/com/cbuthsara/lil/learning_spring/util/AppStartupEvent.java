package com.cbuthsara.lil.learning_spring.util;

import com.cbuthsara.lil.learning_spring.business.ReservationService;
import com.cbuthsara.lil.learning_spring.business.RoomReservation;
import com.cbuthsara.lil.learning_spring.data.*;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final ReservationService reservationService;
    private final DateUtils dateUtils;
    private Scanner roomRepository;

    public AppStartupEvent(ReservationService reservationService, DateUtils dateUtils) {
        this.reservationService = reservationService;
        this.dateUtils = dateUtils;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Date date = this.dateUtils.createDateFromDateString("2024-01-01");
        List<RoomReservation> reservations = this.reservationService.getRoomReservationsForDate(date);
        reservations.forEach((System.out::println));
    }
}
