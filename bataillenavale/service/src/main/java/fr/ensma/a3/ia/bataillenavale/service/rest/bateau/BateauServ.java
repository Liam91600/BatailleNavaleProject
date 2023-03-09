package fr.ensma.a3.ia.bataillenavale.service.rest.bateau;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.ensma.a3.ia.bataillenavale.business.JeuBatailleNavale;
import fr.ensma.a3.ia.bataillenavale.business.canal.CanalDesc;
import fr.ensma.a3.ia.bataillenavale.business.canal.GestionCanaux;
import fr.ensma.a3.ia.bataillenavale.business.elements.bateaux.AbstractBateau;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
@Path("bateau")
public class BateauServ {
	
	 @GET
	    @Path("all")
	    public Response getAllBateau() {
	    	JeuBatailleNavale batnav = new JeuBatailleNavale();
	    	List<AbstractBateau> listbat = batnav.getBateaux();
	    	return Response.ok(listbat).build(); 	
	    }

}
