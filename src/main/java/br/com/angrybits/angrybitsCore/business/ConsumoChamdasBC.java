package br.com.angrybits.angrybitsCore.business;

import br.com.angrybits.angrybitsCore.entity.ConsumoChamadas;
import br.com.angrybits.angrybitsCore.persistence.ConsumoChamadasDAO;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
@Transactional
public class ConsumoChamdasBC extends DelegateCrud<ConsumoChamadas, Long, ConsumoChamadasDAO> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3509507363546478182L;

}
