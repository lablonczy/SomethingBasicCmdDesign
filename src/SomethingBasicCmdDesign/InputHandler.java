package SomethingBasicCmdDesign;

import java.util.HashMap;

/**
 * @author Lukacs Ablonczy
 * @author Taylor Norton
 * @author Jyles Tygra
 *         <p>
 *         Defines Input handler, uses hash map to store valid commands and
 *         responses to them
 */
public class InputHandler {

	private HashMap<String, Command> commands;

	/**
	 * Constructor for InputHandler class, defines valid commands and responses to
	 * them
	 *
	 * @param document Document type on which to run the given command
	 */
	public InputHandler(Document document) {
		commands = new HashMap<>();
		commands.put("load", new LoadCommand(document));
		commands.put("save", new SaveCommand(document));
		commands.put("spell", new SpellCommand(document));
		commands.put("print", new PrintCommand(document));
	}

	/**
	 * Runs valid command given by param using hash lookup, exits method if not
	 * valid
	 *
	 * @param data the command to run
	 */
	public void inputEntered(String data) {
		if (!isValid(data)) {
			System.out.println("Sorry, we don't recognize that command");
			return;
		}

		commands.get(data).execute();
	}

	/**
	 * Checks validity of command by comparing given string while ignoring case and
	 * leading spaces
	 *
	 * @param toCheck The command that will be checked for validity
	 * @return Whether the given command is equal to any of the four valid commands
	 */
	private boolean isValid(String toCheck) {
		toCheck = toCheck.trim().toLowerCase();

		return toCheck.equals("load") || toCheck.equals("save") || toCheck.equals("spell") || toCheck.equals("print");
	}

}
