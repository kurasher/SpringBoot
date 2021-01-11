package com.example.SpringBeginnerEasy.service;

import com.example.SpringBeginnerEasy.entity.Inquiry;
import com.example.SpringBeginnerEasy.entity.Survey;

import java.util.List;

public interface SurveyService {
    void save(Survey survey);

    List<Survey> getAll();
}
