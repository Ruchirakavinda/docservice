package com.papyrus.docservice.requestDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class documentRequestDTO {

    private String templateType;

    private String companyName;

    private String yourAddress;

    private String todayDate;

    private String addresseeName;

    private String addresseeTitle;

    private String addresseeCompany;

    private String companyAddress;

    private String salutation;


    private String body1;


    private String body2;


    private String body3;

    private String yourName;

    private String companyWebsite;

    private String email;

    private String phone;


    private String employeeName;

    private String designation;

    private String payPeriod;

    private String workedDays;

    private String basic;

    private String incetivePay;

    private String houseRentAllowance;

    private String mealAllowance;

    private String providentFund;

    private String professionalTax;

    private String loan;


}
