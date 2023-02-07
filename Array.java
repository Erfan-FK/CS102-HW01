import java.util.Random;
public class Array {

    int newArray[];

    // Constructor and method gonna be initialized...
    // a
    public Array(int size){
        Random random = new Random();
        
        int UPPER_SIZE = 101;
        newArray = new int[size];

        for(int i = 0; i < size; i++)
        {
            int theRandom = random.nextInt(UPPER_SIZE); 
            newArray[i] = theRandom;
        }
    }
    
    // c
    public int findMin(){
        int min = 101;

        for(int member : this.newArray)
        {
            if(member < min)
            {
                min = member;
            }
        }
        
        return min;
    }

    // c
    public int findMax(){  
        int max = -1;

        for(int member : this.newArray)
        {
            if(member > max)
            {
                max = member;
            }
        }
        
        return max;
    }

    // d
    public int findAverage(){
        int average = 0;

        for(int member : this.newArray)
        {
            average = average + member;
        }

        return (int) average / this.newArray.length;
    }

    // d
    public String displayDifferences(){ 
        String differences = "";
        return differences;
    }

    // e
    public int findSumOdd(){
        int sumOdd = 0;

        for(int i = 1; i < this.newArray.length; i++)
        {
            if(i % 2 != 0)
            {
                sumOdd = sumOdd + this.newArray[i];
            }
        }

        return sumOdd;
    }

    // e
    public int findSumEven(){
        int sumEven = 0;

        for(int i = 0; i < this.newArray.length; i++)
        {
            if(i % 2 == 0)
            {
                sumEven = sumEven + this.newArray[i];
            }
        }
        
        return sumEven;
    }
}
