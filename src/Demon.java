import java.util.Scanner;

public class Demon {
    double atq=0;
    double def=0;
    double vel=0;
    double streng=0;
    String name=" ";

    boolean band=true;

    public void setDef(double aef) {
        this.def = def;
    }

    public double getDef() {
        return def;
    }

    public void setAtq(double atq) {
        this.atq = atq;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStreng(double streng) {
        this.streng = streng;
    }

    public double getStreng() {
        return streng;
    }

    public void setVel(double vel) {
        this.vel = vel;
    }

    public double getVel() {
        return vel;
    }

    public void setBand(boolean band) {
        this.band = band;
    }

    public boolean isBand() {
        return band;
    }

    public void SelectMision(){
        double opt=0;
        boolean cont=true;
        Scanner read=new Scanner(System.in);
        do {
            System.out.println("Select your mission: ");
            System.out.println("1) Kill the Shadow Demon. ");
            System.out.println("2) Kill the Spider Demon. ");
            System.out.println("3) Kill the Ogre Demon. ");
            opt=read.nextDouble();
        }while (isBand());
    }

    public void CreateDemon(double val){
        switch ((int)val){
            case 1:
                setVel(110);
                setStreng(70);
                setName("Shadow Demon");
                break;
            case 2:
                setDef(100);
                setStreng(50);
                setAtq(80);
                setName("Spider Demon");
                break;
            case 3:
                setVel(40);
                setAtq(90);
                setStreng(110);
                setName("Ogre Demon");
                break;
            default:
                setBand(false);
                break;
        }
    }
}
