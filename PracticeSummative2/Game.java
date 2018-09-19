public class Game
{
    
    public static void main(String[] args)
    {
        
        Player rex = new Player(2,"rex","dinosaur");
        
        System.out.println(rex.getName());
        rex.setName("blob");
        System.out.println(rex.getName());
        
        
        
}}