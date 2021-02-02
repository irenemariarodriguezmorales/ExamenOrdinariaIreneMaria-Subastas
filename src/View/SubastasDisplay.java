
package View;

import Model.Subastas;
import Model.Subastas.Observer;

public interface SubastasDisplay extends Observer {
    
    void display(Subastas cost);
    
}
