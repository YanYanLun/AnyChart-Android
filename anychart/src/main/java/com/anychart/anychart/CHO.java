package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * CHO indicator class.
 */
public class CHO extends JsObject {

    public CHO() {
        js.setLength(0);
        js.append("var cHO").append(++variableIndex).append(" = anychart.core.stock.indicators.cHO();");
        jsBase = "cHO" + variableIndex;
    }

    protected CHO(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected CHO(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Double fastPeriod;
    private List<CHO> setFastPeriod = new ArrayList<>();

    /**
     * Setter for the fast period.
     */
    public CHO setFastPeriod(Double fastPeriod) {
        if (jsBase == null) {
            this.fastPeriod = fastPeriod;
        } else {
            this.fastPeriod = fastPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fastPeriod(%f)", fastPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fastPeriod(%f)", fastPeriod));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFastPeriod() {
        if (!setFastPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CHO item : setFastPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private MovingAverageType maType;
    private String maType1;
    private List<CHO> setMaType = new ArrayList<>();

    /**
     * Setter for the indicator smoothing type.
     */
    public CHO setMaType(MovingAverageType maType) {
        if (jsBase == null) {
            this.maType = null;
            this.maType1 = null;
            
            this.maType = maType;
        } else {
            this.maType = maType;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".maType(%s)", ((maType != null) ? maType.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maType(%s)", ((maType != null) ? maType.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaType() {
        if (!setMaType.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CHO item : setMaType) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CHO> setMaType1 = new ArrayList<>();

    /**
     * Setter for the indicator smoothing type.
     */
    public CHO setMaType(String maType1) {
        if (jsBase == null) {
            this.maType = null;
            this.maType1 = null;
            
            this.maType1 = maType1;
        } else {
            this.maType1 = maType1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".maType(%s)", wrapQuotes(maType1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maType(%s)", wrapQuotes(maType1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaType1() {
        if (!setMaType1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CHO item : setMaType1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private StockSeriesBase getSeries;

    /**
     * Getter for the indicator series.
     */
    public StockSeriesBase getSeries() {
        if (getSeries == null)
            getSeries = new StockSeriesBase(jsBase + ".series()");

        return getSeries;
    }

    private StockSeriesType type;
    private String type1;
    private List<CHO> setSeries = new ArrayList<>();

    /**
     * Setter for the indicator series.
     */
    public CHO setSeries(StockSeriesType type) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type = type;
        } else {
            this.type = type;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".series(%s)", ((type != null) ? type.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".series(%s)", ((type != null) ? type.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSeries() {
        if (!setSeries.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CHO item : setSeries) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<CHO> setSeries1 = new ArrayList<>();

    /**
     * Setter for the indicator series.
     */
    public CHO setSeries(String type1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
        } else {
            this.type1 = type1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".series(%s)", wrapQuotes(type1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".series(%s)", wrapQuotes(type1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSeries1() {
        if (!setSeries1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CHO item : setSeries1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double slowPeriod;
    private List<CHO> setSlowPeriod = new ArrayList<>();

    /**
     * Setter for the slow period.
     */
    public CHO setSlowPeriod(Double slowPeriod) {
        if (jsBase == null) {
            this.slowPeriod = slowPeriod;
        } else {
            this.slowPeriod = slowPeriod;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".slowPeriod(%f)", slowPeriod));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".slowPeriod(%f)", slowPeriod));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSlowPeriod() {
        if (!setSlowPeriod.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (CHO item : setSlowPeriod) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetSeries() {
        if (getSeries != null) {
            return getSeries.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetSeries());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetFastPeriod());
        js.append(generateJSsetMaType());
        js.append(generateJSsetMaType1());
        js.append(generateJSsetSeries());
        js.append(generateJSsetSeries1());
        js.append(generateJSsetSlowPeriod());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}