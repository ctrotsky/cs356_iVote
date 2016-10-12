/***************************************************************
* file: OfflineIVoteService.java
* author: Colin Trotter
* class: CS 356 – Object-Oriented Design and Programming
*
* assignment: iVote
* date last modified: 10/11/2016
*
* purpose: An implementation of the iVote service designed to be used offline and by randomly generated Student objects.
*
****************************************************************/ 
package ivote;

import java.util.HashMap;

public class OfflineIVoteService implements IVoteService{
    private Question currentQuestion;
    //replace 20 with numstudents
    private HashMap<String, Integer> voteMap = new HashMap(20);
    
    
    /*
    * FUNCTION: setNewQuestion()
    *
    * Sets the question object for which students can submit answers. Also clears the voteMap so that students can vote again.
    */
    public void setNewQuestion(Question question){
        currentQuestion = question;
        voteMap.clear();
    }
    
    /*
    * FUNCTION: displayResults()
    *
    * Prints the current results of the currentQuesiton to the console. Shows the prompt, followed by the possible answers with
    * their respective vote counts.
    */
    public void displayResults(){
        
        int[] votes = currentQuestion.getVotes();
        String[] possibleAnswers = currentQuestion.getPossibleAnswers();
        
        System.out.println("=====" + currentQuestion.getPrompt() + "=====");
        for (int i = 0; i < votes.length; i++){
            System.out.println(possibleAnswers[i] + ": " + votes[i]);
        }
    }
    
    /*
    * FUNCTION: submitVote()
    *
    * Submits a vote to the currentQuestion. If a student with the same ID has already voted, then this vote will overwrite
    * their previous vote. Only allows votes that are possible answers to the question.
    */
    public void submitVote(String id, int vote){
        if (vote < currentQuestion.getPossibleAnswers().length && vote >= 0){
            Integer oldVote = voteMap.put(id, vote);
            //if this student has voted before, retract their previous vote
            if (oldVote != null){
                currentQuestion.retractVote(oldVote);        
            }
            currentQuestion.submitVote(vote);
        }
        else {
            System.out.println("Erorr: Invalid vote (" + vote + ") from student: \"" + id + "\"");
        }
    }
}