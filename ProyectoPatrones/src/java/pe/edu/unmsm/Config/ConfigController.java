/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.unmsm.Config;

/**
 *
 * @author Administrador
 */
public final class ConfigController {
    private static final String PERSONA_INDEX="Vistas/Persona/PersonaIndex.jsp";
    private static final String PERSONA_LISTAR="Vistas/Persona/PersonaListar.jsp";
    private static final String PERSONA_ADD="Vistas/Persona/PersonaAdd.jsp";
    private static final String PERSONA_EDIT="Vistas/Persona/PersonaEdit.jsp";
    
    private static final String HOME ="vistas/home.jsp";
    

    public static String getPERSONA_INDEX() {
        return PERSONA_INDEX;
    }

    public static String getPERSONA_LISTAR() {
        return PERSONA_LISTAR;
    }

    public static String getPERSONA_ADD() {
        return PERSONA_ADD;
    }

    public static String getPERSONA_EDIT() {
        return PERSONA_EDIT;
    }
    
    //

    public static String getHOME() {
        return HOME;
    }
    
    
}
