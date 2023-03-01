/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Admin
 */
public class Book {
        public String boCode;
        public String boTitle;
        public String boAuthor;
      public Book(){
          this.boAuthor = null;
          this.boCode = null ;
          this.boTitle = null;
          
      }
      public Book(String boCode ,String boTitle ,String boAuthor ){
          this.boAuthor = boAuthor ;
          this.boCode = boCode ;
          this.boTitle = boTitle;
      }
      public Book(Book caisach){
           boAuthor = caisach.boAuthor;
           boCode  = caisach.boCode;
           boTitle =caisach.boTitle;
      }
      //getter
      public String getboCode(){
          return boCode;
      }
      public String getboAuthor(){
          return boAuthor ;
      }
      public String getboTittle(){
          return boTitle;
      }
      //setter
      public void setboCode(String vboCode){
          this.boCode = vboCode;
      }
      public void setboAuthor(String vboAuthor){
          this.boAuthor = vboAuthor;
      }
      public void setboTitle (String vboTitle){
          this.boTitle = vboTitle;
      }
        @Override
      public String toString(){
          return "\nboCode la: "+boCode+"\nboAuthor la: "+ boAuthor+ "\nboTitle la: "+boTitle;
      }
}
