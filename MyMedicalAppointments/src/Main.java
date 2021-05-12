import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Doctor myDoctor = new Doctor("Vanesa Percy", "percy@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);
       // System.out.println(myDoctor.getAvailableAppointments());
 /*
        for (model.Doctor.AvailableAppointment avApp: myDoctor.getAvailableAppointments())
            System.out.println(avApp.getDate() + " " + avApp.getTime());
*/
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra Zárate", "alejandra@gmail.com");
        System.out.println(patient);


    }


}
