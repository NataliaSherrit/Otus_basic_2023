package homework_9;

public class Question {
    int number;
    String question;
    Answer [] answers = new Answer[4];
    public Question(int number, String question) {
        this.number = number;
        this.question = question;
    }

    public static void printQuestion(Question question) {
        System.out.printf(" %d. %s\n", question.number, question.question);
        for (Answer answer : question.answers) {
            Answer.printAnswer(answer);
        }
    }

    public boolean isStudentAnswerCorrect (int studentAnswer) {
        return answers[studentAnswer-1].checkStudentAnswer;
    }
}
