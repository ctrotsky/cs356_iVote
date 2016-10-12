/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivote;

import java.util.HashMap;

/**
 *
 * @author Colin
 */
public class OfflineIVoteService implements IVoteService{
    private Question currentQuestion;
    //replace 20 with numstudents
    private HashMap<String, Integer> voteMap = new HashMap(20);
    
    public void setQuestion(Question question){
        currentQuestion = question;
    }
    
    public void displayResults(){
        
        int[] votes = currentQuestion.getVotes();
        String[] possibleAnswers = currentQuestion.getPossibleAnswers();
        
        System.out.println("=====" + currentQuestion.getPrompt() + "=====");
        for (int i = 0; i < votes.length; i++){
            System.out.println(possibleAnswers[i] + ": " + votes[i]);
        }
    }
    
    public void submitVote(String id, int vote){
        Integer oldVote = voteMap.put(id, vote);
        //if this student has voted before, retract their previous vote
        if (oldVote != null){
            currentQuestion.retractVote(oldVote);        
        }
        currentQuestion.submitVote(vote);
    }
}


//stuff to do, random number of students, check for vote out of bounds