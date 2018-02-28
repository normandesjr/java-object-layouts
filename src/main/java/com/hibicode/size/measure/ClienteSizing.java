package com.hibicode.size.measure;

import java.io.PrintWriter;
import java.util.List;

import org.openjdk.jol.info.GraphLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibicode.size.model.Cliente;
import com.hibicode.size.repository.Clientes;

@Service
public class ClienteSizing {

	private static final Logger log = LoggerFactory.getLogger(ClienteSizing.class);
	
	@Autowired
	private Clientes clientesRepository;
	
	public void sizeAllFields() {
		log.info("Sizing all Client fields");
		
		List<Cliente> clients = clientesRepository.findAll();
		log.info("Total clients in ArrayList: " + clients.size());
		
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(GraphLayout.parseInstance(clients).toFootprint());
        pw.close();
	}
	
}
