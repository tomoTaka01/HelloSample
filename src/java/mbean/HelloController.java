/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="HelloCtl")
@SessionScoped

public class HelloController {

    public HelloController() {
    }
    
    private String name;

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
        return "Hello " + name;
    }
}
