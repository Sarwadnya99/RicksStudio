package RicksStudio;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;
    public Inventory(){
        guitars = new LinkedList<Guitar>();
    }
    public void addGuitar(Guitar guitar){
        guitars.add(guitar);
    }
    public Guitar getGuitar(String serialNumber){
        for(Guitar g : guitars){
            if(g.getSerialNumber() == serialNumber){
                return g;
            }
        }
        return null;
    }
    public Guitar searchGuitar(Guitar myGuitar){
        for(Guitar it : guitars){
            if(
                (it.getTopWood() == myGuitar.getTopWood()) &&
                (it.getBackWood() == myGuitar.getBackWood()) &&
                (it.getModel() == myGuitar.getModel()) &&
                (it.getPrice() == myGuitar.getPrice()) &&
                (it.getType() == myGuitar.getType()) &&
                (it.getbuilder() == myGuitar.getbuilder())
            ){
                return it;
            }
        }
        return null;
    }
}
