
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int number;
    private String name;
    private String role;

    /**
     * Constructor for objects of class Player
     */
    public Player( int theNumber,String theName, String theRole)
    {
        number = theNumber;
        name = theName;
        role = theRole;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public void setName(String theName)
    {
        name = theName;
    }   
}
