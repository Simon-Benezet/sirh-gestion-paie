package dev.paie.web.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.paie.repository.UtilisateurRepository;

@Component
public class StartUpAppListener {
	@Autowired
	private UtilisateurRepository userRepo;

	@EventListener(ContextRefreshedEvent.class)
	public void contextRefreshedEvent() {
		// capture du démarrage de l'application
		// à un moment où le contexte Spring est complètement créé

		// TODO insérer des utilisateurs en base de données

	}
}