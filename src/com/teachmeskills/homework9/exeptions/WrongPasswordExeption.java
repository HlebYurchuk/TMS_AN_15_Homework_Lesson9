package com.teachmeskills.homework9.exeptions;

public class WrongPasswordExeption extends Exception{
 String passwordExeption;

 public WrongPasswordExeption(String message){
     super(message);
    this.passwordExeption = message;
 }

    @Override
    public String toString() {
        return "WrongPasswordExeption{" +
                "passwordExeption='" + passwordExeption + '\'' +
                '}';
    }
}

