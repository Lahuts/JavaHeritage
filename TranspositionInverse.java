
/**
 * Chiffre les messages en inversant l'ordre des lettres.
 */

public class TranspositionInverse implements ProtocoleChiffremment
{

	@Override
	public String chiffre(String message) 
	{
		String me = "";
		String[] m = message.split("");
		for(int i = m.length; i >= 0; i--){
			me += m[i];
		}
		return me;
	}

	@Override
	public String dechiffre(String message) 
	{
		String me = "";
		String[] m = message.split("");
		for(int i = 0; i < m.length; i++){
			me += m[i];
		}
		return me;
	}
	
}
