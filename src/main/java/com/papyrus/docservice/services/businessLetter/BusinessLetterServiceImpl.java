package com.papyrus.docservice.services.businessLetter;

import com.papyrus.docservice.entity.BusinessLetter;
import com.papyrus.docservice.repository.IBusinessLetterRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessLetterServiceImpl implements IBusinessLetterService{

    final IBusinessLetterRepo iBusinessLetterRepo;

    public BusinessLetterServiceImpl(IBusinessLetterRepo iBusinessLetterRepo) {
        this.iBusinessLetterRepo = iBusinessLetterRepo;
    }

    @Override
    public BusinessLetter addLetter(BusinessLetter businessLetter) {
        return iBusinessLetterRepo.save(businessLetter);
    }

    @Override
    public List<BusinessLetter> getAllLetters() {
        return iBusinessLetterRepo.findAll();
    }

    @Override
    public BusinessLetter getLetterByID(Integer id){
        return iBusinessLetterRepo.findById(id).get();
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
    public void deleteLetterById(Integer id) {
        iBusinessLetterRepo.deleteById(id);
    }
}
