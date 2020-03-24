package SomethingBasicCmdDesign;

/**
 * PrintCommand.java - A class that represents a command that prints a document.
 * 
 * @author Lukacs Ablonczy
 * @author Taylor Norton
 * @author Jyles Tygra
 * @version 1.0
 */
public class PrintCommand implements Command {

	private Document doc;

	/**
	 * Constructs a PrintCommand.
	 * 
	 * @param doc - A variable of type Document.
	 */
	public PrintCommand(Document doc) {
		this.doc = doc;
	}

	/**
	 * Executes the print method of doc.
	 */
	@Override
	public void execute() {
		doc.print();
	}
}
