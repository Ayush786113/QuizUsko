package com.quizapptelusko2M;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@org.springframework.stereotype.Service
public class Service {
    List<Question> questionList;

    public Service(){
        questionList = new LinkedList<Question>();
    }

    public void addQuestion(Question question){
        questionList.add(question);
    }

    public Question getOneQuestion(){
        return questionList.get(new Random().nextInt(0, questionList.size()));
    }
}
