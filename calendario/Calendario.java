/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;

/**
 *
 * @author 39334
 */
public class Calendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cal c=new cal(30,10,2020,"NO");
        c.setgiorno(30);
        c.setmese(10);
        c.setanno(2020);
        c.settipoAnno("NO");
         System.out.println(c.getgiorno());
         System.out.println(c.getmese());
        System.out.println( c.getanno());
         c.annoBis();
         System.out.println(c.gettipoAnno());
         System.out.println(c.dayofweek(30,10,2020));
    }
    
}
