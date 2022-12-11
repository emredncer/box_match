public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean weightCheck() {
        return ((this.f1.weight <= maxWeight && this.f1.weight >= minWeight) && (this.f2.weight <= maxWeight && this.f2.weight >= minWeight));
        }
    void fightStarter(){
        if(weightCheck()){
            System.out.println("Müsabaka başladı!");
            System.out.println("==================");
            int firstFinder = Math.round((float)Math.random());
            while (this.f1.health>0 && this.f2.health>0){
                if (firstFinder == 0){
                    System.out.println(f1.name+" İsimli Dövüşçü ilk vuruşu yapacak!");
                    f2.health = f1.hit(f2);
                    if (isDead())break;
                    f1.health = f2.hit(f1);
                    if (isDead()) break;
                }
                if (firstFinder == 1){
                    System.out.println(f2.name+" İsimli Dövüşçü ilk vuruşu yapacak!");
                    f1.health = f2.hit(f1);
                    if (isDead())break;
                    f2.health = f1.hit(f2);
                    if (isDead()) break;
                }
            print();
            }
        }else {
            System.out.println("Müsabaka iptal! SEBEP: Siklet uyuşmazlığı!");
        }

    }
    boolean isDead(){
        if (this.f1.health==0){
            System.out.println(f2.name+" isimli dövüşçü kazandı!");
            return true;
        }if (this.f2.health==0){
            System.out.println(f1.name+" isimli dövüşçü kazandı!");
            return true;
        }
        return false;

    }
    void print (){
        System.out.println("============================");
        System.out.println(f1.name+" isimli dövüşçünün canı: "+" "+f1.health);
        System.out.println(f2.name+" İsimli dövüşçünün canı: "+" "+f2.health);
        System.out.println("============================");
    }
}

