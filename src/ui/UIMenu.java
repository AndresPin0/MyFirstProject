package ui;

import model.Doctor;
import model.Patient;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    System.out.println("Patient");
                    authUser(2);
                    response = 0;
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
            }
        }while (response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an Appointments");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                     for (int i = 1; i<4; i++){
                         System.out.println(i + ". " + MONTHS[i]);
                     }
                    break;
                case 2:
                    System.out.println("My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userType es == 1, es Doctor, si es == 2, es paciente

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Marcos", "marco@gmail.com"));
        doctors.add(new Doctor("Andres", "andres@gmail.com"));
        doctors.add(new Doctor("Felipe", "felipe@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Juanito", "alimana@gmail.com"));
        patients.add(new Patient("Alcachofa", "alca@gmail.com"));
        patients.add(new Patient("Pepito", "pepi@gmail.com"));

        boolean emailCorrect = false;

        do {
            System.out.println("Insert your email [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if(userType == 1){
                for (Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener los datos del usuario logueado
                        doctorLogged = d;
                        //showDoctorMenu
                        UIDoctorMenu.showDoctorMenu();

                    }
                }
            }

            if(userType ==2){
                for (Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener los datos del usuario logueado
                        patientLogged = p;
                        //showPatientMenu
                        UIPatientMenu.showPatientMenu();

                    }
                }
            }

        }while(!emailCorrect);


    }
}
