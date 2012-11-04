/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name="HelloCtl")
@SessionScoped

public class HelloController {
    private static List<SelectItem> greetItems;
    private static List<SelectItem> languageItems;
    private static Map<String, GreetSelect> greetMap;
    static {
        initGreetItems();
        initLanguageItems();
    }
    
    private String name;
    private String greetSelect;
    private String languageSelect;
    
    public HelloController() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String doGreet(){
        return "GreetingPage.xhtml";
    }
    public String getGreeting(){
        String phrase = getPhrase();
        return phrase + " " + name;
    }

    public String getGreetSelect() {
        return greetSelect;
    }

    public void setGreetSelect(String greetSelect) {
        this.greetSelect = greetSelect;
    }

    public String getLanguageSelect() {
        return languageSelect;
    }

    public void setLanguageSelect(String languageSelect) {
        this.languageSelect = languageSelect;
    }

    public List<SelectItem> getGreetItems() {
        return greetItems;
    }

    public List<SelectItem> getLanguageItems() {
        return languageItems;
    }

    private static void initGreetItems() {
        greetItems = new ArrayList();
        greetMap = new HashMap();
        for (GreetSelect sel : GreetSelect.values()) {
            greetItems.add(sel.getSelectItem());
            greetMap.put(sel.getValue(), sel);
        }
    }

    private static void initLanguageItems() {
        languageItems = new ArrayList();
        for (LanguageSelect sel : LanguageSelect.values()) {
            languageItems.add(sel.getLanguageItem());
        }
    }

    private String getPhrase() {
        GreetSelect greetSel = greetMap.get(this.greetSelect);
        if (LanguageSelect.Japanes.getValue().equals(this.languageSelect)) {
            return greetSel.getJapanesPhrase();
        } else {
            return greetSel.getEnglishPhrase();
        }        
    }
}
