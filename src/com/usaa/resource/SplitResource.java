package com.usaa.resource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.usaa.entity.Groups;

@Path("/message")
public class SplitResource {
	private static EntityManager em;

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Split");
		em = emf.createEntityManager();
		Groups group = new Groups(1,"Bank");
		em.persist(group);

		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();

	}

}