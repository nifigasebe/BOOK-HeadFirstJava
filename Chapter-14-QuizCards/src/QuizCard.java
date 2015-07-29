/**
 * Created by alexeychizhov on 30.10.2014.
 */
public class QuizCard {

    //конструктор QuizCard card = new QuizCard(questions.getText(), answer.getText());
    //getQuestions getAnswer card.getQuestion() + "/"); card.getAnswer() + "\n");
    String question;
    String answer;

    QuizCard (String q,String a){
        question = q;
        answer = a;
    }

    public String getAnswer() {
        return answer;
    }

    public String getQuestion() {
        return question;
    }
}