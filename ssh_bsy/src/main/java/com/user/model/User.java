package com.user.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.lang.annotation.Native;

@Entity
@Setter
@Getter
@Table(name = "t_user2")
public class User {

  @Id
  @GeneratedValue
  @Native
  private Integer id;

  @Column(name="name")
  private String name;

  @Column(name = "phone")
  private String phone;


}
