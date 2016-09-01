
/**
 * Write a description of class classAndObjectsDemo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class classAndObjectsDemo2
{
    // instance variables - replace the example below with your own
   public static void main(String[] args){
    classAndObjectsDemo human1=new classAndObjectsDemo();
    human1.jump();
    System.out.println(human1.getName());
    human1.newIdentity("Joseph Bob");
    System.out.println(human1.getName());
    System.out.println(human1.getHeight());
    }
}
