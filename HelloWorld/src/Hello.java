public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Blake");

        int myFirstNumber = (10 + 5) + 15;
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 15;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        // Take 1000 minus your myTotal
        int myLastOne =  1000 - myTotal;
        System.out.println(myLastOne);
    }
}