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
        printMessage("Now it's time for you to fulfill your missions...");
        printMessage("Select one of the missions...");
        Menu();
    }

    public void Combat(){
        double inc=0;
        switch (demon.getName()){
            case "Shadow Demon":
                printMessage("There have been reports that in one of the nearby villages people have been going missing...");
                printMessage("According to some of the survivors, it is a demon that attacks from the shadows...");
                printMessage("Stay alert, you must use your speed to defeat this demon...");
                printMessage("Already in the village you manage to find the demon...");
                Banners.ShadowDemon();
                if(demon.getVel()>slayer.getVel()){
                    inc=Dice.DiceFunction(20);
                    printMessage("Your speed points are very low, roll the dice...");
                    System.out.println("the dice came up "+inc);
                    printMessage("You now have a total of "+(slayer.getVel()+inc)+" speed points");
                    if((slayer.getVel()+inc)>demon.getVel()){
                        printMessage("You have enough speed points...");
                        printMessage("The Demon was defeated");
                    }else{
                        printMessage("Your speed points are not enough...");
                        printMessage("The Demon has defeated you");
                    }
                }else {
                    printMessage("Your skills surpass those of the deon, you defeated him blindfolded...");
                }
                Menu();
                break;
            case "Spider Demon":
                printMessage("Several disappearances have occurred in a forest on the outskirts of Tokyo... this mission is complicated...");
                printMessage("This demon uses trees as a hideout and defense...");
                printMessage("Your attack will be crucial to defeat him...");
                Banners.ShadowDemon();
                if(demon.getDef()>slayer.getAtq()){
                    inc=Dice.DiceFunction(20);
                    printMessage("Your attack points are very low, roll the dice...");
                    System.out.println("the dice came up "+inc);
                    printMessage("You now have a total of "+(slayer.getAtq()+inc)+" speed points");
                    if((slayer.getAtq()+inc)>demon.getDef()){
                        printMessage("You have enough attack points...");
                        printMessage("The Demon was defeated");
                    }else{
                        printMessage("Your attack points are not enough...");
                        printMessage("The Demon has defeated you");
                    }
                }else {
                    printMessage("Your skills surpass those of the demon, you defeated him blindfolded...");
                }
                Menu();
                break;
            case "Ogre Demon":
                printMessage("The inhabitants of the city have suffered from water shortages...");
                printMessage("A demon with the strength of an ogre does not allow access to the river...");
                printMessage("Kill him or people will die of thirst...");
                Banners.ShadowDemon();
                if(demon.getStreng()>slayer.getStreng()){
                    inc=Dice.DiceFunction(20);
                    printMessage("Damn, the demon managed to hold your sword when you were about to cut off his head...");
                    printMessage("Your strength will be crucial to get rid of this and defeat him...");
                    printMessage("Your strength points are very low, roll the dice...");
                    System.out.println("the dice came up "+inc);
                    printMessage("You now have a total of "+(slayer.getAtq()+inc)+" strength points");
                    if((slayer.getStreng()+inc)>demon.getStreng()){
                        printMessage("You have enough strength points...");
                        printMessage("The Demon was defeated");
                    }else{
                        printMessage("Your strength points are not enough...");
                        printMessage("The Demon has defeated you");
                    }
                }else {
                    printMessage("Your skills surpass those of the demon, you defeated him blindfolded...");
                }
                Menu();
                break;
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

    public void Menu(){
        demon=new Demon();
        demon.SelectMision();
        Combat();
    }
}
