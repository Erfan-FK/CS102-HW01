import java.util.Random;
public class Array {
    
    //Instance variable 
    private int[] array;
    
    //Constructor
    public Array(int size)
    {
        array = new int[size];
        fillArray();
    }

    private void fillArray()
    {
        int bound = 101;
        Random rand = new Random();
        for(int i = 0; i < this.array.length; i++)
        {
            this.array[i] = rand.nextInt(bound);
        }
    }
    
    // c
    public int findMin(){
        int min = 101;

        for(int member : this.array)
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

        for(int member : this.array)
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
        int total = 0;
        //calculation
        for(int i = 0; i < this.array.length; i++){
            total = total + this.array[i];
        }
        average = total / this.array.length;
        return average;
    }

    // d
    public String displayDifferences(){ 
        //crating a stringBuilder object
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('{');
        //finding the differences
        for(int i = 0; i < this.array.length; i++){
            stringBuilder.append(this.array[i] - this.findAverage());
            if(i != this.array.length - 1){
                stringBuilder.append(',');
                stringBuilder.append(' ');
            } 
        }
        stringBuilder.append('}');
        
        String differences= stringBuilder.toString();
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
