package pak;

public class Boy extends Create implements IHuman,IBoy {
    public Boy(int age, String name) {
        super(name, age);
        System.out.println("Created person " + name);
    }
    public void think() {
    	System.out.println(" 'Perhaps it will do for a ghost' thought the " + this.GetName() );
    }


    public void walk(Things things) {
        System.out.println(this.GetName() + " went to the " + things);
    }
    
    public String toString() {
        return "Boy{" + this.GetName() + '}';
    }
    
    public void see(Things things) {
        System.out.println(this.GetName() + " see " + things);
    }
    
    public void read(Things things) {
        System.out.println(this.GetName() + " read the inscription on the " + things);
        
    }
    
    public void made(Things things) {
    	System.out.println("\n" + this.GetName() + " made new " + things);
    }
     void shuddered() {
    	 System.out.println(this.GetName() + " is shiddered ");
    	 class Local {
    		 void shuddered() {
    			 System.out.println("It seemed to him that Karlson looked extremely mysterious");
    			 
    		 }
    	
    }
    	 Local local = new Local();
    	 local.shuddered();
     }
    
     
}
