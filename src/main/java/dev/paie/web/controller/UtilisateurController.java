package dev.paie.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import dev.paie.entite.Utilisateur;
import dev.paie.repository.UtilisateurRepository;

@Controller
public class UtilisateurController {

	@Autowired
	private UtilisateurRepository utilisateurRepo;

//	@RequestMapping(method = RequestMethod.GET, path = "/creeruser")
	public void creerUtilisateur() {
		Utilisateur user = new Utilisateur();
		user.setNomUtilisateur("lui");
		user.setMotDePasse("oui");
		utilisateurRepo.save(user);
	}

}
