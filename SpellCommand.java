package SomethingBasicCmdDesign;//lukacs ablonczy

/**
 * @author Lukacs Ablonczy
 * @author Taylor Norton
 * @author Jyles Tygra
 */
public class SpellCommand implements Command {

	private Document doc;
	
	public SpellCommand(Document doc){
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.spell();
	}
}
