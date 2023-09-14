package com.teachmeskills.homework9;

import com.teachmeskills.homework9.exeptions.DataValidationUser;
import com.teachmeskills.homework9.exeptions.WrongLoginExeption;
import com.teachmeskills.homework9.exeptions.WrongPasswordExeption;

public class Main {
    public static void main(String[] args)  throws WrongLoginExeption, WrongPasswordExeption {

        try {
            if (DataValidationUser.verificationUserData("HlebYurchuk", "123", "123")) {
                System.out.println("Success");
            }
        } catch (WrongPasswordExeption | WrongLoginExeption e) {
            System.out.println("Error " + e.getMessage());
        }

        try {
            if (DataValidationUser.Verification("Hleb Yurchuk", "1231", "1231")) {
                System.out.println("Success 2");
            }
        } catch (WrongPasswordExeption | WrongLoginExeption e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
