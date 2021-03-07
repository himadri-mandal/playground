package com.next4j.pollsapp.repository;

import com.next4j.pollsapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select user from User user where " +
            " user.username = ?1 " +
            " or user.email = ?1 ")
    Optional<User> findByUsernameOrEmail(String userNameOrEmail);

}
