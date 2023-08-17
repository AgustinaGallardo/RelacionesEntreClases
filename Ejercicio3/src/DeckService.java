import java.util.*;

public class DeckService {
    List<Card> deckOfCards ;
    List<Card> deckOfCardsOut ;
    private int cardIndex;
    private Scanner sc;
    public DeckService() {
        sc  = new Scanner(System.in);
        deckOfCards = new LinkedList<>();
        deckOfCardsOut = new LinkedList<>();
        initializeDeck();
        cardIndex = 0;
    }
    public void welcomeGame(){
        System.out.println("Bienvenido al juego de las cartas!!!!");
        System.out.println("Comienza el juego...");
    }
    private void initializeDeck() {
        for (Suit suit : Suit.values()) {
            for (int number = 1; number <= 12; number++) {
                if (number != 8 && number != 9) {
                    deckOfCards.add(new Card(number, suit));
                }
            }
        }
    }
    //barajar(): cambia de posición todas las cartas aleatoriamente.
    public void shuffle() {
        System.out.println("Mezclaremos el mazo para jugar!!");
        Collections.shuffle(deckOfCards);
    }

    // • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
    // se haya llegado al final, se indica al usuario que no hay más cartas.
    public Card nextCard(){
        if (cardIndex >= deckOfCards.size()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
        Card nextCard = deckOfCards.get(cardIndex);
        deckOfCardsOut.add(nextCard);
        cardIndex++;
        return nextCard;
    }

    // * • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cardsAvailable(){
       return deckOfCards.size();
    }

    // * • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
    // *      * cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    // *      * debemos indicárselo al usuario.

    public void giveCards() {
        System.out.println("Cuantas cartas quiere?");
        int numCard = Integer.parseInt(sc.nextLine());

        if(numCard < deckOfCards.size()){
            System.out.println("Aquí tiene " + numCard + " cartas:");
            for (int i = 0; i < numCard; i++) {
                Card nextCard = nextCard();
                System.out.println(nextCard);
            }
        }else{
            System.out.println("No quedan tantas cartas! No puedo darte ninguna....");
        }
    }

    //* • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
    // *      * indicárselo al usuario

    public void cardsHeap(){
        if(deckOfCardsOut.size()>1){
            for (Card c: deckOfCardsOut
                 ) {
                System.out.println("Laas cartas que ya salieron son: ");
                System.out.println(c);
            }
        }else{
            System.out.println("Aun no salio ninguna carta!");
        }
    }

    //mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
    // *      * luego se llama al método, este no mostrara esa primera carta.

    public void showDeck(){
        /**
         * for (Card c: deckOfCards
         *              ) {
         *             System.out.println(c);
         *         }
         */
        deckOfCards.forEach((e) -> System.out.println(e));
    }


}
