import java.util.Scanner;

public class DemonSlayer {
    Slayer slayer;
    Demon demon;
    public void CombatFlow(){
        Banners.Logo();
        Scanner read=new Scanner(System.in);
        String name="Default";
        System.out.println("Put your name: ");
        name=read.next();
        slayer=new Slayer(name);
        slayer.choiceBreathing();
        printMessage("Now we must train you to level up one of your skills...");
        printMessage("It's been 4 years since you started your training...");
        printMessage("Select the skill you wish to level up, a dice will be rolled to determine the amount of points you will earn...");
        slayer.train();
        demon=new Demon();
        demon.SelectMision();
        Combat();
    }

    public void Combat(){
        if (demon.getAtq()> slayer.getAtq()){
            System.out.println("your attack points are very low, roll the dice");

            if((slayer.getAtq()+Dice.DiceFunction(3))>demon.getAtq()){
                System.out.println("the Demon was defeated");
            }else{
                System.out.println("the Demon has defeated you");
            }
        }
    }

    public static void printMessage(String message) {
        if (message == null)
            return;
        StringBuilder backspaceBuilder = new StringBuilder();
        for (int i = 0 ;  i < message.length() ; i++) {
            String sub = message.substring(0, i + 1);
            try {
                Thread.sleep(25L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(backspaceBuilder.toString() + sub);
            backspaceBuilder.append('\b');
        }
        System.out.println();
    }
}
