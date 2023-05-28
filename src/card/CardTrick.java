/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Modifier : Umesh Arora
 * Student ID:991709215
 */
import java.util.*;
public class CardTrick 
{
    
    public static void main(String[] args)
    {
        
        Scanner sc= new Scanner(System.in);
        Card[] magicHand = new Card[7];
        for(int i=0;i<magicHand.length;++i)
        {
            magicHand[i]=Card.random_gen();
            
        }
        System.out.println("Enter Value of Card : ");
        int value=sc.nextInt();
        System.out.println("Enter Suit of Card : ");
        String Suit=sc.next();
        
        Card c= new Card();
        c.setValue(value);
        c.setSuit(Suit);
        boolean result=false;
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card card=magicHand[i];
            if(card.getValue()==(c.getValue()) &&card.getSuit().equalsIgnoreCase(c.getSuit()))
            {result=true;
            break;
            }
        }
        if(result)
        {
            System.out.println("Congratulations! Your card is in the magichand");
        }
        else
            System.out.println("Oops, your card is not in the magichand");
    }
}
    
