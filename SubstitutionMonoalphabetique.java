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
	

	@Override
	public String chiffre(String message) {
		return null;
	}

	@Override
	public String dechiffre(String message) {
		return null;
	}

	@Override
	public void setCle(String cle) {
		
	}

	@Override
	public String getCle() {
		return null;
	}
	
}
