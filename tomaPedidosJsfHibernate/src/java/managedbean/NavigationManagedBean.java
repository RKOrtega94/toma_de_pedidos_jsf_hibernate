package managedbean;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * Bean que permite controlar las interfaces de usuario.
 * @author RKOrtega
 */
@Named(value = "navigationManagedBean")
@ViewScoped
public class NavigationManagedBean implements Serializable{

    private String view = "";
    
    public NavigationManagedBean() {
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
    
    //Metodo para recuperar la vista a implementarse
    public String doRedirect(){
        return view;
    }
}
