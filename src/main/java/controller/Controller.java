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

    /**
     * this method begins work
     */
    public void processUser() {
        view.printMessage(View.INPUT_NAME);
        inputNameWithCheck();
        view.printMessage(View.INPUT_SURNAME);
        inputSurnameWithCheck();
        view.printMessage(View.INPUT_TELEPHONE);
        inputTelephoneWithCheck();
        view.printMessage(View.INPUT_EMAIL);
        inputEmailWithCheck();
        printUserData();
    }

    /**
     * method set user`s input name to registration form if it is correct
     */
    public void inputNameWithCheck() {
        String name = inputData();
        while (!isNameCorrect(name)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            name = inputData();
        }
        model.getRegistrationForm().setName(name);
    }

    /**
     * method check user`s input name
     * @param name which needed to check
     * @return true if name correct
     */
    public boolean isNameCorrect(String name) {
        return name.matches(RegexConstants.NAME);
    }

    /**
     * method set user`s input surname to registration form if it is correct
     */
    public void inputSurnameWithCheck() {
        String surname = inputData();
        while (!isSurnameCorrect(surname)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            surname = inputData();
        }
        model.getRegistrationForm().setSurname(surname);
    }
    /**
     * method check user`s input surname
     * @param surname which needed to check
     * @return true if surname correct
     */
    public boolean isSurnameCorrect(String surname) {
        return surname.matches(RegexConstants.SURNAME);
    }

    /**
     * method set user`s input telephone to registration form if it is correct
     */
    public void inputTelephoneWithCheck() {
        String telephone = inputData();
        while (!isTelephoneCorrect(telephone)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            telephone = inputData();
        }
        model.getRegistrationForm().setTelephone(telephone);
    }
    /**
     * method check user`s input telephone
     * @param telephone which needed to check
     * @return true if telephone correct
     */
    public boolean isTelephoneCorrect(String telephone) {
        return telephone.matches(RegexConstants.TELEPHONE);
    }

    /**
     * method set user`s input email to registration form if it is correct
     */
    public void inputEmailWithCheck() {
        String email = inputData();
        while (!isEmailCorrect(email)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            email = inputData();
        }
        model.getRegistrationForm().setEmail(email);
    }
    /**
     * method check user`s input email
     * @param email which needed to check
     * @return true if email correct
     */
    public boolean isEmailCorrect(String email) {
        return email.matches(RegexConstants.EMAIL);
    }

    /**
     * method print user`s input information
     */
    public void printUserData() {
        view.printMessage(model.getRegistrationForm().getName() + " " + model.getRegistrationForm().getSurname() + " "
        + model.getRegistrationForm().getTelephone() + " " + model.getRegistrationForm().getEmail());
    }

    /**
     *
     * @return user`s input data
     */
    public String inputData() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;
    }
}
