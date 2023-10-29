public class hogwarts {
    private String name;
    private String surname;
    private int power;
    private int transgress;

    public hogwarts(String name, String surname, int power, int transgress) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.transgress = transgress;
    }
    public int comparisonOfStudents() {
        return getTransgress() + getPower();
    }
    public String bestStudent(){
        return getName();
    }
    @Override
    public String toString() {
        return  " имя: " + name +
                " фамилия " + surname +
                " сила " + power +
                " трансгрессия " + transgress;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}

