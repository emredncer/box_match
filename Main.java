public class Main {
    public static void main(String[] args) {
    Fighter f1 = new Fighter("Mc Gregor",24, 100,90,30);
    Fighter f2 = new Fighter("Khabib", 24, 100,100,35);


    Match match = new Match (f1,f2,90,100);
        match.fightStarter();

    }
}