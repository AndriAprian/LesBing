package com.example.bing;

public class QuestionLibrary {

    private String mQuestions [] = {
            "1. I and my friends … in the library. We read some books",
            "2. She … not work because she has the flu.",
            "3. My brother rides a bike to school …",
            "4. Alina … song every night.", "sings",
            "5. My father … tea every morning.", "drinks",
            "6. They … a test every week.",
            "7. Tomy, Jane, Mark, Sarah ………. smart students.",
            "8. She is a student. She … at school.", "studies",
            "9. We … soccer match.",
            "10. Gina have dick. It … amazing.",


    };


    private String mChoices [][] = {
            {"am", "is", "have", "are"}, //1
            {"is", "does", "do", "be"}, //2
            {"everyday","last day", "next week","next time"},//3
            {"sings", "sing", "is", "does"},//4
            {"drink", "drinks", "drinking", "does"},//5
            {"does", "as", "are", "have"},//6
            {"are", "does", "not", "am not"},//7
            {"is", "are", "studies", "is not"},//8
            {"doing", "watching", "watches", "watch"},//9
            {"does", "do", "are", "is"}//10
    };



    private String mCorrectAnswers[] = {"are", "does", "every day", "sings","drinks", "have", "are", "studies", "watch", "is"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
