/*
 * PROGRAMA: BANCO DE SANGRE
 * AUTORES: MICHAEL RESTREPO LACHE Y JUAN CAMILO PUENTES NAVARO
 * FECHA: 19 DE MAYO DE 2026 
 */

package bancodesangre;

public class Administrador extends Persona {

    private static final long serialVersionUID = 1L;

    private String cargo;

    public Administrador(String nombre,
                         String direccion,
                         String telefono,
                         String cargo) {

        super(nombre, direccion, telefono);

        this.cargo = cargo;
    }

    @Override
    public void mostrarRol() {

        System.out.println("Rol: Administrador");
    }

    @Override
    public String toString() {

        return super.toString() +
               "\nCargo: " + cargo;
    }
}