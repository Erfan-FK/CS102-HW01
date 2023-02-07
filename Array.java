import java.util.Random;
public class Array {
    private int[] intArray;
    
    public Array(int size){
        intArray = new int[size];
        Random randomInt = new Random();

        //for every element in the array
        for(int i = 0; i< size; i++) 
        {
            //Assign every array element to be an integer in range [0,100]
            this.intArray[i] = randomInt.nextInt(0,101); 
        }
    }
    
    // c
    public int findMin(){
        int min = 0;

        //for every element in the array
        for(int i = 0; i< this.intArray.length; i++) 
        {
            if ( min > this.intArray[i] )
            {
                min = this.intArray[i];
            }
        }
        return min;
    }

    // c
    public int findMax()
    {
        int max = 0;

        for (int i = 0; i < this.intArray.length; i++)
        {
            if ( max < this.intArray[i] )
            {
                max = this.intArray[i];
            }
        }

        return max;  
    }

    // d
    public int findAverage()
    {
        int sum = 0;
        int numberCount = this.intArray.length;

        for (int i = 0; i < this.intArray.length; i++)
        {
            sum += this.intArray[i];
        }
        return (sum/numberCount);
    }

    // d
    public String displayDifferences(){ 
        String differences = "";
        double average = this.findAverage();

        for (int i = 0; i < this.intArray.length; i++)
        {
            if (i != 0)
            {
                differences += ", ";
            }
            differences += this.intArray[i];
        }
        return differences;
    }

    // e
    public int findSumOdd(){
        int sumOdd = 0;
        for (int i = 0; i < this.intArray.length; i++)
        {
            if (i % 2 == 1)
            {
                sumOdd += this.intArray[i];
            }
        }
        return sumOdd;
    }

    // e
    public int findSumEven(){
        int sumEven = 0;
        for (int i = 0; i < this.intArray.length; i++)
        {
            if (i % 2 == 0)
            {
                sumEven += this.intArray[i];
            }
        }
        return sumEven;
    }
}
