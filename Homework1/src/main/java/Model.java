/**
 * Created by Yaroslava Levchuk on 25.06.2021.
 */
public class Model {
    private String word = "";
    private String sentence = "";

    // The Program logic
    public void addWordToSentence() {
        if(this.sentence.length() != 0) {
            this.sentence += " ";
        }
        this.sentence += this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getWord() {
        return word;
    }

    public String getSentence() {
        return sentence;
    }
}
