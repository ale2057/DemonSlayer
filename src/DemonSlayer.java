import java.util.Scanner;

public class DemonSlayer {

    public void CombatFlow(){
        Scanner read=new Scanner(System.in);
        String name="Default";
        System.out.println("Put your name: ");
        name=read.next();
        Slayer slayer=new Slayer(name);
    }
}
