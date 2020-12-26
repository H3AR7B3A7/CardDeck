package be.dog.d.steven;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String face, suit;

    public Card(String face, String suit) {
        setFace(face);
        setSuit(suit);
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    /**
     * Validate and set faceName
     * @param face The faceName to set the card to
     */
    private void setFace(String face) {
        List<String> validFaceNames = getValidFaces();
        face = face.toLowerCase();

        if (validFaceNames.contains(face))
            this.face = face;
        else
            throw new IllegalArgumentException("Valid face names are: "+
                    validFaceNames);
    }

    /**
     * Validate and set suit
     * @param suit The suit to set the card to
     */
    private void setSuit(String suit) {
        List<String> validSuits = getValidSuits();
        suit = suit.toLowerCase();

        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("valid suits are: "+ validSuits);
    }

    /**
     * This method returns a list of face names that are valid for Card objects
     * @return 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace
     */
    public static List<String> getValidFaces() {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack",
                "queen","king","ace");
    }

    /**
     * This method will return a list of valid suits
     * @return spades, hearts, clubs, diamonds
     */
    public static List<String> getValidSuits() {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    @Override
    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}
