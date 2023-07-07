package etu001956.framework;

import java.util.HashMap;

public class ModelView {
    private HashMap<String, Object> data;
    private String viewUrl;

    public ModelView() {
        data = new HashMap<>();
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }

    public void addItem(String key, Object value) {
        data.put(key, value);
    }

    public String getViewUrl() {
        return viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }
}
