import java.util.*;
public class Main
{
    public static void main(String args[]){
        ArrayList<University> table = new ArrayList<University>();
        University test = new University();
        test.setRanking(2);
        test.setName("uni lmao");
        test.setCourseRequirement("AAB");
        test.setCountry("ZIMBABWE");
        
        table.add(test);
        System.out.println(table);
    }
}