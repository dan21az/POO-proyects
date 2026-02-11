package espol.poo.modelo;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Empleado implements Serializable {
    private int id; //identificador unico
    private String nombre;
    private Departamento departamento;
    public static final String nomArchivo = "empleados.ser";
    public static int ultimoId = 0;
    public Empleado(String nombre, Departamento departamento) {
        id= ultimoId +1;
        this.nombre = nombre;
        this.departamento = departamento;
        ultimoId= id;
    }

    public String getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return id == empleado.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    //devuelve una lista simple de empleados
    public static ArrayList<Empleado> obtenerEmpleados(){
        ArrayList<Empleado> lista = new ArrayList<>();

        lista.add(new Empleado("Luis Torres",new Departamento("Ventas", "ventas@etp.com")));
        lista.add(new Empleado("Sofia Castro",new Departamento("Contabilidad", "contable@etp.com")));
        lista.add(new Empleado("Marcos Valle",new Departamento("Ventas", "ventas@etp.com")));
        return lista;
    }
    @Override
    public String toString() {
        return  nombre +  " - " + departamento + "-";
    }


    //lee el archivo donde se encuentran los datos
    public static ArrayList<Empleado> cargarEmpleados(File directorio){
        ArrayList<Empleado> lista = new ArrayList<>();
        File f = new File(directorio, nomArchivo);
        //se escribe la lista serializada
        if ( f.exists()) { //si existe lee la lista del archivo
            try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(f))) {
                lista = (ArrayList<Empleado>) is.readObject();
                Empleado.ultimoId = lista.size();//establecer el ultimo id

            } catch (Exception e) {
                //quizas lanzar una excepcion personalizada
                new Exception(e.getMessage());
            }
        }
        return lista;
    }

    /**
     *
     * @param directorio directorio en android donde se guardará el archivo
     * @return true si se pudo crear el archivo o ya existe.
     */
    public static boolean crearDatosIniciales(File directorio) throws Exception{
        ArrayList<Empleado> lista = new ArrayList<>();
        boolean guardado = false;
        lista.add(new Empleado("Luis Torres",new Departamento("Ventas", "ventas@etp.com")));
        lista.add(new Empleado("Sofia Castro",new Departamento("Contabilidad", "contable@etp.com")));
        lista.add(new Empleado("Marcos Valle",new Departamento("Ventas", "ventas@etp.com")));
        guardarLista(directorio,lista);
        return guardado;
    }

    public static boolean guardarLista(File directorio,ArrayList<Empleado> lista) throws Exception{
        boolean guardado = false;
        File f = new File(directorio, nomArchivo);
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f))) {
            os.writeObject(lista);
            guardado = true;
        } catch (IOException e) {

            //quizas lanzar una excepcion personalizada
            throw new Exception(e.getMessage());
        }
        return guardado;
    }
}
