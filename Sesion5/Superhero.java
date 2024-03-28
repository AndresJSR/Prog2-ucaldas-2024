public class Superhero {

     public String superhero_name=""; 
     public int superpowers_number=0; 
     public String [] superpower =new String [0]; 
     public  boolean isAlive = false; 
     public int universe=0; 
     
        
     public Superhero(String superhero_name_param, int superpowers_number_param, String [] superpowers_param, boolean isAlive_param, int universe_param){
        this.superhero_name = superhero_name_param;
        this.superpowers_number = superpowers_number_param;
        this.superpower = superpowers_param;
        this.isAlive = isAlive_param;
        this.universe = universe_param;
     }
     public void showSuperpowers(){
        for (int i =0; i<superpower.length; i++){
            System.out.println(superpower[i]);
        }
    }
}