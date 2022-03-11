public class Paciente {

    private Paciente next = null;
    private Paciente prev = null;

    private String clinica = null;
    private String sexo = null;
    private String nombre = null;
    private String apellido = null;
    private String id = null;
    private String historia = null;

    public Paciente(){}
    
    public Paciente(String clinica,String sexo, String nombre, String apellido, String id, String historia) {
       
        this.clinica = clinica;
        this.sexo = sexo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.historia = historia;
    }

    public Paciente getNext() {
        return next;
    }

    public void setNextNode(Paciente next) {
        this.next = next;
    }

    public Paciente getPrev() {
        return prev;
    }

    public void setPrevNode(Paciente prev) {
        this.prev = prev;
    }

    public Object getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
