public class Section {
    private Teacher teacher;
    private Student[] students=new Student[50];
    private String name;
    private int currentSize =0;
    public Section(String name){
        this.name =name;
    }
    public void setTeacher(Teacher t){
        this.teacher=t;
    }
    public Teacher getTeacher(){
        return this.teacher;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String s){
        this.name = s;
    }
    public void addStudent(Student s){
        this.students[currentSize]= s;
        currentSize++;
    }
    public String toString2(){
        String studentNames = " ";
        for(int i =0; i<this.currentSize; i++){
            studentNames+=" "+students[i].getName();
        }
        return "This "+this.name+" class is taught by "+this.teacher.getName()+" and has "+this.currentSize+ " students:"+ studentNames;
    }
}
