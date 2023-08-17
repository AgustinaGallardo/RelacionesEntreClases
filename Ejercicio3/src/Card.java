import java.util.ArrayList;
import java.util.List;

public class Card {
    private Integer num;
    private Suit suit;
    public Card() {
    }
    public Card(Integer num, Suit suit) {
        this.num = num;
        this.suit = suit;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", suit=" + suit +
                '}';
    }
}
