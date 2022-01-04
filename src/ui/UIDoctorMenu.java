package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome" + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available appointment");
            System.out.println("2. My schedule appointment");
            System.out.println("0. Log out");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default:
            }
        }while(response != 0);
    }

    private static void addAvailableAppointment(){
        int response = 0;
        do{
            System.out.println("\n:: Add available appointment");
            System.out.println(":: Select amount");
            for (int i = 0; i < 3; i++){
                int numMonths = i + 1;
                System.out.println(numMonths + " . " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response <4){
                int monthSelected = response;
                System.out.println(response + " . " + UIMenu.MONTHS[monthSelected]);
                System.out.println("Insert the date available [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change date");
                int responseDate = Integer.valueOf(sc.nextLine());

                if(responseDate == 2) continue; //Continue no se sale del ciclo, sino que evita solo la siguiente línea

                int responseHour = 0;
                String time = "";

                do{
                    System.out.println("Insert the time available for date " + date + " [14:00");
                    time = sc.nextLine();
                    System.out.println("Your time is: " + time + "\n1. Correct \n2. Change time");
                    responseHour = Integer.valueOf(sc.nextLine());
                }while(responseHour == 2);

                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);


            }else if(response ==0){
                showDoctorMenu();
            }

        }while(response!=0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
