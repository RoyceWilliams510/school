public class Teacher extends Person {
    private String subject;
    private Section[] sections= new Section[10];
    private int sectionCount =0;
    public Teacher(int id, String name,String subject){
        super(id,name);
        this.subject= subject;
    }
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String s){
        this.subject =subject;
    }
    public Section[] getSections(){
        return this.sections;
    }
    public void addSections(Section s){
        this.sections[sectionCount] =s;
        this.sectionCount++;
    }
}
