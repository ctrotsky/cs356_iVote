/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivote;

/**
 *
 * @author Colin
 */
public interface IVoteService {
    public void setQuestion(Question question);
    public void displayResults();
    public void submitVote(String ID, int vote);
}