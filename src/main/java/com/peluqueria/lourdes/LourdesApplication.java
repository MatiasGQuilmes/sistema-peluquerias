package com.peluqueria.lourdes;

import com.peluqueria.lourdes.models.*;
import com.peluqueria.lourdes.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
//import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class LourdesApplication {
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(LourdesApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ClienteRepository clienteRepository, TurnoRepository turnoRepository, ClienteTurnoRepository clienteTurnoRepository, ProductoRepository productoRepository, SucursalRepository sucursalRepository, TicketRepository ticketRepository){
		return args -> {


			Cliente cliente = new Cliente(40124145, "Lourdes", "Garcete", "1126218794", "lourdes@gmail.com", passwordEncoder.encode("1234"));
			clienteRepository.save(cliente);
			Cliente cliente1 = new Cliente(1412414, "Cecilia", "Gonzalez", "12314141", "ceci@gmail.com", passwordEncoder.encode("1234"));
			clienteRepository.save(cliente1);
			Cliente cliente2 = new Cliente(5634636, "Modesta", "Ayala", "151231231", "modesta@gmail.com", passwordEncoder.encode("1234"));
			clienteRepository.save(cliente2);
			Cliente cliente3 = new Cliente(8678686, "Mechi", "Gonzalez", "15341241", "mechi@gmail.com", passwordEncoder.encode("1234"));
			clienteRepository.save(cliente3);
			Cliente cliente4 = new Cliente(8678686, "admin", "admin", "11111", "admin@gmail.com", passwordEncoder.encode("admin"));
			clienteRepository.save(cliente4);


			Turno turno = new Turno(new Date(2022, 10, 10), new Time(12,00,00));
			turnoRepository.save(turno);
			Turno turno1 = new Turno(new Date(2022, 10, 10), new Time(12,30,00));
			turnoRepository.save(turno1);
			Turno turno2 = new Turno(new Date(2022, 10, 10), new Time(13,00,00));
			turnoRepository.save(turno2);
			Turno turno3 = new Turno(new Date(2022, 10, 10), new Time(13,30,00));
			turnoRepository.save(turno3);


			ClienteTurno clienteTurno = new ClienteTurno(cliente, turno);
			clienteTurnoRepository.save(clienteTurno);
			ClienteTurno clienteTurno1 = new ClienteTurno(cliente1, turno1);
			clienteTurnoRepository.save(clienteTurno1);
			ClienteTurno clienteTurno2 = new ClienteTurno(cliente2, turno2);
			clienteTurnoRepository.save(clienteTurno2);
			ClienteTurno clienteTurno3 = new ClienteTurno(cliente3, turno3);
			clienteTurnoRepository.save(clienteTurno3);


			Sucursal sucursal = new Sucursal("larrea 1412", "caballito CABA");
			Sucursal sucursal1 = new Sucursal("mitre 1412", "villa crespo CABA");

			sucursalRepository.save(sucursal);
			sucursalRepository.save(sucursal1);

			Producto producto = new Producto("crema para pelo", "para cabellos suaves", 1500, 20, sucursal);
			Producto producto1 = new Producto("Shampoo", "para cabellos suaves", 1200, 20, sucursal);
			Producto producto2 = new Producto("Queratina", "para cabellos coloridos", 1400, 15, sucursal);

			Producto producto3 = new Producto("crema para pelo", "para cabellos con tinta", 1800, 50, sucursal1);
			Producto producto4 = new Producto("reparador", "cabellos rizados", 1300, 40, sucursal1);
			Producto producto5 = new Producto("queratina", "para cabellos suaves", 2000, 60, sucursal1);


			productoRepository.save(producto);
			productoRepository.save(producto1);
			productoRepository.save(producto2);
			productoRepository.save(producto3);
			productoRepository.save(producto4);
			productoRepository.save(producto5);


			Ticket ticket = new Ticket(LocalDateTime.now(), 1500, producto, cliente);
			Ticket ticket1 = new Ticket(LocalDateTime.now(), 1200, producto1, cliente);
			Ticket ticket2 = new Ticket(LocalDateTime.now(), 1400, producto2, cliente);

			ticketRepository.save(ticket);
			ticketRepository.save(ticket1);
			ticketRepository.save(ticket2);

		};
	}


}
