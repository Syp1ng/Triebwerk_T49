import java.util.ArrayList;

//Composite Pattern
public abstract class BladeElementUnit {

    private String unitName;
    private ArrayList<BladeElementUnit> childElements;

    public BladeElementUnit(String unitName) {
        this.unitName = unitName;
        this.childElements = new ArrayList<>();
    }

    public String getUnitName() {
        return unitName;
    }

    public ArrayList<BladeElementUnit> getChildElements() {
        return childElements;
    }

    public void addElement(BladeElementUnit element) {
        childElements.add(element);
    }
}
