public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("20243ds039" ,"Kokichi Ouma", 2000.50, "Medio pollo del pollo feliz" );
        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("20243ds039", "Shuichi", 10.50, 5);

        System.out.println("El empleado a tiempo completo es:" + empleado1.getNombre() + "\n. Su ID es: " + empleado1.getId() + "\n. Su salario base es de: " + empleado1.getSalarioBase() + "\n. Sus beneficios son: " + empleado1.getBeneficios() + "\n. Su salario es: ");
        System.out.println(empleado1.calcularSalario());
        System.out.println("El empleado por horas es: " + empleado2.getNombre() + "\n. Su ID es: " + empleado2.getId() + "\n. Su salario base es de: " + empleado2.getSalarioBase() + "\n. Sus horas trabajadas son: " + empleado2.getHorasTrabajadas() + "\n. Su sueldo total es de: ");
        System.out.println(empleado2.calcularSalario());
    }
}