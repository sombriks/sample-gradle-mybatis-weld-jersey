package foo.bar.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import foo.bar.model.Dude;

@Path("/hello")
public class FooBarResource {

	@GET
	public String hello() {
		return "hello!";
	}

	@GET
	@Path("/{numero}")
	@Produces({ "application/json", "text/xml" })
	public Dude getDude(@PathParam("numero") int numero) {
		Dude d = new Dude();
		d.setNome("Duude");
		d.setNumero(numero);
		return d;
	}
}
