package com.papyrus.docservice.controller;

import com.papyrus.docservice.entity.BusinessLetter;
import com.papyrus.docservice.entity.Payslip;
import com.papyrus.docservice.requestDTO.documentRequestDTO;
import com.papyrus.docservice.services.IDocumentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/docservice")
public class DocumentCtrl {

    final IDocumentService _iDocumentService;

    public DocumentCtrl(IDocumentService iDocumentService) {
        _iDocumentService = iDocumentService;
    }

    //    @PostMapping("/add-document")
//    public ResponseEntity<?> addDocument(@RequestBody documentRequestDTO requestDTO){
//        if(requestDTO.getTemplateType() == "business-letter"){
//            return ResponseEntity.ok(_iDocumentService.addLetter(requestDTO));
//        }
//        return ResponseEntity.ok(_iDocumentService.addPayslip(requestDTO));
//    }
    @PostMapping("/add-business-letter")
    public ResponseEntity<?>  addLetter(@RequestBody BusinessLetter businessLetter){
        return ResponseEntity.ok(_iDocumentService.addLetter(businessLetter));
    }
    @PostMapping("/add-payslip")
    public ResponseEntity<?> addPayslip(@RequestBody Payslip payslip){
        return ResponseEntity.ok(_iDocumentService.addPayslip(payslip));
    }


    @GetMapping(value = "/business-letters")
    public List<BusinessLetter> getAllLetters(){
        return this._iDocumentService.getAllLetters();
    }
    @GetMapping(value = "/payslips")
    public List<Payslip> getAllPayslips(){
        return this._iDocumentService.getAllPayslips();
    }

    @GetMapping(value = "/business-letter/{id}")
    public BusinessLetter getLetterByID(@PathVariable Integer id){
        return this._iDocumentService.getLetterByID(id);
    }
    @GetMapping(value = "/payslip/{id}")
    public Payslip getPayslipByID(@PathVariable Integer id){
        return this._iDocumentService.getPayslipByID(id);
    }

    @PutMapping(value = "/edit-business-letter/{id}", consumes = "application/json")
    public BusinessLetter updateLetter(@PathVariable Integer id , @RequestBody BusinessLetter businessLetter){
        return this._iDocumentService.updateLetter(id, businessLetter);
    }
    @PutMapping(value = "/edit-payslip/{id}", consumes = "application/json")
    public Payslip updatePayslip(@PathVariable Integer id , @RequestBody Payslip payslip){
        return this._iDocumentService.updatePayslip(id,payslip);
    }

    @DeleteMapping(value = "/remove-business-letter/{id}")
    public void deleteLetterById(@PathVariable Integer id){
        this._iDocumentService.deleteLetterById(id);
    }

    @DeleteMapping(value = "/remove-payslip/{id}")
    public void deletePayslipById(@PathVariable Integer id){
        this._iDocumentService.deletePayslipById(id);
    }

    }



