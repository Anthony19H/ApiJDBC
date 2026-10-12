package com.krakdev.jdbc.videojuegos.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.krakdev.jdbc.videojuegos.VideojuegoJdbc;
import com.krakdev.videojuegos.entidades.Videojuego;

@Service
public class ServicioVideojuegoJdbc {
	private static final Logger Log = LogManager.getLogger(ServicioVideojuegoJdbc.class);

	public Videojuego crear(Videojuego videojuego) {
		Log.info("Servicio crear");
		return VideojuegoJdbc.insertar(videojuego);
				
	}
}
