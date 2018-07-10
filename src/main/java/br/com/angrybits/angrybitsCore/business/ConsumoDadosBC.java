package br.com.angrybits.angrybitsCore.business;

import br.com.angrybits.angrybitsCore.entity.ConsumoDados;
import br.com.angrybits.angrybitsCore.persistence.ConsumoDadosDAO;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
@Transactional
public class ConsumoDadosBC extends DelegateCrud<ConsumoDados, Long, ConsumoDadosDAO> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8683659707911378677L;

}
