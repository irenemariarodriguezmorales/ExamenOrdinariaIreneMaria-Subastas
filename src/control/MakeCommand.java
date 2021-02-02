
package control;

import Model.Subastas;

public class MakeCommand implements Command {

    private Subastas cost;
    
    public MakeCommand(Subastas cost) {
        this.cost=cost;
    }
    
    @Override
    public void execute() {
        this.cost.realizar();
    }
    
}
