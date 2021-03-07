package com.next4j.pollsapp.model;

import lombok.Getter;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name = "user")
public class User {

    @Id
    //@SequenceGenerator() todo
    private long Id;

    private String username;

    private String email;

    private String password;

    private String name;

    private ZonedDateTime createdAt;

    private ZonedDateTime updateAt;

    /*@OneToOne //todo
    private User createdBy;*/

    //todo roles and permission mechanism
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

}
