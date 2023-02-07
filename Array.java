import java.util.Random;
public class Array {
    
    //array instance variable
    private int[] array;
    //constructor
    public Array(int size){
        // creating an int array that contains random integers in the range [0,100].
        this.array = new int[size]; 
        Random random = new Random();
        for(int i = 0; i < size; i++){
            this.array[i] = random.nextInt(0, 101);
        }
    }
    
    // c
    public int findMin(){
        int min = 101;
        //finding the smallest value in the int array
        int temp;
        for(int i = 0; i < this.array.length; i++){
            for(int j = i + 1; j < this.array.length; j++){
                temp = this.array[j];
                
                if(temp < min){
                    min = temp;
                }
            }

        }
        return min;
    }

    // c
    public int findMax(){
        int max = 0;
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
        return sumOdd;
    }

    // e
    public int findSumEven(){
        int sumEven = 0;        
        return sumEven;
    }
}
