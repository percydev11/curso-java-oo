package model;

public class Nurse extends User {
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
        System.out.println("El nombre del enfermero(a) asignado es: " + name);

    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del hospital: Pablo Tobón");
        System.out.println("Departamentos: Nutrición - Pediatría");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}


