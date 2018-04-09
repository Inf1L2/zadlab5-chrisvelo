/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krzysiek
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack stosik = new Stack(5);
        
        for(int i=0;i<5;i++)
            stosik.push(6); //dajemy elementy na stos
        
        stosik.push(6); //tu ma byc blad bo juz jest pelny
        
        System.out.println(stosik.wsk()); //ostatni element stosu drukuje
        
        for(int i=0;i<6;i++)
            System.out.println(stosik.pop()); //po koleji sciaga elementy ze stosu
        
        stosik.pop(); //tu blad bo pusty
    }
    
}
