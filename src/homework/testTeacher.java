package homework;

public class testTeacher {
    public static void main(String[] args) {
        ChemistryTeacher ob1=new ChemistryTeacher();
        ob1.name="hanane";
        ob1.age=28;
        ob1.gender="female";
        ob1.speaking();
        ob1.smiling();
        ob1.polite();
        ob1.friendly();


        MathTeacher ob2=new MathTeacher();
        ob2.name="sami";
        ob2.age=31;
        ob2.gender="male";
        ob2.speaking();
        ob2.smiling();
        ob2.polite();
        ob2.friendly();


        PianoTeacher ob3=new PianoTeacher();
        ob3.name="fati";
        ob3.age=35;
        ob3.gender="female";
        ob3.speaking();
        ob3.smiling();
        ob3.polite();
        ob3.friendly();

    }
}
