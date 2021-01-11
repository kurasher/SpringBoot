package com.example.SpringBeginnerEasy.service;

import com.example.SpringBeginnerEasy.dao.InquiryDao;
import com.example.SpringBeginnerEasy.dao.repository.SurveyDao;
import com.example.SpringBeginnerEasy.entity.Survey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyServiceImpl implements SurveyService{
    private final SurveyDao dao;

    @Autowired
    SurveyServiceImpl(SurveyDao dao){
        this.dao = dao;
    }

    @Override
    public void save(Survey survey) {
        dao.insertSurvey(survey);
    }

    @Override
    public List<Survey> getAll() {
        return dao.getAll();
    }
}
