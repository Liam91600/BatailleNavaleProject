package fr.ensma.a3.ia.bataillenavale.service.rest.canal;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import fr.ensma.a3.ia.bataillenavale.business.canal.CanalDesc;
import fr.ensma.a3.ia.bataillenavale.business.canal.GestionCanaux;

/**
 * ChatServ
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
@Path("chatcanal")
public class ChatServ {

    @GET
    @Path("{canalId}")
    public Response getCanalAmis(@PathParam("canalId") int canalId) {
        GestionCanaux gestion = new GestionCanaux();
        if (gestion.getCanal(canalId).isPresent()) {
            CanalDesc res_can = gestion.getCanal(canalId).get();
            return Response.ok(res_can).build();
        } else {
            return Response.serverError().build();
        }
    }
    
    
    @GET
    @Path("all")
    public Response getAllCanal() {
    	GestionCanaux gestion = new GestionCanaux();
    	List<CanalDesc> listcan = gestion.getListCanal();
    	return Response.ok(listcan).build(); 	
    }

}
