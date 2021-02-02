
package View;

import Model.Subastas;

public class SubastasPanel implements SubastasDisplay {

    private Subastas cost;
    
    @Override
    public void display(Subastas cost) {
        this.cost=cost;
    }

    @Override
    public void changed() {
        System.out.println("El numero de subastas activas son: " + cost.getSubasta());
    }
    
}
