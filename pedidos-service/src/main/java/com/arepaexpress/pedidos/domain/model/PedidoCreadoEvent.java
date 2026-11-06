package com.arepaexpress.pedidos.domain.model;

import java.util.List;

public record PedidoCreadoEvent(String pedidoId, String cliente, List<String> arepas, String fecha) {}

