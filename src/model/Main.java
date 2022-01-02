package model;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //showMenu(); //Forma resumida de llamar un método

        int i = 0;
        int b = 2;
        b = i;

        Doctor myDoctor = new Doctor("Andres Pino", "pinoandres85@gmail.com");
        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality+"\n");

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        Patient patient2 = new Patient("Alexandra", "alexandra@gmail.com");

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "6am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Anahi", "ana@ama.com");
        user.showDataUser();

        User userPa = new Patient("Ansai", "ana@ama.com");
        userPa.showDataUser();

        User user2 = new User("Andres", "andres@pino.com") {
            @Override
            public void showDataUser() {

            }
        }
        /*

        for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/

        System.out.println(patient); //Aquí se llama automaticamente el toString()
    }
}
