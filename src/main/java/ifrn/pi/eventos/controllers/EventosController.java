package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		System.out.println("Chamou o método form.");
		return "formEvento";
	}
	
	@RequestMapping("/eventos/submit")
	public String submit(Evento e) {
		System.out.println(e.getNome());
		System.out.println(e.getLocal());
		System.out.println(e.getHorario());
		System.out.println(e.getData());
		return "submit";
	}
}
