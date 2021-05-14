package model;

public class Nurse extends User {
    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
        System.out.println("The name of the nurse assigned is: " + name);

    }

    @Override
    public void showDataUser() {
        System.out.println("Employee of the hospital: Pablo Tobon");
        System.out.println("Departments: Nutrition and Diet - Pediatrics");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}


