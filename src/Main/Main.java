
package Main;

import Model.Subastas;
import View.SubastasDisplay;
import View.SubastasPanel;
import control.Command;
import control.ExitCommand;
import control.MakeCommand;
import control.NullCommand;
import control.ShowCommand;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
    }
    
    private Subastas cost;
    private SubastasDisplay subastasDisplay;
    private Map<String,Command> commands;
    
    public Main() {
        this.execute();
    }

    private void execute() {
        this.cost=new Subastas();
        this.subastasDisplay=new SubastasPanel();
        this.cost.registerObservers(subastasDisplay);
        this.subastasDisplay.display(cost);
        this.commands=initCommands();
        System.out.println("Bienvenido, para empezar a ver las subastas activas pulse 'i', y para salir 's' "
                + "y m para realizar una puja a las subastas activas");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            commands.getOrDefault(scanner.next(),NullCommand.Instance).execute();     
        }
    }

    private Map<String, Command> initCommands() {
        HashMap<String,Command> result = new HashMap<>();
        result.put("i",new ShowCommand(cost));
        result.put("s",new ExitCommand(cost));
        result.put("m",new MakeCommand(cost));
        return result;
    }
    
}
