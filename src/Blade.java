import java.util.ArrayList;

public class Blade {

    ArrayList<BladeElementArea> elements;

    public Blade(){
        elements =  new ArrayList();
        for(int h=0;h<4;h++){

        BladeElementArea main = new BladeElementArea("Main-Element");
        for(int i = 0; i<10;i++){

            BladeElementArea sub = new BladeElementArea("Sub-Element");
            for(int j = 0; j<5;j++){

                sub.addElement(new BladeElement("Element"));
            }
            main.addElement(sub);
        }
        elements.add(main);
        }



    }

}
