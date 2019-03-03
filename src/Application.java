public class Application {
    public static void main(String[] args) {
        BordComputer bc = new BordComputer();
        ControlModul cm1 = new ControlModul(bc);
        ControlModul cm2 = new ControlModul(bc);
        ControlModul cm3 = new ControlModul(bc);
        ControlModul cm4 = new ControlModul(bc);
        Engine[] engines = new Engine[4];
        bc.registerCotrolModul(cm1);
        bc.registerCotrolModul(cm2);
        bc.registerCotrolModul(cm3);
        bc.registerCotrolModul(cm4);
        Cockpit cp = new Cockpit(bc);
        engines[0] = new Engine(1, "Rolls-Royce Trent 900", cm1);
        engines[1] = new Engine(2, "Rolls-Royce Trent 900", cm2);
        engines[2] = new Engine(3, "Rolls-Royce Trent 900", cm3);
        engines[3] = new Engine(4, "Rolls-Royce Trent 900", cm4);
        Airplane ap = new Airplane(bc, cp, engines);
        cp.startButton();

    }
}

