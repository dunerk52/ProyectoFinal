/*
 * PROGRAMA: BANCO DE SANGRE
 * AUTORES: MICHAEL RESTREPO LACHE Y JUAN CAMILO PUENTES NAVARO
 * FECHA: 19 DE MAYO DE 2026 
 */

package bancodesangre;

import java.io.Serializable;

public abstract class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String nombre;
    protected String direccion;
    protected String telefono;

    // CONSTRUCTOR
    public Persona(String nombre,
                   String direccion,
                   String telefono) {

        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    // METODO ABSTRACTO
    public abstract void mostrarRol();

    @Override
    public String toString() {

        return "Nombre: " + nombre +
               "\nDireccion: " + direccion +
               "\nTelefono: " + telefono;
    }
}
