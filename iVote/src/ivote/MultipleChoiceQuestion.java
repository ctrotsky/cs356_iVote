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
public class MultipleChoiceQuestion implements Question{
    private String prompt;
    private int[] votes;
    private String[] possibleAnswers;
    
    public MultipleChoiceQuestion(String prompt, String[] possibleAnswers){
        this.prompt = prompt;
        votes = new int[possibleAnswers.length];
        this.possibleAnswers = possibleAnswers;
    }
    
    public String getPrompt(){
        return prompt;
    }
    
    public int[] getVotes(){
        return votes;
    }
    
    public String[] getPossibleAnswers(){
        return possibleAnswers;
    }
    
    public void submitVote(int vote){
        votes[vote] = votes[vote] + 1;
    }
    
    public void retractVote(int vote){
         votes[vote] = votes[vote] - 1;
    }
    
}
