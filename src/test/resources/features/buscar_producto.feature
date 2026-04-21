# language: es

Característica: Buscar producto en Falabella

  Antecedentes:
    Dado que el usuario abre la página de Falabella

  @BuscarProducto
  Escenario: Buscar una tarjeta gráfica y ver el detalle
    Cuando busca el producto "tarjeta grafica"
    Y selecciona el primer resultado de la búsqueda
    Entonces debería ver la página de detalle del producto