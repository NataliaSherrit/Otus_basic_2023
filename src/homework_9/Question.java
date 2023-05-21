package homework_9;

import java.util.Scanner;

public class Question {
    int number;
    String question;
    Answer [] answers = new Answer[4];
    public Question(int number, String question) {
        this.number = number;
        this.question = question;
    }

    private void printQuestion(Question question) {
        System.out.printf(" %d. %s\n", question.number, question.question);
        for (Answer answer : question.answers) {
            answer.printAnswer(answer);
        }
    }
    public boolean askQuestionAndVerifyResult(Question question) {
        Scanner answer = new Scanner(System.in);
        printQuestion(question);
        int studentAnswer = answer.nextInt();
        return isStudentAnswerCorrect(studentAnswer);
    }

    private boolean isStudentAnswerCorrect (int studentAnswer) {
        return answers[studentAnswer-1].checkStudentAnswer;
    }
}
