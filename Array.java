import java.util.Random;
public class Array {
    
    //array instance variable
    private int[] array;
    //constructor
    public Array(int size){
        Random random = new Random();
        
        int UPPER_SIZE = 101;
        this.array = new int[size];

        for(int i = 0; i < size; i++)
        {
            int theRandom = random.nextInt(UPPER_SIZE); 
            this.array[i] = theRandom;
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

        for(int i = 1; i < this.array.length; i++)
        {
            if(i % 2 != 0)
            {
                sumOdd = sumOdd + this.array[i];
            }
        }

        return sumOdd;
    }

    // e
    public int findSumEven(){
        int sumEven = 0;

        for(int i = 0; i < this.array.length; i++)
        {
            if(i % 2 == 0)
            {
                sumEven = sumEven + this.array[i];
            }
        }
        
        return sumEven;
    }
}
