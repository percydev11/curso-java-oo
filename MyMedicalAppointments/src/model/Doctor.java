package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {


    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String name, String email) {
        super(name, email);

    }

    //Overwriting toString() method  of  the parent class User
    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality +
                "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {

        System.out.println("Employee of the hospital: La Maria");
        System.out.println("Departament: Neurology");

    }


    //Method for add the appointments
    public void addAvailableAppointment(String date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    //Show the appointments in the ArrayList
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    //Static inner class
    public static class AvailableAppointment {

        private int idAvailable;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        //Overwriting toString() method of the class Object
        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date +
                    "\nTime: " + time;
        }

        public int getIdAvailable() {
            return idAvailable;
        }

        public Date getDate(String Date) {
            return date;
        }

        public String getDate() {
            return format.format(date);
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

