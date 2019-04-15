public class Student extends Person{
    private int grade;
    private  Section[] sections =new Section[10];
    private int sectionCount =0;
    public Student(int id,String name,int grade){
        super(id,name);
        this.grade =grade;

    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public void addSection(Section s){
        this.sections[sectionCount] =s;
        this.sectionCount++;
    }
    public Section[] getSections(){
        return sections;
    }
}
