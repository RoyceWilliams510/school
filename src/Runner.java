public class Runner {

    public static void main(String[] args){
        School bhs = new School("Berkeley High");
        Section math = new Section("Math");
        Section bio = new  Section("Biology");
        Section cs = new  Section("Computer Science");
        bhs.addSection(math);
        bhs.addSection(bio);
        bhs.addSection(cs);

        Teacher alb = new Teacher(15, "Albinson","Computer Science");
        Teacher t1 = new Teacher(16,"Teacher1","History");
        Teacher t2= new Teacher(17,"Teacher2","English");

        Student me = new Student(1,"me",12);
        Student friend1 = new Student(6,"friend1",12);
        Student friend2 = new Student(2,"friend2",12);
        Student friend3 = new Student(3,"friend3",12);
        Student friend4 = new Student(4,"friend4",12);
        Student friend5 = new Student(5,"friend5",12);

        cs.setTeacher(alb);
        cs.addStudent(me);
        cs.addStudent(friend5);

        bio.setTeacher(t1);
        bio.addStudent(friend2);

        math.setTeacher(t2);
        math.addStudent(friend3);
        math.addStudent(friend4);
        math.addStudent(friend1);
        System.out.println(math.toString2());
    }


}
