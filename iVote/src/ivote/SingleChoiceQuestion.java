/***************************************************************
* file: SingleChoiceQuestion.java
* author: Colin Trotter
* class: CS 356 – Object-Oriented Design and Programming
*
* assignment: iVote
* date last modified: 10/11/2016
*
* purpose: An implementation of the Question interface which represents a question with only two possible answers.
*
****************************************************************/ 
package ivote;

public class SingleChoiceQuestion implements Question{
private String prompt;
    private int[] votes;
    private String[] possibleAnswers;
    
    public SingleChoiceQuestion(String prompt, String possibleAnswer1, String possibleAnswer2){
        this.prompt = prompt;
        votes = new int[2];
        this.possibleAnswers = new String[]{possibleAnswer1, possibleAnswer2};
    }
    
    /*
    * FUNCTION: getPrompt()
    *
    * Returns the prompt for this question.
    */
    public String getPrompt(){
        return prompt;
    }
    
    /*
    * FUNCTION: getVotes()
    *
    * Returns the current number of votes for each possibleAnswer.
    */
    public int[] getVotes(){
        return votes;
    }
    
    /*
    * FUNCTION: getPossibleAnswers()
    *
    * Returns the array of possible answers to the question.
    */
    public String[] getPossibleAnswers(){
        return possibleAnswers;
    }
    
    /*
    * FUNCTION: submitVote()
    *
    * Adds one vote to the given answer index.
    */
    public void submitVote(int vote){
        votes[vote] = votes[vote] + 1;
    }
    
    /*
    * FUNCTION: retractVote()
    *
    * Subtracts one vote from the given answer index.
    */
    public void retractVote(int vote){
         votes[vote] = votes[vote] - 1;
    }
}
