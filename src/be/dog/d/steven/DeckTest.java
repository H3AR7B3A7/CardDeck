package be.dog.d.steven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void create_a_deck_size_test(){
        Deck deck = new Deck();
        assertEquals(52, deck.getDeck().size());
    }

    @Test
    void decks_are_created_in_same_order_test(){
        Deck deck = new Deck();
        Deck ordered = new Deck();

        assertEquals(ordered.getDeck(), deck.getDeck());
    }

    @Test
    void deck_shuffle_works_test(){
        Deck deck = new Deck();
        Deck ordered = new Deck();

        deck.shuffle();

        assertNotEquals(ordered.getDeck(), deck.getDeck());
    }
}