/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Admin
 */
public class Student {
   public String stID;
   public String stName;
   public String stClass;
    public Student(){
        this.stClass = null;
        this.stID = null;
        this.stName = null;
    }
    public Student(String stID, String stName, String stClass){
        this.stClass = stClass ;
        this.stID = stID;
        this.stName = stName;
    }
    //setter
    public void setstID (String vstID){
        this.stID = vstID ;
    }
    public void setstName (String vstName){
        this.stName = vstName ;
    }
    public void setstClass (String vstClass){
        this.stClass = vstClass ;
    }
    //getter
    public String getstID(){
        return this.stID  ;
    }
     public String getstName(){
        return this.stName  ;
    }
      public String getstClass(){
        return this.stClass  ;
    }
   @Override
    public String toString(){
        return "Name cua hoc sinh la: "+ this.stName + "\nID cua hoc sinh la: "+ this.stID 
                + "\nClass cua hoc sinh la : "+ this.stClass ;
    }
}
