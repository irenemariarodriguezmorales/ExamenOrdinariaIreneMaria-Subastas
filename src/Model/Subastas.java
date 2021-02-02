
package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Subastas {
    
    private int cost=2;
    private ArrayList<Observer> observers;
    private int param;
    private String param2;
    private int param3;
    private int pujaCoche=1000;
    private int pujaMesa=50;
    
    public Subastas() {
        this.cost=cost;
        this.observers=new ArrayList<Observer>();
        this.param=param;
        this.param2=param2;
        this.param3=param3;
        this.pujaCoche=pujaCoche;
        this.pujaMesa=pujaMesa;
    }
    
    public int getSubasta() {
        return this.cost;
    }
    
    public void setSubasta(int cost) {
        this.cost=cost;
    }
    
    public void changedStatus() {
        for (Observer observer : observers) {
            observer.changed();
        }
    }
    
    public void registerObservers(Observer observer) {
        this.observers.add(observer);
    }
    
    public interface Observer {
        void changed();
    }
    
    public void mostrarSubastas() {
        System.out.println(1+ " Tipo: Coche Nissan");
        System.out.println(2 + " Tipo: Mesa");
        System.out.println("Por favor, escoja la subasta escribiendo 1 o 2 para ver sus detalles");
        Scanner scanner = new Scanner(System.in);
        param = scanner.nextInt();
        if (param==1) {
            System.out.println("El coche Nissan tiene las siguientes características: Precio Salida: " 
                    + this.pujaCoche + "euros, Pujas realizadas: 4, Tiempo para terminar la puja: 5 dias"); 
        }
        if (param==2) {
            System.out.println("La mesa tiene las siguientes características: Precio Salida: "
                    + this.pujaMesa + "euros, Pujas realizadas: 3, Tiempo para terminar la puja: 9 dias");
        }        
        this.changedStatus();
    }
    
    public void realizar() {
        System.out.println("Diganos a que bien desea realizar una puja");
        System.out.println("Escribe coche o mesa para comenzar");
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        param2 = scanner2.nextLine();
        if(param2.equals("coche")) {
            System.out.println("Introduzca a cuanto precio quiere pujar");
            param3=scanner3.nextInt();
            if(param3<this.pujaCoche) {
                System.out.println("Error: tiene que apostar mas de lo apostado, vuelva a empezar pulsando m");
            } else {
                System.out.println("La subasta ha cambiado al valor de " + param3);
                System.out.println("Confirme pulsando la opcion 'i'");
                pujaCoche=param3;
            }
        }
        if (param2.equals("mesa")) {
            System.out.println("Introduzca a cuanto precio quiere pujar");
            param3=scanner3.nextInt();
            if(param3<this.pujaMesa) {
                System.out.println("Error: tiene que apostar mas de lo apostado, vuelva a empezar pulsando m");
            } else {
                System.out.println("La subasta ha cambiado al valor de " + param3);
                System.out.println("Confirme pulsando la opcion 'i'");
                pujaMesa=param3;
            } 
        }
    }
    
    
}
