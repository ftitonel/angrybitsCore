package br.com.angrybits.angrybitsCore.persistence;

import br.com.angrybits.angrybitsCore.entity.ConsumoDados;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@PersistenceController
@Transactional
public class ConsumoDadosDAO  extends JPACrud<ConsumoDados, Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5396401216364644539L;

}
