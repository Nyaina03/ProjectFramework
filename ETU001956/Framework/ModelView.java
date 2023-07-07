package etu001956.framework;
public class ModelView {
    private String modelData;
    private String viewUrl;

    public ModelView(String modelData, String viewUrl) {
        this.modelData = modelData;
        this.viewUrl = viewUrl;
    }

    public String getModelData() {
        return modelData;
    }

    public void setModelData(String modelData) {
        this.modelData = modelData;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }
}
