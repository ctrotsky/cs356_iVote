/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivote;

import java.util.Random;

/**
 *
 * @author Colin
 */
public class SimulationDriver {
    
    public static void main(String[] args) {
        boolean running = true;
        
        Random rand = new Random();
        OfflineIVoteService service = new OfflineIVoteService();
        Student[] students = new Student[20];   
        
        for (int i = 0; i < students.length; i++){
            students[i] = new Student(String.valueOf(rand.nextInt(1000000)), service);
        }
        
        while (running){
            String[] answers = {"A","B","C"};
            service.setQuestion(new MultipleChoiceQuestion("What's your favorite letter of the alphabet?", answers));
            
            for (Student s : students){
                s.submitVote(1);
            }
            
            students[5].submitVote(2);
            students[5].submitVote(1);
            students[5].submitVote(0);
            
            running = false;
        }
        
        service.displayResults();
    }
}
