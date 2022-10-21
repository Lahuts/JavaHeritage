/**
 * Chiffre les messages avec une table de substitution.
 * si la table de substition est "zybcdefghijklmnopqrstuvwxa"
 * alors les 'a' seront remplacés par des 'z', 
 * les 'b' seront remplacés par des 'y'
 * les 'c' seront remplacés par des 'b'
 * etc.
 **/

public class SubstitutionMonoalphabetique implements ProtocoleChiffrementACle
{
	private String cle;
	@Override
	public String chiffre(String message) {
		String chif = "";
		String[] cle = getCle().split("");
		String[] msg = message.split("");
		for(int i = 0; i < msg.length; i++){
			chif += cle[((int)msg[i].charAt(0)-97)];
		}
		return chif;
	}

	@Override
	public String dechiffre(String message) {
		return null;
	}

	@Override
	public void setCle(String cle) {
		this.cle = cle;
	}

	@Override
	public String getCle() {
		return this.cle;
	}
	
}
