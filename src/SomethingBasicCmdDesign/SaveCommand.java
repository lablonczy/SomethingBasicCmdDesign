package SomethingBasicCmdDesign;

/**
 * SaveCommand.java - A class that represents a command that saves a document.
 * 
 * @author Lukacs Ablonczy
 * @author Taylor Norton
 * @author Jyles Tygra
 * @version 1.0
 */
public class SaveCommand implements Command {

	private Document doc;

	/**
	 * Constructs a SaveCommand.
	 * 
	 * @param doc - A variable of type Document.
	 */
	public SaveCommand(Document doc) {
		this.doc = doc;
	}

	/**
	 * Executes the save method of doc.
	 */
	@Override
	public void execute() {
		doc.save();
	}
}
