package SomethingBasicCmdDesign;

/**
 * Basic representation of a document and all the commands available for a document
 * @author Lukacs Ablonczy
 * @author Taylor Norton
 * @author Jyles Tygra
 */
public class Document {
	public String name;

	/**
	 * Parametrized constructor for Document
	 * Prints a message saying that a Document was created
	 * @param name name of the new Document
	 */
	public Document(String name){
		this.name = name;
		System.out.println("Document named " + name + " is created");
	}

	/**
	 * Method which prints out a message of the document being loaded
	 */
	public void load(){
		System.out.println("document " + name + " is loaded into view");
	}

	/**
	 * Method which prints out a message of the document being spell-checked
	 */
	public void spell(){
		System.out.println("document " + name + " is being checked for spelling errors");
	}

	/**
	 * Method which prints out a message of the document being saved
	 */
	public void save(){
		System.out.println("document " + name + " is being saved...");
	}

	/**
	 * Method which prints out a message of the document being printed
	 */
	public void print(){
		System.out.println("document " + name + " is printing...");
	}
}
