
/**
 * Mastery Test Week 3 Exercise 2. Thread 2.
 * - Shift FIVE elements one place to the right.
 * 
 * @author (your name) 
 */
public class Exercise2
{
    public static int[] shiftRight(int[] numbers)
    {
        int temp;
        
        // In the coming weeks, the lecturer will explain all of the code above. But for now here is an explanation:
        // 1. In the code above we have provided an integer array "numbers", containing FIVE elements.
        // 2. In the code above we have also provided another integer variable called "temp".
        // In the space provided below, write code to shift each element one position to the right,
        // with the rightmost element moving around to the leftmost position.
        // 
        // Do NOT initialise "numbers[0]" ... "numbers[4]". Just write the six lines that shift the values.
        // Add your code BELOW this line. Do NOT change anything ABOVE this comment line.
        temp = numbers[numbers.length - 1];
        
        for(int i = numbers.length - 1; i > 0; i--)
        {            
            //temp = numbers[i];
            numbers[i] = numbers[i-1];
            //numbers[i-1] = temp;
        }
        numbers[0] = temp;

        // Add your code ABOVE this line. Do NOT change anything BELOW this comment line.
        return numbers;
    }
}
