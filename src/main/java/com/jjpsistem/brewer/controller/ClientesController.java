package com.jjpsistem.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jjpsistem.brewer.model.Cliente;

@Controller
public class ClientesController {
	
	@RequestMapping("/clientes/novo")
	public String novo(Cliente cliente) {
		return "cliente/CadastroCliente";
	}
	
//	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
//	public String cadastrar(@Valid Cliente cliente, BindingResult result,
//			Model model, RedirectAttributes attributes) {
//		if (result.hasErrors()) {
//			return novo(cliente);
//		}
//		
//		// Salvar no banco de dados...
//		attributes.addFlashAttribute("mensagem", "Cliente salvo com sucesso!");
//		System.out.println(">>>> nome: " + cliente.getNome());
//		System.out.println(">>>> cnpj: " + cliente.getCnpj());
//		//System.out.println(">>>> tipo: " + cliente.getCnpj());
//		System.out.println(">>>> cnpj: " + cliente.getCnpj());
//		System.out.println(">>>> telefone: " + cliente.getTelefone());
//		System.out.println(">>>> email: " + cliente.getEmail());
//		System.out.println(">>>> logradouro: " + cliente.getLogradouro());
//		System.out.println(">>>> numero: " + cliente.getNumero());
//		System.out.println(">>>> complemento: " + cliente.getComplemento());
//		System.out.println(">>>> cep: " + cliente.getCep());
//		System.out.println(">>>> estado: " + cliente.getEstado());
//		System.out.println(">>>> cidade: " + cliente.getCidade());
//		return "redirect:/clientes/novo";
//	}

}
