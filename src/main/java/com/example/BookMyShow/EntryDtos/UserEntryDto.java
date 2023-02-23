package com.example.BookMyShow.EntryDtos;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserEntryDto {

    private String name;
    private int age;


    private String eMail;


    private String mobNo;
    private String address;

}
