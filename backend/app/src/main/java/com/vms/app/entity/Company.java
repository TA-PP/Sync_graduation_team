package com.vms.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "company")
public class Company {

  @Id
  @Column()
  private int companyID; // 고유 pin 번호

  @Column(length = 45, nullable = false)
  private String company_name;

  @Column(length = 45, nullable = false)
  private String department;

}
