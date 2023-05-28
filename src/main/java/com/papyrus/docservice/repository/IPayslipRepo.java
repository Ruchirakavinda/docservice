package com.papyrus.docservice.repository;

import com.papyrus.docservice.entity.Payslip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPayslipRepo extends JpaRepository<Payslip, Integer> {

}
