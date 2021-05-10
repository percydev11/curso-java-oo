public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email) {
        //Viene de la clase padre User
        super(name, email);
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }

    public String getWeight() {

        return this.weight + " Kg.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHeight() {
        return height + " m.";
    }


    public String getBirthday() {
        return birthday;
    }

    public String getBlood() {
        return blood;
    }



    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight()
                +"\nHeight: " + getHeight() + "\nBlood: " + blood;
    }
}
