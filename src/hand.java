import java.util.HashSet;

public class hand {
    private HashSet<card> cards;

    public hand(){
        cards = new HashSet<>();
    }

    public void addCard(card card){
        cards.add(card);
    }

    public void addCards(HashSet<card> card){
        cards.addAll(card);
    }

    public int getHardValue(){
        int sum = 0;
        for(card c : cards){
            Rank rank = c.getRank();
            switch (rank){
                case ACE: sum += 1;
                    break;
                case TWO : sum += 2;
                    break;
                case THREE: sum += 3;
                    break;
                case FOUR: sum += 4;
                    break;
                case FIVE: sum += 5;
                    break;
                case SIX: sum += 6;
                    break;
                case SEVEN: sum += 7;
                    break;
                case EIGHT: sum += 8;
                    break;
                case NINE: sum += 9;
                    break;
                case TEN: sum += 10;
                    break;
                case JACK : sum += 10;
                    break;
                case QUEEN : sum += 10;
                    break;
                case KING : sum += 10;
                    break;
                default  : sum += 0;
                    break;
            }
        }
        return sum;
    }

    public int getSoftValue(){
        boolean hasAce = false;
        for(card c : cards){
            if(c.getRank() == Rank.ACE){
                hasAce = true;
                break;
            }
        }

        if(hasAce) return getHardValue() + 10;
        else return getHardValue();
    }
}
