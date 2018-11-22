/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

import java.time.LocalDate;

/**
 *
 * @author Acer
 */
public class Book {
    /*
    declare Instance variables 
    */
    private String studentFirstName,studentLastName, bookName, bookLanguage;
    private LocalDate reserveDate;
    private int studentNum; 
    /*
    Constrctor for the instance variables 
    */
    public Book(String studentFirstName, String studentLastName, String bookName, String bookLanguage, LocalDate reserveDate, int studentNum) {
        setStudentFirstName(studentFirstName);
        setStudentLastName(studentLastName);
        setBookName(bookName);
        setBookLanguage(bookLanguage);  
        setReserveDate(reserveDate);
        setStudentNum(studentNum);
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        if (studentFirstName.matches("[A-Z][a-z]*"))
            this.studentFirstName = studentFirstName;
        else
            throw new IllegalArgumentException(" student first name must start with an upper case letter");
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        if (studentLastName.matches("[A-Z][a-z]*"))
            this.studentLastName = studentLastName;
        else
            throw new IllegalArgumentException(" student last name must start with an upper case letter");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if(!bookName.isEmpty())
            this.bookName = bookName;
        else 
            throw new IllegalArgumentException("Book name should not be empty");
    }

    public String getBookLanguage() {
        return bookLanguage;
    }

    public void setBookLanguage(String bookLanguage) {
        if (!bookLanguage.matches("[English][Punjabi][Hindi][French]*"))
           this.bookLanguage = bookLanguage;
        else
            throw new IllegalArgumentException("Book language should match to given languages");
    }
    
    public LocalDate getReserveDate() {
        return reserveDate;
    }

    public void setReserveDate(LocalDate reserveDate) {
        if(reserveDate.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("resreve date should be matches to the given validation"); 
        else
               this.reserveDate = reserveDate;
    }
    
    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
      if(studentNum > 0)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("Student number cannot be less than 0");
    }
}
