
package control;

import Model.Subastas;

public class ShowCommand implements Command {

    private Subastas cost;
    
    public ShowCommand(Subastas cost) {
        this.cost=cost;
    }
    
    @Override
    public void execute() {
        System.out.println("Estas son las subastas disponibles: ");
        this.cost.mostrarSubastas();
    }
    
}
