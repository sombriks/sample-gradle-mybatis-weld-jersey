package foo.bar.resource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.mybatis.cdi.Mapper;

import foo.bar.mapper.ClienteMapper;
import foo.bar.model.Cliente;

@RequestScoped
@Path("/clientes")
public class ClienteResource {

	@Inject
	@Mapper
	private ClienteMapper userMapper;

	@GET
	public String hello() {
		return "hello!";
	}

	@GET
	@Path("/{numero}")
	@Produces({ "application/json", "text/xml" })
	public Cliente getDude(@PathParam("numero") int numero) {
		Cliente d = userMapper.byNumero(numero);
		return d;
	}
}
