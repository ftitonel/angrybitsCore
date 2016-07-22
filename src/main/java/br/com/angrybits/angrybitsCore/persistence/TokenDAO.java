package br.com.angrybits.angrybitsCore.persistence;

import br.com.angrybits.angrybitsCore.entity.Token;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class TokenDAO  extends JPACrud<Token, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
