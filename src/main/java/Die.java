import java.util.Random;

public class Die {

    private Random random;
    private int numberOfSides;
    private int value=0;
    private int[] probabilities;

    public Die(int numberOfSides, int[] probabilities) {
        this.numberOfSides = numberOfSides;
        this.random = new Random();
        this.probabilities = probabilities;


    }

    public int roll() {
        // get random number in range 1-numberOfSides
        //update value
        for(int i=1; i<=numberOfSides;i++){
            value = this.random.nextInt(this.numberOfSides + 1);
            System.out.println(value);
        }


        return value;
    }

    public void setProbabilities(int[] probabilities) {
        this.probabilities = probabilities;
        for(int k=1;k<probabilities.length;k++){
            if(probabilities[k] < 0){
                System.out.println("Negative numbers not allowed");

                System.out.println("Probability sum must be greater than 0");
            }
        }
    }

    public static void main(String[] args) {

        // looking at the data from the table above. this is how we would construct the weighted die
        Die die1=new Die(4,new int[]{1,1,1,2});
        die1.roll();
        // we can create a perfectly fair die like this
        die1.setProbabilities(new int[]{1,1,-1,2});
        System.out.println("......................................................");
        //Die die20 = new Die(20);
        //die20.roll();
        System.out.println(die1);
        System.out.println("Make die");
         // this would print a number between 1 and 6 inclusive
        int die2 = new DieFactory().makeDie(6);
        System.out.println(die2);

    }

}





















