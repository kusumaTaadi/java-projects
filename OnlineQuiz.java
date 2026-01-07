import java.util.*;

class Question {
    String question;
    String[] options;
    int correctAnswer;

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class OnlineQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Question> quiz = new ArrayList<>();

        quiz.add(new Question(
                "Which language is platform independent?",
                new String[]{"C", "Python", "Java", "HTML"}, 3));

        quiz.add(new Question(
                "Which keyword is used to inherit a class in Java?",
                new String[]{"this", "extends", "super", "implements"}, 2));

        quiz.add(new Question(
                "Which collection does not allow duplicates?",
                new String[]{"List", "ArrayList", "Set", "Map"}, 3));

        int score = 0;

        System.out.println("----- Online Quiz -----");

        for (int i = 0; i < quiz.size(); i++) {
            Question q = quiz.get(i);
            System.out.println("\nQ" + (i + 1) + ". " + q.question);

            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            System.out.print("Your answer: ");
            int answer = sc.nextInt();

            if (answer == q.correctAnswer) {
                score++;
            }
        }

        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + "/" + quiz.size());
    }
}

