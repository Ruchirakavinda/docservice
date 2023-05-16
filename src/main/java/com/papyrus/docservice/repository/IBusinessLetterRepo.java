package com.papyrus.docservice.repository;

import com.papyrus.docservice.entity.BusinessLetter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBusinessLetterRepo  extends JpaRepository<BusinessLetter, Integer>{
}
