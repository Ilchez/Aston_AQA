import methods.Methods;
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Methods.printThreeWords();
        Methods.checkSumSign();
        Methods.printColor();
        Methods.compareNumbers();
        System.out.println("\nЗадание 5: " + Methods.findSum(-2,4));
        Methods.findNumber(11);
        System.out.println("\nЗадание 7: " + Methods.findLessZero(-7));
        Methods.printString("Мама мыла раму", 4);
        System.out.println(Methods.yearIsLeap(100));
        int[] array1 = Methods.zeroToOne();
        Methods.printArray(array1);
        int[] array2 = Methods.fillMassive();
        Methods.printArray(array2);
        Methods.changeMassive();
        Methods.squareMassive();
        double[] array3 = Methods.giveArray(8, 1.2);
        Methods.printArray(array3);
    }
}