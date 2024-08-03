public class hufflepuff extends hogwarts{
int diligence;
int loyalty;
int honesty;

    public hufflepuff(String name, String surname, int power, int transgress, int diligence, int loyalty, int honesty) {
        super(name, surname, power, transgress);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int comparisonOfStudents(){
        return super.comparisonOfStudents() + getDiligence() + getLoyalty() + getHonesty() ;
    }
    public String bestStudent(){
        return super.bestStudent() + " лучший ученик Пуффендуй.";
    }
    @Override
    public String toString() {
        return "Факультет Пуффендуй - " + super.toString() + " умение факультета: " +
                " трудолюбивость - " + diligence +
                ", верность - " + loyalty +
                ", честность - " + honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
