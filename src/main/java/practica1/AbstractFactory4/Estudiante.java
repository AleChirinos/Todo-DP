package practica1.AbstractFactory4;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String codigo;

    public Estudiante(String nombre, String apellido, String codigo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.codigo=codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void showInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Codigo: "+codigo);
    }
}
