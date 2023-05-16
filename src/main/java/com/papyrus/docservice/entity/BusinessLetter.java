package com.papyrus.docservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BusinessLetter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String companyName;

    private String yourAddress;

    private String todayDate;

    private String addresseeName;

    private String addresseeTitle;

    private String addresseeCompany;

    private String companyAddress;

    private String salutation;

    @Column (length = 2000)
    private String body1;

    @Column (length = 2000)
    private String body2;

    @Column (length = 2000)
    private String body3;


    private String yourName;

    private String companyWebsite;

    private String email;

    private String phone;
}
