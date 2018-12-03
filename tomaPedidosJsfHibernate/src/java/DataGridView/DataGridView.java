package DataGridView;

import Entity.Menu;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import service.MenuService;

/**
 *
 * @author RKOrtega
 */
@Named(value = "dataGridView")
@ViewScoped
public class DataGridView implements Serializable {

    private List<Menu> menus;
    private Menu selectedMenu;

    @ManagedProperty("#{menuService}")
    private MenuService service;
    
    @PostConstruct
    public void init(){
        menus = service.createMenu(10);
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Menu getSelectedMenu() {
        return selectedMenu;
    }

    public void setSelectedMenu(Menu selectedMenu) {
        this.selectedMenu = selectedMenu;
    }
    
    
}
