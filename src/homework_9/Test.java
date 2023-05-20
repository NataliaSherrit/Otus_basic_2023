package homework_9;


import java.util.Scanner;

public class Test {
    static int correctCount = 0;
    static int wrongCount = 0;
    static Scanner answer = new Scanner(System.in);
    public static void main(String[] args) {


        Question question1 = new Question(1, "Кто автор комедии 'Горе от ума'?");
        question1.answers[0] = new Answer(1, "Грибоедов", true);
        question1.answers[1] = new Answer(2, "Пушкин", false);
        question1.answers[2] = new Answer(3, "Лермонтов", false);
        question1.answers[3] = new Answer(4, "Петров-Водкин", false);

        Question question2 = new Question(2, "Кто написал картину 'Апофеоз истории славянства'?");
        question2.answers[0] = new Answer(1, "Густав Климт", false);
        question2.answers[1] = new Answer(2, "Альфонс Муха", true);
        question2.answers[2] = new Answer(3, "Карл Брюллов", false);
        question2.answers[3] = new Answer(4, "Антонис ван Дейк", false);

        Question question3 = new Question(3, "Кто автор сюиты 'Пер Гюнт'?");
        question3.answers[0] = new Answer(1, "Петр Чайковский", false);
        question3.answers[1] = new Answer(2, "Вольфганг Моцарт", false);
        question3.answers[2] = new Answer(3, "Эдвард Григ", true);
        question3.answers[3] = new Answer(4, "Ференц Лист", false);


        var questions = new Question[] {question1, question2, question3};
        for (Question question : questions) {
            Question.printQuestion(question);
            int studentAnswer = answer.nextInt();
            if (question.isStudentAnswerCorrect(studentAnswer))
                ++correctCount;
            else
                ++wrongCount;
        }
        System.out.println("Резульаты тестирования: ");
        System.out.println("Правильных ответов: " + correctCount + " Неправильных ответов: " + wrongCount);

    }
}

