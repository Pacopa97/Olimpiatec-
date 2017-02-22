
package olimpiatec;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Sport {
    private String name;
    private ArrayList<Team> teams;
    
    
public Sport(String name){
    this.name=name;
    this.teams=new ArrayList();
}

public String getName(){
    return this.name;
}

public boolean addStudent(Team teams){
    for(Team temp: this.teams){
        if(temp.getName().equalsIgnoreCase(teams.getName())){
        return false;
    }
    }
    this.teams.add(teams);
    teams.addSport(this);
    return true;
}


public boolean addTeam(Team teams){
        for(Team temp : this.teams) {
            if(temp.getName().equalsIgnoreCase(teams.getName())){
                return false;
            }
        }
        this.teams.add(teams);
        teams.addSport(this);
        return true;
    }
@Override
public String toString(){
    String string="Sport: "+this.getName()+"\n Atendants = \n";
       for (Team team : teams) {
            string+="\t"+team.toString()+"\n";
        }
        string += "\t ";
        return string;
    }
}
    
