
package ivote;


//abstract class instead of interface?
public interface Question {
    public int[] getVotes();
    public String[] getPossibleAnswers();
    public void submitVote(int vote);
    public void retractVote(int vote);
    public String getPrompt();
}
