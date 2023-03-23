package terminal;

import java.util.Scanner;

public class TerminalReader {
    public static TerminalReader terminalReader;

    private CommandParser commandParser;

    public TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public static TerminalReader newTerminalReader(CommandParser commandParser){
        if(terminalReader == null){
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    void endless(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            if(input.equals("enough")) break;
        }
        scanner.close();
    }
}
