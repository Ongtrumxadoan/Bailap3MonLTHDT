/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
 
/**
 *
 * @author Admin
 */
public class Main {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student newStudent = new Student();
        newStudent.setstClass("10DCNTT2");
        newStudent.setstID("12312312");
        newStudent.setstName("Vu trong phuong");
        
        System.out.println(newStudent.toString());
        
        Book newBook =new Book();
        newBook.setboAuthor("trong phuong");
        newBook.setboCode("123123123");
        newBook.setboTitle("what tou nam");
         System.out.println(newBook.toString());
    }
    
}
