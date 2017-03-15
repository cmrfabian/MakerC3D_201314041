package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String LV;
    private String LF;

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String lv, String lf){
        this.LV = lv;
        this.LF = lf;
    }
    
    
    
    public String getCad(){
        return cad;
    }
    
    public String getLV(){
        return LV;
    }
        
    public String getLF(){
        return LF;
    }
    
    
        
}
