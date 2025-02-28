public class MathMagic {
    public static void main(String[] args) {
        // Variable original
        int myNumber = 5; // Puedes cambiar este número a cualquier entero entre -46,341 y 46,340
        int magicNumber = myNumber; // Inicializamos magicNumber con el valor de myNumber

        // Realizamos los pasos utilizando solo magicNumber
        magicNumber *= magicNumber; // stepOne: myNumber * myNumber
        magicNumber += myNumber;     // stepTwo: stepOne + myNumber
        magicNumber /= myNumber;      // stepThree: stepTwo / myNumber
        magicNumber += 17;            // stepFour: stepThree + 17
        magicNumber -= myNumber;      // stepFive: stepFour - myNumber
        magicNumber /= 6;             // stepSix: stepFive / 6

        // Imprimimos el resultado final
        System.out.println(magicNumber);
    }
}
