# language: es

Característica: Agregar Producto al Carrito

  Antecedentes:
    Dado El usuario se registra en el portal web

    @Carrito
    Escenario: Agregar producto al carrito
      Cuando Usuario selecciona articulo
      Entonces Agrega el producto al carrito