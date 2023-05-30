package com.quizapptelusko2M;

public record Question (String question, String op1, String op2, String op3, String op4, String answer, String technology){
}

//public class Question{
//    String question, op1, op2, op3, op4, answer, technology;
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(String question) {
//        this.question = question;
//    }
//
//    public String getOp1() {
//        return op1;
//    }
//
//    public void setOp1(String op1) {
//        this.op1 = op1;
//    }
//
//    public String getOp2() {
//        return op2;
//    }
//
//    public void setOp2(String op2) {
//        this.op2 = op2;
//    }
//
//    public String getOp3() {
//        return op3;
//    }
//
//    public void setOp3(String op3) {
//        this.op3 = op3;
//    }
//
//    public String getOp4() {
//        return op4;
//    }
//
//    public void setOp4(String op4) {
//        this.op4 = op4;
//    }
//
//    public String getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }
//
//    public String getTechnology() {
//        return technology;
//    }
//
//    public void setTechnology(String technology) {
//        this.technology = technology;
//    }
//
//    @Override
//    public String toString() {
//        return "Question{" +
//                "question='" + question + '\'' +
//                ", op1='" + op1 + '\'' +
//                ", op2='" + op2 + '\'' +
//                ", op3='" + op3 + '\'' +
//                ", op4='" + op4 + '\'' +
//                ", answer='" + answer + '\'' +
//                ", technology='" + technology + '\'' +
//                '}';
//    }
//}