package com.sathya.orm.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="myproduct")
public class Product {
	
   @Id
   private int proId;
   private String proName;
   private double proPrice;
   @CreatedDate
   private LocalDateTime createAt;
   @CreatedBy
   private String createBy;
  

}
