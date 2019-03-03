public class BladeElement extends BladeElementUnit {
    private String[] structure;

    public BladeElement(String name) {
        super(name);
        structure = new String[5];
        for (int i = 0; i <= 4; i++) structure[i] = "++-/-*+*-*+:-*++";}

    public String[] getStructure() {
        return structure;
    }

}
