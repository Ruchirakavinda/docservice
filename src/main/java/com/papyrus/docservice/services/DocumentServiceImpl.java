package com.papyrus.docservice.services;

import com.papyrus.docservice.entity.BusinessLetter;
import com.papyrus.docservice.entity.Payslip;
import com.papyrus.docservice.repository.IBusinessLetterRepo;
import com.papyrus.docservice.repository.IPayslipRepo;
import com.papyrus.docservice.requestDTO.documentRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements IDocumentService {

    final IBusinessLetterRepo iBusinessLetterRepo;
    final IPayslipRepo iPayslipRepo;

    public DocumentServiceImpl(IBusinessLetterRepo iBusinessLetterRepo, IPayslipRepo iPayslipRepo) {
        this.iBusinessLetterRepo = iBusinessLetterRepo;
        this.iPayslipRepo = iPayslipRepo;
    }

//    @Override
//    public BusinessLetter addLetter(documentRequestDTO requestDTO) {
//
//        var businessLetter = BusinessLetter.builder()
//                .templateType(requestDTO.getTemplateType())
//                .companyName(requestDTO.getCompanyName())
//                .yourAddress(requestDTO.getYourAddress())
//                .todayDate(requestDTO.getTodayDate())
//                .addresseeName(requestDTO.getAddresseeName())
//                .addresseeTitle(requestDTO.getAddresseeTitle())
//                .addresseeCompany(requestDTO.getAddresseeCompany())
//                .companyAddress(requestDTO.getCompanyAddress())
//                .salutation(requestDTO.getSalutation())
//                .body1(requestDTO.getBody1())
//                .body2(requestDTO.getBody2())
//                .body3(requestDTO.getBody3())
//                .yourName(requestDTO.getYourName())
//                .companyWebsite(requestDTO.getCompanyWebsite())
//                .email(requestDTO.getEmail())
//                .phone(requestDTO.getPhone()).build();
//        return iBusinessLetterRepo.save(businessLetter);
//    }
//
//    @Override
//    public Payslip addPayslip(documentRequestDTO requestDTO) {
//        var payslip = Payslip.builder()
//                .templateType(requestDTO.getTemplateType())
//                .companyName(requestDTO.getCompanyName())
//                .yourAddress(requestDTO.getYourAddress())
//                .todayDate(requestDTO.getTodayDate())
//                .employeeName(requestDTO.getEmployeeName())
//                .designation(requestDTO.getDesignation())
//                .payPeriod(requestDTO.getPayPeriod())
//                .workedDays(requestDTO.getWorkedDays())
//                .basic(requestDTO.getBasic())
//                .incetivePay(requestDTO.getIncetivePay())
//                .houseRentAllowance(requestDTO.getHouseRentAllowance())
//                .mealAllowance(requestDTO.getMealAllowance())
//                .providentFund(requestDTO.getProvidentFund())
//                .professionalTax(requestDTO.getProfessionalTax())
//                .loan(requestDTO.getLoan())
//                .companyWebsite(requestDTO.getCompanyWebsite())
//                .email(requestDTO.getEmail())
//                .phone(requestDTO.getPhone()).build();
//        return iPayslipRepo.save(payslip);
//    }

    @Override
    public BusinessLetter addLetter(BusinessLetter businessLetter) {
        return iBusinessLetterRepo.save(businessLetter);
    }
    @Override
    public Payslip addPayslip(Payslip payslip) {
        return iPayslipRepo.save(payslip);
    }

    @Override
    public List<BusinessLetter> getAllLetters() {
        return iBusinessLetterRepo.findAll();
    }

    @Override
    public List<Payslip> getAllPayslips() {
        return iPayslipRepo.findAll();
    }

    @Override
    public BusinessLetter getLetterByID(Integer id){
        return iBusinessLetterRepo.findById(id).get();
    }

    @Override
    public Payslip getPayslipByID(Integer id) {
        return iPayslipRepo.findById(id).get();
    }

    @Override
    public BusinessLetter updateLetter(Integer id , BusinessLetter businessLetter){
        Optional<BusinessLetter> busLetter = iBusinessLetterRepo.findById(id);
        if(busLetter.isPresent()){
            busLetter.get().setCompanyName(businessLetter.getCompanyName());
            busLetter.get().setYourAddress(businessLetter.getYourAddress());
            busLetter.get().setTodayDate(businessLetter.getTodayDate());
            busLetter.get().setAddresseeName(businessLetter.getAddresseeName());
            busLetter.get().setAddresseeTitle(businessLetter.getAddresseeTitle());
            busLetter.get().setAddresseeCompany(businessLetter.getAddresseeCompany());
            busLetter.get().setCompanyAddress(businessLetter.getCompanyAddress());
            busLetter.get().setSalutation(businessLetter.getSalutation());
            busLetter.get().setBody1(businessLetter.getBody1());
            busLetter.get().setBody2(businessLetter.getBody2());
            busLetter.get().setBody3(businessLetter.getBody3());
            busLetter.get().setYourName(businessLetter.getYourName());
            busLetter.get().setCompanyWebsite(businessLetter.getCompanyWebsite());
            busLetter.get().setEmail(businessLetter.getEmail());
            busLetter.get().setPhone(businessLetter.getPhone());

            return iBusinessLetterRepo.save(busLetter.get());
        }
        throw new RuntimeException();
    }

    @Override
    public Payslip updatePayslip(Integer id, Payslip payslip) {
        Optional<Payslip> payslip1 = iPayslipRepo.findById(id);
        if(payslip1.isPresent()){
            payslip1.get().setCompanyName(payslip.getCompanyName());
            payslip1.get().setYourAddress(payslip.getYourAddress());
            payslip1.get().setTodayDate(payslip.getTodayDate());
            payslip1.get().setEmployeeName(payslip.getEmployeeName());
            payslip1.get().setDesignation(payslip.getDesignation());
            payslip1.get().setPayPeriod(payslip.getPayPeriod());
            payslip1.get().setWorkedDays(payslip.getWorkedDays());
            payslip1.get().setBasic(payslip.getBasic());
            payslip1.get().setIncetivePay(payslip.getIncetivePay());
            payslip1.get().setHouseRentAllowance(payslip.getHouseRentAllowance());
            payslip1.get().setMealAllowance(payslip.getMealAllowance());
            payslip1.get().setProvidentFund(payslip.getProvidentFund());
            payslip1.get().setProfessionalTax(payslip.getProfessionalTax());
            payslip1.get().setLoan(payslip.getLoan());
            payslip1.get().setCompanyWebsite(payslip.getCompanyWebsite());
            payslip1.get().setEmail(payslip.getEmail());
            payslip1.get().setPhone(payslip.getPhone());
            return iPayslipRepo.save(payslip1.get());
        }
        throw new RuntimeException();
    }

    @Override
    public void deleteLetterById(Integer id) {
        iBusinessLetterRepo.deleteById(id);
    }

    @Override
    public void deletePayslipById(Integer id) {
        iPayslipRepo.deleteById(id);
    }
}
