import java.util.Scanner;

public class Userinterface {
    private Scanner sc = new Scanner(System.in);
    private Filehandler fh;

    public Userinterface(Filehandler filehandler) {
        this.fh = filehandler;
    }

    public void start() {
        while (true) {
            System.out.println("Type either 'sort by region' or 'sort by age");
            String userInput = sc.nextLine().toLowerCase();
            switch (userInput) {
                case "sort by age" -> {
                    fh.ageGroupSort();
                    fh.printCovidData();
                }
                case "sort by region" -> {
                    fh.regionSort();
                    fh.printCovidData();
                }
                case "exit" -> {
                    System.out.println("exiting");
                    return;
                }
                default -> System.out.println("try again");
            }
        }
    }
}


