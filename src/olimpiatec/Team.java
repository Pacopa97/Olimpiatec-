
package olimpiatec;

import java.util.ArrayList;



/**
 *
 * @author franc
 */
public class Team {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Sport> sport;

    
    public Team(String name){
        this.name = name;
        this.students = new ArrayList();
        this.sport = new ArrayList();
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public boolean addStudent(Student student){
        for(Student temp : this.students) {
            if(temp.getName().equalsIgnoreCase(student.getName())){
                return false;
            }
        }
        this.students.add(student);
        return true;
    }
    public boolean addSport (Sport sport){
        for(Sport temp : this.sport){
            if(temp.getName().equalsIgnoreCase(sport.getName())){
                return false;
            }
        }
        this.sport.add(sport);
        return true;
    }
 

@Override
public String toString(){
     String list="Team="+this.getName()+"\n Members = \n";
        for (Student student : students) {
            list+="\t Name="+student.getName()+",ID="+student.getID()+", Career = "+student.getCareer()+"\n";
        }
        list += "\t ";
        return list;
    
            
   
}
    
}
