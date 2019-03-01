import java.util.ArrayList;

public class Blade {

    ArrayList<BladeElement> elements;

    public Blade(){
        elements =  new ArrayList();

        BladeElementArea main = new BladeElementArea("Main-Element");
        for(int i = 0; i<=10;i++){

            BladeElementArea sub = new BladeElementArea("Sub-Element");
            for(int j = 0; j<5;j++){

                sub.addElement(new BladeElement("Element"));
            }
            main.addElement(sub);
        }


    }

}
