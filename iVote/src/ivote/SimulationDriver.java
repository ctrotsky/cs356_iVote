/***************************************************************
* file: SimulationDriver.java
* author: Colin Trotter
* class: CS 356 – Object-Oriented Design and Programming
*
* assignment: iVote
* date last modified: 10/11/2016
*
* purpose: A simulation to test the functionality of the OfflineIVoteService. Randomly generates students, questions,
* and their responses to the question.
*
****************************************************************/ 
package ivote;

import java.util.Random;


public class SimulationDriver {
    
    public static void main(String[] args) {
        boolean running = true;
        
        Random rand = new Random();
        OfflineIVoteService service = new OfflineIVoteService();
        int numStudents = rand.nextInt(50);
        Student[] students = new Student[numStudents];   
        
        System.out.println("Total number of students in this simulation: " + numStudents);
        
        for (int i = 0; i < students.length; i++){
            students[i] = new Student(String.valueOf(rand.nextInt(1000000)), service);
        }
        
        
        
        //First question is multiple choice with 3 possible choices
        String[] answers = {"A","B","C"};
        service.setNewQuestion(new MultipleChoiceQuestion("What's your favorite letter of the alphabet?", answers));

        for (Student s : students){
            s.submitVote(rand.nextInt(3));
        }

        service.displayResults();

        students[5].submitVote(2);  //change student[5]'s vote to 2
        students[5].submitVote(1);  //change student[5]'s vote to 1 again to be sure they are not able to vote twice
        students[5].submitVote(5);  //try to vote for an invalid choice to make sure it is not counted and their previous vote remains

        
        
        //Second question is single choice with True or False answers
        service.setNewQuestion(new SingleChoiceQuestion("This statement is false.", "True", "False"));

        for (Student s : students){
            s.submitVote(rand.nextInt(2));
        }

        service.displayResults();
    }
}
