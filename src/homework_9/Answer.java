package homework_9;

public class Answer {
    int number;
    String answer;
    boolean checkStudentAnswer;

    public Answer(int number, String answer, boolean checkAnswer) {
        this.number = number;
        this.answer = answer;
        this.checkStudentAnswer = checkAnswer;
    }

    protected void printAnswer(Answer answer) {
        System.out.printf(" %d. %s\n", answer.number, answer.answer);
        }

}
