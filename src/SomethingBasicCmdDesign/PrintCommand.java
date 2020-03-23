package SomethingBasicCmdDesign;//lukacs ablonczy

/**
 * @author Lukacs Ablonczy
 * @author Taylor Norton
 * @author Jyles Tygra
 */
public class PrintCommand implements Command {

	private Document doc;
	
	public PrintCommand(Document doc){
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.print();
	}
}
