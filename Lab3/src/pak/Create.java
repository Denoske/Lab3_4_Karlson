package pak;
import java.util.Objects;
public abstract class Create implements IHuman {
    private String name;
    private int age;
    public Create(String name, int age) {
    	this.age = age;
        this.name = name;

    }

    	
    	
    
    public int GetAge() {
        return age;
    }
    
    
    public String GetName() {
        return name;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Create create = (Create) o;
        return age == create.age &&
                Objects.equals(name, create.name);
    }
    public int hashCode() {
        return Objects.hash(name, age);
        
    }
}