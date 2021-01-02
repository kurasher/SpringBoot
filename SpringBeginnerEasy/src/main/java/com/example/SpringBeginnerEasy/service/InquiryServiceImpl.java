package com.example.SpringBeginnerEasy.service;

import com.example.SpringBeginnerEasy.dao.InquiryDao;
import com.example.SpringBeginnerEasy.entity.Inquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InquiryServiceImpl implements InquiryService{
    private final InquiryDao dao;

    @Autowired
    InquiryServiceImpl(InquiryDao dao){
        this.dao = dao;
    }

    @Override
    public void save(Inquiry inquiry) {
        dao.insertInquiry(inquiry);
    }

    @Override
    public List<Inquiry> getAll() {
        return dao.getAll();
    }
}
