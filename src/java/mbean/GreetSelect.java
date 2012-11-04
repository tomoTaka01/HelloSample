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
public enum GreetSelect {
    Hello("1", "Hello", "こんにちは"),
    GoodMorning("2", "Good Morning", "おはよう") ,
    GoodNight("3", "Good Night", "おやすみ")
    ;
    private final String value;
    private final String label;
    private final String japanesPhrase;
    private final String englishPhrase;
    GreetSelect(String value, String label, String japanesPhrase){
        this.value = value;
        this.label = label;
        this.englishPhrase = label;
        this.japanesPhrase = japanesPhrase;
    }
    public SelectItem getSelectItem(){
        return new SelectItem(this.value, this.label);
    };
    public String getValue(){
        return this.value;
    }

    public String getEnglishPhrase() {
        return englishPhrase;
    }

    public String getJapanesPhrase() {
        return japanesPhrase;
    }
}
