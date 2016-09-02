package br.com.angrybits.angrybitsCore.interceptor;

import java.io.Serializable;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import br.gov.frameworkdemoiselle.stereotype.Controller;

@Interceptor
@Controller
public class Auditor implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@AroundInvoke
	public Object validarParidade(InvocationContext context)
			throws Exception{
		
		System.out.println("****INTERCEPTOR EXECUÇÃO****");		
		StringBuffer sb = new StringBuffer();
        sb.append("Interceptando no método: ");
        sb.append(context.getMethod().getName());
        sb.append(" da classe ");
        sb.append(context.getMethod().getDeclaringClass().getName());
        System.out.println(sb.toString());        
        System.out.println("*************************");
		
		Object result = context.proceed();
		
		
		
        return result;
	}

}
