package be.dog.d.steven;

public class Main {

    public static void main(String[] args) {

        Deck deck1 = new Deck();

        System.out.println(deck1);
        deck1.shuffle();
        System.out.println(deck1);
        deck1.dealTopCard();
        System.out.println(deck1);
        deck1.dealTopCard();
        deck1.dealTopCard();
        deck1.dealTopCard();
    }
}
