import java.util.ArrayList;
//Composite Pattern
public abstract class BladeElementUnit {

    public String getUnitName() {
        return unitName;
    }

    private String unitName;
    private ArrayList<BladeElementUnit> childElements;

    public ArrayList<BladeElementUnit> getChildElements() {
        return childElements;
    }

    public void addElement(BladeElementUnit element){
        childElements.add(element);
    }

    public BladeElementUnit(String unitName){
        this.unitName = unitName;
        this.childElements = new ArrayList<>();
    }
}
