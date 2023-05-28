package com.papyrus.docservice.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payslip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String templateType;

    private String companyName;

    private String yourAddress;

    private String todayDate;

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

    private String companyWebsite;

    private String email;

    private String phone;
}
