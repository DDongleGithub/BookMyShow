package com.example.BookMyShow.Models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;

    @Column(unique = true, nullable = false)
    private String eMail;

    @Nullable
    @Column(unique = true)
    private String mobNo;
    private String address;

    @OneToMany(mappedBy = "usersEntity", cascade = CascadeType.ALL)
    private List<TicketEntity> ticketEntityList = new ArrayList<>();

}
