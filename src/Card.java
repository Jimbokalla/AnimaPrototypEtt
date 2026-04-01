public class Card {
    // Ja detta hade kunnat vara hårdkodat, men poängen är att det är en prototyp.
    // Så har kodat det som om vi skulle försöka göra slutprodukten här.
    private String cardSymbol = "O";

    // Bara gjord för att den ska finnas egentligen
    public Card(){
    }

    // Gjord för att symbolisera något snarare än en faktiskt funktion
    public String getCardSymbol() {
        return cardSymbol;
    }

    public void setCardSymbol(String cardSymbol) {
        this.cardSymbol = cardSymbol;
    }
}
