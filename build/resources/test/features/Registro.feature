# language: es

Característica: Registrarme en la página
  Como un usuario
  Quiero registrarme en la página www.abc.com
  Para acceder a la página

  @Registro
  Escenario: Registro exitoso
    Dado que un usuario ingresa a la web
    Cuando Ingresa diligencia toda la informacion
    Entonces generara mensaje de registro exitoso