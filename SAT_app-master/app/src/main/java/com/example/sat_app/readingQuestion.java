package com.example.sat_app;

public class readingQuestion {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String explanation;
    private int correctAnswer;
    private int optionSelected;
    private String id;

    public readingQuestion(String question, String option1, String option2, String option3, String option4, String explanation, int correctAnswer, String id) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.explanation = explanation;
        this.correctAnswer = correctAnswer;
        this.id = id;
        optionSelected = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOptionSelected() {
        return optionSelected;
    }

    public void setOptionSelected(int optionSelected) {
        this.optionSelected = optionSelected;
    }

    public readingQuestion() {

    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
