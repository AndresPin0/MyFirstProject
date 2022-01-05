package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
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
            }
        }while(response!=0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do{
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");
            //Mostrar la fecha de los doctores que agendaron
            //Indice de la fecha seleccionada por el usuario
            //Una lista de doctores, y esta tiene: 1. Doctor 1 fecha 1, fecha 2, 2. Doctor 2, 3. Doctor 3, y cada uno tiene un array de citas disponibles
            //
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>(); //Como es una colección de objetos, se le agrega Integer, porque Int no va a funcionar
            int k = 0;
            //El primer indice es para enumerar los doctores
            //El segundo indice es para enumerar las fechas de los doctores
            //Y Doctor es para el mapa
            for(int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++){
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointment = new TreeMap<>();

                for(int j = 0; j < availableAppointments.size(); j++){
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointment.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i)); //Para manipular la salida a los usuarios
                    doctors.put(Integer.valueOf(k), doctorAppointment);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc:doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey(); //Se obtiene el index
                doctorSelected = doc.getValue(); //Se obtiene el valor (Doctor)
            }
            System.out.println(doctorSelected.getName() +
                    ". Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");
            response = Integer.valueOf(sc.nextLine());

            if (response )



        }while(response != 0);
    }
}
