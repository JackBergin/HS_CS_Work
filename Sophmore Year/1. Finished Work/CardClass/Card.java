public class Card
{
   //FIELDS:
   private String suit; //hearts, spades, diamonds, etc.
   private String rank; //two, three, ten, king
   private int value; //2, 3, 4, 7, 11
   private int order; //1 - 13

   //***************************************************************
   //CONSTRUCTORS:
   public Card(String suit, String rank, int value, int order)
   {
      this.suit = suit;
      this.rank = rank;
      this.value = value;
      this.order = order;
   }
   
   //***************************************************************
   //INSTANCE METHODS:
   //Getters(Accessors):
   public String getSuit (){
      return suit;}
   public String getRank (){
      return rank;}
   public int getValue (){
      return value;}
   public int getOrder (){
      return order;}
   
   //Setters(Mutators):
   public void setSuit(String suit){
      this.suit = suit;}
   public void getRank(String rank){
      this.rank = rank;}
   public void getValue (int value){
      this.value = value;}
   public void getOrder (int order){
      this.order = order;}
   
   //METHOD: toString
   public String toString()
   {
      String temp =  rank + " of " + suit;
      //String temp = "[" + suit + ", " + rank + ", " + value + ", " + order + "]";
      return temp;
   }
}