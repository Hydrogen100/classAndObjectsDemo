
/**
 * Write a description of class classAndObjectsDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class classAndObjectsDemo
{
    // instance variables - replace the example below with your own
    private String name;
    private int height; //cm
    private int weight; //kg
    private String personality;

    /**
     * Constructor for objects of class classAndObjectsDemo
     */
    public classAndObjectsDemo()
    {
       name="Bob Bob";
       height=173;
       weight=80;
       personality="cynical";
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void jump()
    {
        // put your code here
        System.out.println(name+" jumped!");
    }
    
    public void setHeight(int newHeight){
    height=newHeight;
    }
    
    public int getHeight(){
    return height;
    }
    
    public String getName(){
    return name;
    }
    
    public void newIdentity(String newName){
    name=newName;
    }
    
}
