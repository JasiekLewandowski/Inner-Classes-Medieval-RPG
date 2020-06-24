public class Knight {

    private int strength;
    private int defence;
    private int manaPoints;
    private Sword currentSword;

    public Knight(int strength, int defence, int manaPoints) {
        this.strength = strength;
        this.defence = defence;
        this.manaPoints = manaPoints;
        currentSword = new Sword("bastard sword",10,10,false);
        }

        public void changeSword (String name, int length, int damage, boolean isMagical){
        this.currentSword = new Sword (name, length, damage, isMagical);
        }

        public int magicAttack (){
            int damage = lightAttack();
        if (currentSword.isMagical) {
            int magicDamage = damage + manaPoints * this.currentSword.getDamage();
            System.out.println(magicDamage + " magic damage dealt!");
            return magicDamage;
        }
        else
            System.out.println("This is an ordinary sword! You can't do that!");
        return damage;
        }
        
    public int lightAttack () {
        int damage = this.strength*this.currentSword.getDamage();
        System.out.println(damage + " damage dealt!");
        return damage;

    }
    public class Sword{
        private String name;
        private int length;
        private int damage;
        boolean isMagical;

        public Sword(String name, int length, int damage, boolean isMagical) {
            this.name = name;
            this.length = length;
            this.damage = damage;
            this.isMagical = isMagical;
        }

        public int lightAttack (){
            return Knight.this.strength*this.damage;
        }

        private void printSwordStats (){
            System.out.println("This sword is " + this.length + " cm long, makes " + this.damage + " damage.");
        }

        public int getDamage() {
            return damage;
        }

        public boolean isMagical() {
            return isMagical;
        }

        public String getName() {
            return name;
        }
    }
}
