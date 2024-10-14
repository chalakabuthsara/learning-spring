package com.cbuthsara.lil.learning_spring.data;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private long reservationId;
    @Column(name = "ROOM_ID")
    private long rooomId;
    @Column(name = "GUEST_ID")
    private long guestId;
    @Column(name = "RES_DATE")
    private Date reservationDate;

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getRoomId() {
        return rooomId;
    }

    public void setRoomId(long rooomId) {
        this.rooomId = rooomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", rooomId=" + rooomId +
                ", guestId=" + guestId +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
