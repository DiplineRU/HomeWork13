public class slytherin extends hogwarts {
    int cunning;
    int cdetermination;
    int ambition;
    int resourcefulness;
    int thirstForPower;

    public slytherin(String name, String surname, int power, int transgress, int cunning, int cdetermination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, power, transgress);
        this.cunning = cunning;
        this.cdetermination = cdetermination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public int comparisonOfStudents(){
        return super.comparisonOfStudents() + getCunning() + getCdetermination() + getAmbition() + getResourcefulness() + getThirstForPower();
    }
    public String bestStudent(){
        return super.bestStudent() + " лучший ученик Слизерин.";
    }
    @Override
    public String  toString() {
        return "Факультет Слизерин - " + super.toString() + " умение факультета: " +
                " Хитрость - " + cunning +
                ", решительность - " + cdetermination +
                ", амбициозность - " + ambition +
                ", находчивость - " + resourcefulness +
                ", жажда власти - " + thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getCdetermination() {
        return cdetermination;
    }

    public void setCdetermination(int cdetermination) {
        this.cdetermination = cdetermination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}
