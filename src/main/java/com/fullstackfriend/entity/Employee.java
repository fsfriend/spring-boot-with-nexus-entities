package com.fullstackfriend.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GenericGenerator(strategy = "org.hibernate.id.UUIDGenerator", name="uuid2")
    @GeneratedValue(generator = "uuid2")
    private String id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name  = "LAST_NAME")
    private String lastName;

}
