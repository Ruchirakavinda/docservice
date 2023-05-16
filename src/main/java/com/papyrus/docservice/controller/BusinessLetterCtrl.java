package com.papyrus.docservice.controller;

import com.papyrus.docservice.entity.BusinessLetter;
import com.papyrus.docservice.services.businessLetter.IBusinessLetterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docservice")
public class BusinessLetterCtrl {

    final IBusinessLetterService _iBusinessLetterService;

    public BusinessLetterCtrl(IBusinessLetterService iBusinessLetterService) {
        _iBusinessLetterService = iBusinessLetterService;
    }

    @PostMapping("/new-business-letter")
    public String addLetter(@RequestBody BusinessLetter businessLetter){
        _iBusinessLetterService.addLetter(businessLetter);

        return "add new business letter success";
    }

    @GetMapping(value = "/business-letters")
    public List<BusinessLetter> getAllLetters(){
        return this._iBusinessLetterService.getAllLetters();
    }

    @GetMapping(value = "/business-letter/{id}")
    public BusinessLetter getLetterByID(@PathVariable Integer id){
        return this._iBusinessLetterService.getLetterByID(id);
    }

    @PutMapping(value = "/edit-business-letter/{id}", consumes = "application/json")
    public BusinessLetter updateLetter(@PathVariable Integer id , @RequestBody BusinessLetter businessLetter){
        return this._iBusinessLetterService.updateLetter(id, businessLetter);
    }
    @DeleteMapping(value = "/remove-business-letter/{id}")
    public void deleteLetterById(@PathVariable Integer id){
        this._iBusinessLetterService.deleteLetterById(id);
    }

}
