package SomethingBasicCmdDesign;

/**
 * Command.java - An interface to represent different types of commands.
 * 
 * @author Lukacs Ablonczy
 * @author Taylor Norton
 * @author Jyles Tygra
 * @version 1.0
 */
public interface Command {

	/**
	 * An abstract method representing the execution of a command depeneding on the
	 * kind of command.
	 */
	public void execute();

}
