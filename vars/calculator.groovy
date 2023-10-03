def sum(x,y) {
  echo "La suma de ${x} + ${y} es ${x+y}"
}
def mul(x,y) {
  echo "La multiplicación de ${x} y ${y} es ${x*y}"
}
def saludo(Map params){
  echo "Hola ${params.nombre}. Hoy es ${params.diaSemana}."
}
