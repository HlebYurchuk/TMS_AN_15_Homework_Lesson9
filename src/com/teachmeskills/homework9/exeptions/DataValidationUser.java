package com.teachmeskills.homework9.exeptions;

import java.util.Arrays;

public class DataValidationUser {
    public static boolean Verification (String login, String password, String confirmPassword) throws WrongLoginExeption, WrongPasswordExeption {
        if (login.length() > 20 || login.contains(" ")) {
            throw new WrongLoginExeption( "WrongLoginExeption");
        }
        if (password.length() > 20 || password != confirmPassword) {
            throw new WrongPasswordExeption("WrongPasswordExeption");
        }

        return false;
    }

    public static boolean verificationUserData(String Login, String Password, String ConfirmPassword) throws WrongLoginExeption, WrongPasswordExeption{
        if (validationLogin(Login) && validationPassword(Password, ConfirmPassword)){
            return true;
        }
        return false;
    }
    public static boolean validationLogin(String Login) throws WrongLoginExeption {
        char[] login = Login.toCharArray();

        if (login.length > 20){
            throw new WrongLoginExeption("Неверная длинна");
        }

        for (char c : login) {
            if (c == ' '){
                throw new WrongLoginExeption("Введён ' '");
            }
        }

        return true;
    }

    public static boolean validationPassword (String password, String confirmpassword) throws WrongPasswordExeption{
        char[] passwordArray = password.toCharArray();
        char[] confirmPasswordArray = confirmpassword.toCharArray();
        int count = 0;

        for (char c : passwordArray) {
            if (c >= '0' && c <= '9') {
                count++;
            }
            else if (c == ' '){
                throw new WrongPasswordExeption("Введен ' '");
            }
        }
        if (count <= 0) {
            throw new WrongPasswordExeption("Вы не ввели пароль");
        }
        if (passwordArray.length > 20){
            throw new WrongPasswordExeption("Неверная длинна пароля");
        }
        if (!Arrays.equals(passwordArray, confirmPasswordArray)){
            throw new WrongPasswordExeption("Пароли не совпадают");
        }
        return true;
    }




}
