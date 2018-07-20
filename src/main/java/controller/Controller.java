package controller;

import model.Model;
import model.RegexConstants;
import view.View;

import java.util.Scanner;

/**
 * Created by Таня on 19.07.2018.
 */
public class Controller implements RegexConstants {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        view.printMessage(View.INPUT_NAME);
        inputNameWithCheck();
        view.printMessage(View.INPUT_SURNAME);
        inputSurnameWithCheck();
        view.printMessage(View.INPUT_TELEPHONE);
        inputTelephoneWithCheck();
        view.printMessage(View.INPUT_EMAIL);
        inputEmailWithCheck();
    }

    public void inputNameWithCheck() {
        String name = inputData();
        while (!isNameCorrect(name)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            name = inputData();
        }
        model.getRegistrationForm().setName(name);
    }

    public boolean isNameCorrect(String name) {
        return name.matches(RegexConstants.NAME);
    }

    public void inputSurnameWithCheck() {
        String surname = inputData();
        while (!isSurnameCorrect(surname)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            surname = inputData();
        }
        model.getRegistrationForm().setSurname(surname);
    }

    public boolean isSurnameCorrect(String surname) {
        return surname.matches(RegexConstants.SURNAME);
    }

    public void inputTelephoneWithCheck() {
        String telephone = inputData();
        while (!isTelephoneCorrect(telephone)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            telephone = inputData();
        }
        model.getRegistrationForm().setTelephone(telephone);
    }

    public boolean isTelephoneCorrect(String telephone) {
        return telephone.matches(RegexConstants.TELEPHONE);
    }

    public void inputEmailWithCheck() {
        String email = inputData();
        while (!isEmailCorrect(email)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            email = inputData();
        }
        model.getRegistrationForm().setEmail(email);
    }

    public boolean isEmailCorrect(String email) {
        return email.matches(RegexConstants.EMAIL);
    }

    public String inputData() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }
}
