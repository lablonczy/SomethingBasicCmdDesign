package SomethingBasicCmdDesign;

/**
 * LoadCommand.java - A class that represents a command that loads a document.
 * 
 * @author Lukacs Ablonczy
 * @author Taylor Norton
 * @author Jyles Tygra
 * @version 1.0
 */
public class LoadCommand implements Command {

	private Document doc;

	/**
	 * Constructs a LoadCommand.
	 * 
	 * @param doc - A variable of type Document.
	 */
	public LoadCommand(Document doc) {
		this.doc = doc;
	}

	/**
	 * Executes the load method of doc.
	 */
	@Override
	public void execute() {
		doc.load();
	}
}
