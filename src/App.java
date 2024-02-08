public class App {

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public void start() {
        House slytherin = new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"});
        HogwartsTeacher snape = new HogwartsTeacher("Severus Snape", slytherin );

        System.out.println(slytherin);
        System.out.println(snape);
    }
}
