package model;

import java.util.*;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        showMenu(); //Forma resumida de llamar un método
    }
        /*
        int i = 0;
        int b = 2;
        b = i;

        Doctor myDoctor = new Doctor("Andres Pino", "pinoandres85@gmail.com");
        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality+"\n");

        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        Patient patient2 = new Patient("Alexandra", "alexandra@gmail.com");

        System.out.println(myDoctor);

        User user = new Doctor("Anahi", "ana@ama.com"); //Se puede instanciar cómo si fuera un doctor, para darle un comportamiento, porque doctor tiene una implementación de User
        user.showDataUser();

        User userPa = new Patient("Ansai", "ana@ama.com"); //Igualmente con el caso pasado
        userPa.showDataUser();

        User user2 = new User("Andres", "pino@montil.com") { //Acá vemos un ejemplo de cómo usar una clase anónima para instanciar una clase abstracta, se pueden hacer con un subtipo de User
        @Override
            public void showDataUser(){
            System.out.println("Doctor\n");
            System.out.println("Hospital: Cruz verde\n");
            System.out.println("Departamento: Pediatría");


                //Se le puede dar el comportamiento que uno quiera
            }
        }; //Y va a ser temporal

        user2.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override //Métodos anónimos para interfaz
            public void schedule(Date date, String time) {

            }
        };

        //ISchedulable iSchedulable1 = new AppointmentDoctor();

        //ISchedulable.schedule(); //Al pasarle los parametros, se ejecutará la línea de arriba


        for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        System.out.println(patient); //Aquí se llama automaticamente el toString()
        */
}
