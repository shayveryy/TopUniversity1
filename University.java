public class University    //public keyword means class is available to other classes in this program
{
    // attributes (variables that each instance is given a set of), private meaning accesible only within the declared class itself
    private int ranking;
    private String name;
    private String country;
    private String CourseRequirement;

    //constructor method 
    public University(int ranking, String name, String country, String CourseRequirement) 
    {        
        this.ranking = ranking;
        this.name = name;
        this.country = country;
        this.CourseRequirement = CourseRequirement;
    }
    
    public University(){}

    //override the toString() method, if you don't have this when outputting you get a reference to the object
    // not the values of the object
    @Override   
    public String toString() 
    {
        return this.ranking + ", " + this.name + ", " +   this.country + "," + this.CourseRequirement;
    }

    //methods - getters and setters
    public int getRanking() { return ranking;}

    public String getName() {return name;}

    public String getCountry() {return country;}
    
    public String getCourseRequirement() {return CourseRequirement;}

    //this keyword highlights that the attribute is being assigned to rather than the parameter being assigned to itself
    public void setRanking(int ranking) {this.ranking = ranking;}

    public void setName(String name){this.name = name;}

    public void setCountry(String country){this.country = country;}
    
    public void setCourseRequirement(String CourseRequirement){this.CourseRequirement = CourseRequirement;}
}
