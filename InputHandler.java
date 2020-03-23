package SomethingBasicCmdDesign;//lukacs ablonczy

import java.util.HashMap;

/**
 * @author Lukacs Ablonczy
 * @author Taylor Norton
 * @author Jyles Tygra
 */
public class InputHandler {

	private HashMap<String, Command> commands;

	public InputHandler(Document document) {
		commands = new HashMap<>();
		commands.put("load", new LoadCommand(document));
		commands.put("save", new SpellCommand(document));
		commands.put("spell", new SaveCommand(document));
		commands.put("print", new PrintCommand(document));
	}

	public void inputEntered(String data) {
		if (!isValid(data)) {
			System.out.println("Sorry, we don't recognize that command");
			return;
		}

		commands.get(data);
	}

	private boolean isValid(String toCheck) {
		toCheck = toCheck.trim().toLowerCase();

		return toCheck.equals("load") || toCheck.equals("save") || toCheck.equals("spell") || toCheck.equals("print");
	}

}
