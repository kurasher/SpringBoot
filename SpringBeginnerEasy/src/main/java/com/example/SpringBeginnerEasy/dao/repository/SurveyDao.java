package com.example.SpringBeginnerEasy.dao.repository;

import com.example.SpringBeginnerEasy.entity.Survey;

import java.util.List;

public interface SurveyDao {
    void insertSurvey(Survey survey);

    List<Survey> getAll();
}
