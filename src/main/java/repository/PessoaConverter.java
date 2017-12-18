package repository;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.persistence.EntityManager;

import com.algaworks.model.Pessoa;
import com.algaworks.util.JpaUtil;

@FacesConverter(forClass = Pessoa.class)
public class PessoaConverter implements Converter{
	
	@Override
	public Object getAsObject(FacesContext context,
			UIComponent component, String value) {
		Pessoa retorno = null;
		EntityManager manager = JpaUtil.getEntityManager();
		
		try {
			if(value != null) {
				Pessoas pessoas = new Pessoas(manager);
				retorno = pessoas.porId(new Long(value));
			}
			
			return retorno;
		}
		finally {
			manager.close();
		}
	}
	
	@Override
	public String getAsString(FacesContext context,
			UIComponent component, Object value) {
		if(value != null) {
			return ((Pessoa) value).getId().toString();
		}
		
		return null;
	}
}
