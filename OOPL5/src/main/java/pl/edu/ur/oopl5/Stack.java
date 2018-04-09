import java.util.*; 

/**
 *
 * @author krzysiek klosek
 * ZAD 3
 */
public class Stack {
    private int stack[];
    private int wsk;
    int size;
    
    public Stack(int stackSize){
       stack = new int[stackSize];
       size=stackSize; 
       wsk = size;
        
    }
    
    public void push(int n){
        if(fullStack())
            stack[--wsk]=n;
        else System.out.println("Stos jest juz pelny");
    }
    
    int pop(){
        if(emptyStack())
        return stack[wsk++];
        else return -1;
    }
    
    
    boolean emptyStack()
    {
        return wsk==size;
    }
    
     boolean fullStack()
    {
        return wsk==0;
    }
     
     int wsk()
     {
         if(!emptyStack())
             return stack[wsk];
         else 
             return -1;
     }
    
}
