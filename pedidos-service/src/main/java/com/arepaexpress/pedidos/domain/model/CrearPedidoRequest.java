package com.arepaexpress.pedidos.domain.model;

import java.util.List;

public record CrearPedidoRequest(String cliente, List<String> arepas) {}

