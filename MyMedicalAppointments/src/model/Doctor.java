package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {


    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String name, String email) {
        super(name, email);
        System.out.println("El nombre del doctor asignado es: " + name);
        this.speciality = speciality;
    }

    //Sobreescriendo de la clase padre (model.User)
    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality +
                "\nAvailable: " + availableAppointments.toString();
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //Agregar citas
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    //Mostrar las citas en lista
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    //Clase estática anidada
    public static class AvailableAppointment {

        private int idAvailable;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        //Sobreescriendo de la clase Object
        @Override
        public String toString() {
            return "Avaible Appointments \nDate: " + date +
                    "\nTime: " + time;
        }

        public int getIdAvailable() {
            return idAvailable;
        }

        public Date getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

        public void setIdAvailable(int idAvailable) {
            this.idAvailable = idAvailable;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }


    }

}

