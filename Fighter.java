public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodgeRate;
    Fighter (String name, int damage, int health, int weight, int dodgeRate){
        this.dodgeRate = dodgeRate;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }
    public int hit(Fighter foe){
        System.out.println(this.name+" isimli dövüşçü=>>>> "+ foe.name+ " isimli dövüşçüye=>>> "+this.damage+" Hasar vurdu");
        if (foe.isDodge()){
            System.out.println(foe.name+" İsimli dövüşçü hasarı blokladı!");
            return foe.health;
        }
        if (foe.health - this.damage<0){
            return 0;
        }
        return (foe.health-this.damage);
    }
    boolean isDodge(){
        double randomNumber = (Math.random()*100);
        return randomNumber <= this.dodgeRate;
    }

}
