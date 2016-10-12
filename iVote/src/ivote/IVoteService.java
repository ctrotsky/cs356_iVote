/***************************************************************
* file: IVoteService.java
* author: Colin Trotter
* class: CS 356 – Object-Oriented Design and Programming
*
* assignment: iVote
* date last modified: 10/11/2016
*
* purpose: An interface used to create types of IVoteServices in which students can submit answers for a given question.
*
****************************************************************/ 
package ivote;

public interface IVoteService {
    /*
    * FUNCTION: setQuestion()
    *
    * Should set a new question object for students to submit answers to.
    */
    public void setNewQuestion(Question question);
    
    /*
    * FUNCTION: displayResults()
    *
    * Should displays the results of the current question to the user.
    */
    public void displayResults();
    
    /*
    * FUNCTION: submitVote()
    *
    * Submits a vote from a student to the currentQuestion. Should be called by a Student object.
    */
    public void submitVote(String ID, int vote);
}
