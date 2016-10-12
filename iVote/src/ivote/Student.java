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
public class Student {
    private String id;
    private IVoteService service;

    public Student(String id, IVoteService service){
        this.id = id;
        this.service = service;
    }
    
    public String getID(){
        return id;
    }
    
    public void submitVote(int vote){
        service.submitVote(id, vote);
    }
}
