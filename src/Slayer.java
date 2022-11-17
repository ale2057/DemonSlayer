import javax.swing.*;
import java.util.Scanner;

public class Slayer {
    private double atq;
    private double def;
    private double vel;
    private double streng;
    private int opt;
    private String name;
    private int inc;

    public Slayer (String name){
        this.name = name;
    }

    public void choiceBreathing(){
        System.out.println("What breathing do you want to learn?");
        System.out.println("1: water breath");
        System.out.println("2: fire breath");
        System.out.println("3: lightning breath");
        Scanner breath= new Scanner(System.in);
        opt = breath.nextInt();
        if (opt>=1 && opt <=3){
            switch (opt){
                case 1:
                    atq=65 ;
                    def=80;
                    vel=70;
                    streng=45;
                    break;
                case 2:
                    atq=85 ;
                    def=60;
                    vel=75;
                    streng=85;
                    break;
                case 3:
                    atq=70;
                    def=50;
                    vel=90;
                    streng=30;
                    break;
            }
        }else{
            System.out.println("Pick a option correct, try again");
        }
    }

    public void train(){
        int max =5 ;
        System.out.println("What skill do you want to improve?");
        System.out.println("1: Attack skill");
        System.out.println("2: Defense skill");
        System.out.println("3: Speed skill");
        System.out.println("4: Strength skill");
        Scanner skill= new Scanner(System.in);
        opt = skill.nextInt();

        if (opt>=1 && opt <=4){
            inc = Dice.DiceFunction(max);
            switch (opt){
                case 1:
                    atq+=inc ;
                    break;
                case 2:
                    def+=inc;
                    break;
                case 3:
                    vel+=inc;
                    break;
                case 4:
                    streng+=inc;
                    break;
            }
        }else{
            System.out.println("Pick a option correct, try again");
        }
    }

    public double getAtq() {
        return atq;
    }

    public void setAtq(double atq) {
        this.atq = atq;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public double getVel() {
        return vel;
    }

    public void setVel(double vel) {
        this.vel = vel;
    }

    public double getStreng() {
        return streng;
    }

    public void setStreng(double streng) {
        this.streng = streng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
