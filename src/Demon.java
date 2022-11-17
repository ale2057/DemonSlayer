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
        Scanner read=new Scanner(System.in);
        do {
            System.out.println("Select your mission: ");
            System.out.println("1) Kill the Shadow Demon. ");
            System.out.println("2) Kill the Spider Demon. ");
            System.out.println("3) Kill the Ogre Demon. ");
            opt=read.nextDouble();
            CreateDemon(opt);
        }while (band);
    }

    public void CreateDemon(double val){
        switch ((int)val){
            case 1:
                vel=110;
                streng=70;
                name="Shadow Demon";
                band=false;
                break;
            case 2:
                def=100;
                streng=50;
                atq=80;
                name="Spider Demon";
                band=false;
                break;
            case 3:
                vel=40;
                atq=90;
                streng=110;
                name="Ogre Demon";
                band=false;
                break;
            default:
                band=true;
                break;
        }
    }
}
