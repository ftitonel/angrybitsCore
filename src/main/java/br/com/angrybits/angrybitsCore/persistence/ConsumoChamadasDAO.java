package br.com.angrybits.angrybitsCore.persistence;

import br.com.angrybits.angrybitsCore.entity.ConsumoChamadas;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@PersistenceController
@Transactional
public class ConsumoChamadasDAO  extends JPACrud<ConsumoChamadas, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9100516833016760320L;

}
