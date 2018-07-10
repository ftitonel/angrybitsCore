package br.com.angrybits.angrybitsCore.persistence;

import java.util.List;

import javax.persistence.Query;

import br.com.angrybits.angrybitsCore.entity.Usuario;
import br.gov.frameworkdemoiselle.stereotype.Controller;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;
import br.gov.frameworkdemoiselle.util.Beans;

@PersistenceController
@Transactional
@Controller
public class UsuarioDAO extends JPACrud<Usuario, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unchecked")
	public List<Usuario> findByEmail(String email) {		
		String hql = "SELECT usuario FROM Usuario usuario WHERE usuario.usuario_email=:usuario_email";
		Query query = getEntityManager().createQuery(hql);
		query.setParameter("usuario_email", email.trim());		
		List<Usuario> usuario = query.getResultList();
		return usuario;
	}

}
