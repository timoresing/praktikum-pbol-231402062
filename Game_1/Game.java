package Game_1;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        // scanner.nextLine();

        System.out.println("Pilih class/job : ");
        System.out.println("1. Hero");
        // System.out.println("2. Marksman");
        int pilihan = scanner.nextInt();

        Karakter player;
        
        if (pilihan == 1) {
            player = new Hero(nama, 100, 15);
        } else {
            player = new Hero(nama, 100, 15);
        }
        Karakter enemy = new Enemy("Goblin", 100, 15);

        while (player.getHP() > 0 && enemy.getHP() > 0) {
            System.out.println("1. Attack");
            System.out.println("2. Defend");
            int pilihanPlayer = scanner.nextInt();
            scanner.nextLine();

            if (pilihanPlayer == 1) {
                player.attack(enemy);
                enemy.attack(player);
            } else {
                player.defend();
                enemy.attack(player);
            }

            System.out.println(player.getNama() + " HP : " + player.getHP());
            System.out.println(enemy.getNama() + " HP : " + enemy.getHP());
        }

        if (player.getHP() <= 0) {
            System.out.println("Player win!");
        } else {
            System.out.println("Enemy win!");
        }

        scanner.close();
    }
}

class Karakter {
    private String nama;
    private int HP;
    private int damage;

    public Karakter(String nama, int HP, int damage) {
        this.nama = nama;
        this.HP = HP;
        this.damage = damage;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getNama() {
        return nama;
    }
    
    public int getHP() {
        return HP;
    }
    
    public int getDamage() {
        return damage;
    }

    public void attack (Karakter target) {

    }

    public void defend () {

    }
}

class Hero extends Karakter {
    public Hero(String nama, int HP, int damage) {
        super(nama, 100, 20);
    }

    public void attack(Karakter target) {
        // target.setHP(target.getHP() - this.getDamage());
        int damage = new Random().nextInt(getDamage());
        target.setHP(target.getHP() - damage);
        System.out.println(getNama() + " menyerang " + target.getNama() + " dengan damage " + damage);
    }

    public void defend() {

    }
}

class Enemy extends Karakter {
    public Enemy(String nama, int HP, int damage) {
        super(nama, 100, 15);
    }

    public void attack(Karakter target) {
        // target.setHP(target.getHP() - this.getDamage());
        int damage = new Random().nextInt(getDamage());
        target.setHP(target.getHP() - damage);
        System.out.println(getNama() + " menyerang " + target.getNama() + " dengan damage " + damage);
    }

    public void defend() {

    }
}