package com.papyrus.docservice.services;

import com.papyrus.docservice.entity.BusinessLetter;
import com.papyrus.docservice.entity.Payslip;
import com.papyrus.docservice.requestDTO.documentRequestDTO;

import java.util.List;

public interface IDocumentService {
//    public BusinessLetter addLetter(documentRequestDTO requestDTO);
//    public Payslip addPayslip (documentRequestDTO requestDTO);

    public BusinessLetter addLetter(BusinessLetter businessLetter);
    public Payslip addPayslip(Payslip payslip);

    public List<BusinessLetter> getAllLetters();
    public List<Payslip> getAllPayslips();

    public BusinessLetter getLetterByID(Integer id);
    public Payslip getPayslipByID(Integer id);

    public BusinessLetter updateLetter(Integer id , BusinessLetter businessLetter);
    public Payslip updatePayslip(Integer id, Payslip payslip);

    public void deleteLetterById(Integer id);
    public void deletePayslipById(Integer id);
}
