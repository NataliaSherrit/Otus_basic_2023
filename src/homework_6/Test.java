package homework_6;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    static int correctCount = 0;
    static int wrongCount = 0;
    static Scanner answer = new Scanner(System.in);
    static String[] questions = new String[] {
            "Первый вопрос: Кто автор комедии 'Горе от ума'?",
            "Второй вопрос: Кто написал картину 'Апофеоз истории славянства'?",
            "Третий вопрос: Кто автор сюиты 'Пер Гюнт'?"};;
    static String[][] answers = new String[][]{
            {"Грибоедов", "Пушкин", "Лермонтов", "Петров-Водкин"},
            {"Густав Климт", "Альфонс Муха", "Карл Брюллов", "Антонис ван Дейк"},
            {"Петр Чайковский", "Вольфганг Моцарт", "Эдвард Григ", "Ференц Лист"}};
    static String[] correctAnswers = new String[]{"Грибоедов", "Альфонс Муха", "Эдвард Григ"};

    public static void main(String[] args) {
        testStudent();
        System.out.println("Резульаты тестирования: ");
        System.out.println("Правильных ответов: " + correctCount + " Неправильных ответов: " + wrongCount);
    }

    private static void testStudent() {
        for(int i = 0; i < questions.length; ++i) {
            System.out.println(questions[i]);
            System.out.println(Arrays.deepToString(answers[i]));
            System.out.print("Введите ответ: ");
            String studentAnswer = answer.nextLine();
            if (!studentAnswer.equals(correctAnswers[i])) {
                ++wrongCount;
            } else {
                ++correctCount;
            }
        }
    }
}
