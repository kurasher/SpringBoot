package com.example.SpringBeginnerEasy.dao;

import com.example.SpringBeginnerEasy.entity.Inquiry;

import java.util.List;

public interface InquiryDao {
    void insertInquiry(Inquiry inquiry);

    List<Inquiry> getAll();
}
