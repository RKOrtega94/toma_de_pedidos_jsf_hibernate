package service;

import Entity.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.inject.Named;
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author RKOrtega
 */
@Named(value = "menuService")
@ApplicationScoped
public class MenuService {

    private final static String[] menu;

    private final static String[] descripcion;

    static{
        menu = new String[4];
        menu[0] = "food1";
        menu[1] = "food2";
        menu[2] = "food3";
        menu[3] = "food4";
        
        descripcion = new String[4];
        descripcion[0] = "img1";
        descripcion[1] = "img2";
        descripcion[2] = "img3";
        descripcion[3] = "img4";
    }
    
    public List<Menu> createMenu(int size){
        List<Menu> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            list.add(new Menu(getRamdonId(), getRamdonMenu(), getRamdonDescripcion()));
        }
        return list;
    }
    
    private String getRamdonId(){
        return UUID.randomUUID().toString().substring(0, 8);
    }
    
    private String getRamdonMenu(){
        return menu[(int) (Math.random()*4)];
    }
    
    private String getRamdonDescripcion(){
        return descripcion[(int) (Math.random()*4)];
    }
}
