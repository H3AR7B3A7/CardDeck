package be.dog.d.steven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Deck(){
        List<String> suits = Card.getValidSuits();
        List<String> faces = Card.getValidFaces();

        deck = new ArrayList<>();

        for (String suit:suits){
            for (String face:faces){
                deck.add(new Card(face,suit));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card dealTopCard() {
        if (deck.size()>0) {
            System.out.println(deck.get(0).toString());
            return deck.remove(0);
        }
        else
            return null;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}
