package SomethingBasicCmdDesign;

/**
 * SpellCommand.java - A class that represents a command that spell-checks a document.
 * 
 * @author Lukacs Ablonczy
 * @author Taylor Norton
 * @author Jyles Tygra
 * @version 1.0
 */
public class SpellCommand implements Command {

	private Document doc;
	
	/**
	 * Constructs a SaveCommand.
	 * 
	 * @param doc - A variable of type Document.
	 */
	public SpellCommand(Document doc){
		this.doc = doc;
	}

	/**
	 * Executes the spell method of doc.
	 */
	@Override
	public void execute() {
		doc.spell();
	}
}
