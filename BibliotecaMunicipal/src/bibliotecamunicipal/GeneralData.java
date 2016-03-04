/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecamunicipal;
/**
 * @author Luciano Bermudez
 */
public class GeneralData {
    private String nombre;
    private String autor;
    private String publicacion;
    private String area;
    private String codigo;
    
    //getters y setters
    public String getNombre() { return nombre;  }
    public String setNombre(String nombre) { return this.nombre = nombre; }

    public String getAutor() { return autor;  }
    public String setAutor(String autor) { return this.autor = autor; }

    public String getPublicacion() { return publicacion;  }
    public String setPublicacion(String publicacion) { return this.publicacion = publicacion; }

    public String getArea() { return area;  }
    public String setArea(String area) { return this.area = area; }

    public String getCodigo() { return codigo;  }
    public String setCodigo(String codigo) { return this.codigo = codigo; }
}  