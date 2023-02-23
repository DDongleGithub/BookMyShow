package com.example.BookMyShow.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "tickets")
public class TicketEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String movieName;
    private LocalDate showDate;
    private LocalTime showTime;
    private int totalAmount;
    private String ticketId = UUID.randomUUID().toString();
    private String theaterName;


    @ManyToOne
    @JoinColumn
    private UsersEntity usersEntity;


    //This is child wrt to showEntity
    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;
}
