public class ravenclaw extends hogwarts {
    int smart;
    int wise;
    int witty;
    int creative;

    public ravenclaw(String name, String surname, int power, int transgress, int smart, int wise, int witty, int creative) {
        super(name, surname, power, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }
    public int comparisonOfStudents(){
        return super.comparisonOfStudents() + getSmart() + getWise() + getWitty() + getCreative();
    }
    public String bestStudent(){
        return super.bestStudent() + " лучший ученик Когтевран.";
    }

    @Override
    public String toString() {
        return "Факультет Когтевранцы - " + super.toString() + " умение факультета " +
                " интеллект - " + smart +
                ", мудрость - " + wise +
                ", остроумность - " + witty +
                ", творчество - " + creative;
    }
   // это я потом исправлю с пробелами, вопрос, как мне добавить чтобы когда я вызывал метод он писал перед "имя" "факультет"
    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }
}
