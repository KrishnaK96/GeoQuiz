package calc.canvas.org.geoquiz;

/**
 * Created by Krishna on 2/21/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    //Constructor
    public Question(int TextResId, boolean answerTrue){
        this.mTextResId = TextResId;
        this.mAnswerTrue = answerTrue;
    }

    //Getters and setters
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
}
