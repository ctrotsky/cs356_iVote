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
    public void setNewQuestion(Question question);
    public void displayResults();
    public void submitVote(String ID, int vote);
}
