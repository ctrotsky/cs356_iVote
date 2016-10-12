/***************************************************************
* file: Question.java
* author: Colin Trotter
* class: CS 356 – Object-Oriented Design and Programming
*
* assignment: iVote
* date last modified: 10/11/2016
*
* purpose: An interface used to create types of Questions for use with an IVoteService.
*
****************************************************************/ 
package ivote;

public interface Question {
    
    /*
    * FUNCTION: getPrompt()
    *
    * Returns the prompt for this question.
    */
    public String getPrompt();
    
    /*
    * FUNCTION: getVotes()
    *
    * Returns the current number of votes for each possibleAnswer.
    */
    public int[] getVotes();
    
    /*
    * FUNCTION: getPossibleAnswers()
    *
    * Returns the array of possible answers to the question.
    */
    public String[] getPossibleAnswers();
    
    /*
    * FUNCTION: submitVote()
    *
    * Adds one vote to the given answer index.
    */
    public void submitVote(int vote);
    
    /*
    * FUNCTION: retractVote()
    *
    * Subtracts one vote from the given answer index.
    */
    public void retractVote(int vote);
    
}
