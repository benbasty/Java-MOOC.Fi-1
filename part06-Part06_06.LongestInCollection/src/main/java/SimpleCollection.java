
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest(){
        if(this.elements.isEmpty()){
            return null;
        }
        // create an object reference for the object to be returned
        String longest = this.elements.get(0);
        
        // go through the list
        for(String element: elements){
            // compare each object on the list
            if(longest.length() < element.length()){
                longest = element;
            }
        }
        return longest;
        
        
    }

}
