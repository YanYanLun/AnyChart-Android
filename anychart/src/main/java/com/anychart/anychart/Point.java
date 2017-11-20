package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Class that wraps point of series/chart.
 */
public class Point extends JsObject {

    public Point() {
        js.setLength(0);
        js.append("var point").append(++variableIndex).append(" = anychart.core.point();");
        jsBase = "point" + variableIndex;
    }

    protected Point(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Point(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String field;

    /**
     * Fetches a field value from point data row by its name.
     */
    public void get(String field) {
        if (jsBase == null) {
            this.field = field;
        } else {
            this.field = field;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".get(%s)", wrapQuotes(field)));
                js.setLength(0);
            }
        }
    }

    private SeparateChart getGetChart;

    /**
     * Getter for the current chart which current point belongs to.
     */
    public SeparateChart getGetChart() {
        if (getGetChart == null)
            getGetChart = new SeparateChart(jsBase + ".getChart()");

        return getGetChart;
    }

    private Boolean hovered;
    private List<Point> setHovered = new ArrayList<>();

    /**
     * Setter for hover point state.
     */
    public Point setHovered(Boolean hovered) {
        if (jsBase == null) {
            this.hovered = hovered;
        } else {
            this.hovered = hovered;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hovered(%b)", hovered));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hovered(%b)", hovered));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHovered() {
        if (!setHovered.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Point item : setHovered) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean selected;
    private List<Point> setSelected = new ArrayList<>();

    /**
     * Setter for select point state.
     */
    public Point setSelected(Boolean selected) {
        if (jsBase == null) {
            this.selected = selected;
        } else {
            this.selected = selected;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selected(%b)", selected));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selected(%b)", selected));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelected() {
        if (!setSelected.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Point item : setSelected) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String field1;
    private List<Point> setSet = new ArrayList<>();

    /**
     * Sets the field of the point data row to the specified value.
     */
    public Point setSet(String field1) {
        if (jsBase == null) {
            this.field = null;
            this.field1 = null;
            
            this.field1 = field1;
        } else {
            this.field1 = field1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".set(%s)", wrapQuotes(field1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".set(%s)", wrapQuotes(field1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSet() {
        if (!setSet.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Point item : setSet) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetGetChart() {
        if (getGetChart != null) {
            return getGetChart.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetChart());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetHovered());
        js.append(generateJSsetSelected());
        js.append(generateJSsetSet());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}