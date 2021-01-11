package com.example.SpringBeginnerEasy.service;

import com.example.SpringBeginnerEasy.entity.Inquiry;

import java.util.List;

public interface InquiryService {
    void save(Inquiry inquiry);

    List<Inquiry> getAll();
}
