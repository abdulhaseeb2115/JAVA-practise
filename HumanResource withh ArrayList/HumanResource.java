/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabSess2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mypc
 */
public class HumanResource {
    ArrayList<Association> HRList;
    
    public HumanResource() {
        HRList = new ArrayList<Association>();
    }
    public boolean delHumanResource(String n, String id){
        return HRList.remove(new Person(n,id));
          
    }
    public void addHumanResource(String name, String id, String type){
        if(HRList.size()==0)
           HRList = new ArrayList<Association>(1); 

        if(type.matches("Teacher"))
            HRList.add(new Teacher(name, id));           
        else if(type.matches("Student"))
            HRList.add(new Student(name, id));
        
        HRList.get(HRList.size()-1).associate();
        
    }

    @Override
    public String toString(){
        String s="";
        for(int i=0;i<HRList.size();i++)
        {
        s=s + "\n"+HRList.get(i).toString();
        }
        return s;
    }

    
}
