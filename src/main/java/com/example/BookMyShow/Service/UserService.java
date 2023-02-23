package com.example.BookMyShow.Service;

import com.example.BookMyShow.EntryDtos.UserEntryDto;
import com.example.BookMyShow.Models.UsersEntity;
import com.example.BookMyShow.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public void addUser(UserEntryDto userEntryDto){

        //here we need to convert and save
        /*
         Old method : create an object and set attributes

        */

        //Creates object faster
        //This is to set all the attributes in one go
        UsersEntity usersEntity = UsersEntity.builder().age(userEntryDto.getAge()).name(userEntryDto.getName())
                .address(userEntryDto.getAddress()).eMail(userEntryDto.getEMail()).mobNo(userEntryDto.getMobNo()).build();


        //Now we just have to save user entity
        userRepository.save(usersEntity);


    }
}
