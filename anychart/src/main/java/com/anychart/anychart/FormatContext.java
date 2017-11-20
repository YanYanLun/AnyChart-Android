package com.anychart.anychart;

// class
/**
 * Common format context class.
 */
public class FormatContext extends JsObject {

    public FormatContext() {
        js.setLength(0);
        js.append("var formatContext").append(++variableIndex).append(" = anychart.format.context();");
        jsBase = "formatContext" + variableIndex;
    }

    protected FormatContext(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected FormatContext(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    

    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}