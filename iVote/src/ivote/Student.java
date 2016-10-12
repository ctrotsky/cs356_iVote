/***************************************************************
* file: Student.java
* author: Colin Trotter
* class: CS 356 – Object-Oriented Design and Programming
*
* assignment: iVote
* date last modified: 10/11/2016
*
* purpose: A representation of a student. They are able to submit votes to their IVoteService, and each has a unique student ID.
*
****************************************************************/ 
package ivote;

public class Student {
    private String id;
    private IVoteService service;

    public Student(String id, IVoteService service){
        this.id = id;
        this.service = service;
    }
    
    /*
    * FUNCTION: getID()
    *
    * Returns the unique ID string for this student.
    */
    public String getID(){
        return id;
    }
    
    
    /*
    * FUNCTION: submitVote()
    *
    * Submits a vote for the current question of the student's IVoteService.
    */
    public void submitVote(int vote){
        service.submitVote(id, vote);
    }
}
