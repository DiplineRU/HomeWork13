public class gryffindor extends hogwarts {
    int gratitude;
    int honor;
    int bravery;

    public gryffindor(String name, String surname, int power, int transgress, int gratitude, int honor, int bravery) {
        super(name, surname, power, transgress);
        this.gratitude = gratitude;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int comparisonOfStudents(){
        return super.comparisonOfStudents() + getGratitude() + getHonor() + getBravery();
    }
    public String bestStudent(){
        return super.bestStudent() + " лучший ученик Гриффендора.";
    }
    @Override
    public String toString() {
        return "Факультет Гриффендор - " + super.toString() + " умение факультета: " +
                " Благодарство -  " + gratitude +
                ", честь -  " + honor +
                ", храбрость - " + bravery;
    }

    public int getGratitude() {
        return gratitude;
    }

    public void setGratitude(int gratitude) {
        this.gratitude = gratitude;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


}
