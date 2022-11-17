public class Dice {
    public static int DiceFunction(int max){
        return (int)((Math.random() * ((max - 1) + 1)) + 1);
    }
}
