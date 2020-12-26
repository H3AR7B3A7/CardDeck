package be.dog.d.steven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void create_a_valid_card_test(){
        Card card = new Card("ace","spades");
        assertEquals("ace",card.getFace());
        assertEquals("spades", card.getSuit());
    }

    @Test
    void create_an_invalid_face_card_throws_error_test(){
        assertThrows(IllegalArgumentException.class, () -> {new Card("faulty", "spades");});
    }

    @Test
    void create_an_invalid_suit_card_throws_error_test(){
        assertThrows(IllegalArgumentException.class, () -> {new Card("ace", "faulty");});
    }

    @Test
    void card_equals_other_card_test(){
        Card card = new Card("ace","spades");
        Card other = new Card("ace","spades");
        assertEquals(other,card);
    }
}