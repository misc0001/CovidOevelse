public class Main {
    public static void main(String[] args) {
        Filehandler filehandler = new Filehandler();
        filehandler.start();

        Userinterface ui = new Userinterface(filehandler);
        ui.start();
    }
}

