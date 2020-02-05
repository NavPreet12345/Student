/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Navpreet Kaur Jhajj
 */
public class Student {
    String name;
    String Address;

    public Student() {
         this.name = "Navpreet";
        this.Address = "34 CCC B ";
    }

    public Student(String name, String Address) {
        this.name = name;
        this.Address = Address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
  
    
}
