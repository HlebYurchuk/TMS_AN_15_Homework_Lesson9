package com.teachmeskills.homework9.exeptions;

public class WrongLoginExeption extends Exception{

String loginWrong;

public WrongLoginExeption (String message ){
    super(message);
    this.loginWrong = message;
}

    @Override
    public String toString() {
        return "WrongLoginExeption{" +
                "loginWrong='" + loginWrong + '\'' +
                '}';
    }
}

