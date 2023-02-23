package com.example.BookMyShow.Repositories;

import com.example.BookMyShow.Models.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity,Integer> {

}
