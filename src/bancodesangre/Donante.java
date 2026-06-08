/*
 * PROGRAMA: BANCO DE SANGRE
 * AUTORES: MICHAEL RESTREPO LACHE Y JUAN CAMILO PUENTES NAVARO
 * FECHA: 19 DE MAYO DE 2026 
 */

package bancodesangre;

public class Donante extends Persona {

    private static final long serialVersionUID = 1L;

    private String grupoSanguineo;
    private String rh;

    public Donante(String nombre,
                   String direccion,
                   String telefono,
                   String grupoSanguineo,
                   String rh) {

        super(nombre, direccion, telefono);

        this.grupoSanguineo = grupoSanguineo;
        this.rh = rh;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public String getRh() {
        return rh;
    }				

    @Override
    public void mostrarRol() {

        System.out.println("Rol: Donante");
    }

    @Override
    public String toString() {

        return super.toString() +
               "\nGrupo Sanguineo: " + grupoSanguineo +
               "\nRH: " + rh;
    }
}