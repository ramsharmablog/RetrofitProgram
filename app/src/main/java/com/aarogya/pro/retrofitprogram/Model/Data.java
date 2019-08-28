
package com.aarogya.pro.retrofitprogram.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("Developers")
    @Expose
    private List<Developer> developers = null;
    @SerializedName("politician")
    @Expose
    private List<Politician> politician = null;
    @SerializedName("sports")
    @Expose
    private List<Sport> sports = null;
    @SerializedName("Actor")
    @Expose
    private List<Object> actor = null;

    public List<Developer> getDevelopers() {
        return developers;
    }

    public void setDevelopers(List<Developer> developers) {
        this.developers = developers;
    }

    public List<Politician> getPolitician() {
        return politician;
    }

    public void setPolitician(List<Politician> politician) {
        this.politician = politician;
    }

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    public List<Object> getActor() {
        return actor;
    }

    public void setActor(List<Object> actor) {
        this.actor = actor;
    }

}
