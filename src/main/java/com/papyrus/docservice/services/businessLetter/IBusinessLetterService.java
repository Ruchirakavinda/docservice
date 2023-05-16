package com.papyrus.docservice.services.businessLetter;

import com.papyrus.docservice.entity.BusinessLetter;

import java.util.List;

public interface IBusinessLetterService {
    public BusinessLetter addLetter(BusinessLetter businessLetter);
    public List<BusinessLetter> getAllLetters();

    public BusinessLetter getLetterByID(Integer id);

    public BusinessLetter updateLetter(Integer id , BusinessLetter businessLetter);

    public void deleteLetterById(Integer id);
}
