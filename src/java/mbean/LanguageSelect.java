/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mbean;

import javax.faces.model.SelectItem;

/**
 *
 * @author tomo
 */
public enum LanguageSelect {
    English("1", "English"),
    Japanes("2", "Japanes");
    private final String value;
    private final String label;
    private LanguageSelect(String value, String label) {
        this.value = value;
        this.label = label;
    }
    public SelectItem getLanguageItem() {
        return new SelectItem(this.value, this.label);
    }
    public String getValue() {
        return this.value;
    }
}
