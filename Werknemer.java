package W6;

import java.util.ArrayList;
import java.util.TreeSet;

public class Werknemer {

    private String naam;
    private TreeSet<String> skills = new TreeSet<>();


    public Werknemer(String naam) {
        this.naam = naam;
    }

    public String getNaam(){
        return this.naam;
    }
    public void setNaam(String naam){
        this.naam = naam;
    }

    public boolean voegSkillToe(String skill){
        if(skills.add(skill)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean verwijderSkill(String skill){
        if(skills.remove(skill)){
            return true;
        }
        else{
            return false;
        }
    }

    public void getSkillstoString(){
        for(String skill:skills){
            System.out.println(skill);
        }
    }

}
