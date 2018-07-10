package br.com.angrybits.angrybitsCore.business;

import java.util.List;

import br.com.angrybits.angrybitsCore.entity.Usuario;
import br.com.angrybits.angrybitsCore.persistence.UsuarioDAO;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.stereotype.Controller;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
@Transactional
@Controller
public class UsuarioBC extends DelegateCrud<Usuario, Long, UsuarioDAO>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	public List<Usuario> findByEmail(String email){		
		try {
			return getDelegate().findByEmail(email);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
