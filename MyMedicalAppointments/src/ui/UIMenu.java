package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Select the option");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i <= 3; i++) {
                        System.out.println(i + "." + MONTHS[i]);

                    }
                    break;
                case 2:
                    System.out.println("::My appointments");

                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }


    //Authentication method
    private static void authUser(int userType) {

        //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("John Martinez", "johh@gmail.com"));
        doctors.add(new Doctor("Andres Rodriguez", "andres@gmail.com"));
        doctors.add(new Doctor("Violeta Palacios", "violeta@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Antonio Banderas", "antonio@gmail.com"));
        patients.add(new Patient("Mel Gibson", "mel@gmail.com"));
        patients.add(new Patient("Brad Pitt", "brad@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email:  [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        //Get the logged user
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();

                    }
                }

            }

            if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();

                    }
                }

            }
        } while (!emailCorrect);


    }
}
