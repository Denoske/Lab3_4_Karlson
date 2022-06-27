package pak;
import java.util.ArrayList;
public class Place {
    public static String name;
	static Location location;
    private ArrayList<Create> objects = new ArrayList<Create>();
    private ArrayList<Create> persons = new ArrayList<Create>();
    public Place(String name, Location location) {
        Place.name = name;
        Place.location = location;
        System.out.println("Created place " + name + " at " + location.getLocation());
    }
    public void addObject(Create create) {
        objects.add(create);
        System.out.println("Added new object " + create.GetName() + " in " + name );
    }
    public void addPerson(Create create) {
        persons.add(create);
        System.out.println("Added new person " + create.GetName() + " in " + name );
    }
    public void remObject(Create create) {
    objects.remove(create);
        System.out.println("Removed object " + create.GetName() + " in " + name );
    }
    public void remPerson(Create create) {
    persons.remove(create);
        System.out.println("Removed person " + create.GetName() + " in " + name );
    }  
}
