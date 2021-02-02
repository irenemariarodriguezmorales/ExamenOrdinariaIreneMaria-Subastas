
package control;

import Model.Subastas;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExitCommand implements Command {

    private Subastas cost;
    
    public ExitCommand(Subastas cost) {
        this.cost=cost;
    }
    
    @Override
    public void execute() {
        System.out.println("Gracias por confiar en nosotros");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ExitCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Guardando datos...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(ExitCommand.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
    
}
