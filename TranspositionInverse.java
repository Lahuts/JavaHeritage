
/**
 * Chiffre les messages en inversant l'ordre des lettres.
 */

public class TranspositionInverse implements ProtocoleChiffrement
{

	@Override
	public String chiffre(String message) 
	{
		{
			String me = "";
			String[] m = message.split("");
			for(int i = m.length-1; i >=0; i--)
			{
				me += m[i];
			}
			return me;
		}
	}

	@Override
	public String dechiffre(String message) 
	{
		return chiffre(message);
	}
	
}

