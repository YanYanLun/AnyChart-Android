package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Led pointer class.
 */
public class Led extends LineargaugePointersBase {

    public Led() {
        js.setLength(0);
        js.append("var led").append(++variableIndex).append(" = anychart.core.linearGauge.pointers.led();");
        jsBase = "led" + variableIndex;
    }

    protected Led(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Led(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Led getColorScale;

    /**
     * Getter for led color scale.
     */
    public Led getColorScale() {
        if (getColorScale == null)
            getColorScale = new Led(jsBase + ".colorScale()");

        return getColorScale;
    }

    private LinearColor colorScale;
    private OrdinalColor colorScale1;
    private List<Led> setColorScale = new ArrayList<>();

    /**
     * Setter for the led color scale.
     */
    public Led setColorScale(LinearColor colorScale) {
        if (jsBase == null) {
            this.colorScale = null;
            this.colorScale1 = null;
            
            this.colorScale = colorScale;
        } else {
            this.colorScale = colorScale;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(colorScale.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale != null) ? colorScale.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetColorScale() {
        if (!setColorScale.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Led item : setColorScale) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Led> setColorScale1 = new ArrayList<>();

    /**
     * Setter for the led color scale.
     */
    public Led setColorScale(OrdinalColor colorScale1) {
        if (jsBase == null) {
            this.colorScale = null;
            this.colorScale1 = null;
            
            this.colorScale1 = colorScale1;
        } else {
            this.colorScale1 = colorScale1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(colorScale1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".colorScale(%s);",  ((colorScale1 != null) ? colorScale1.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetColorScale1() {
        if (!setColorScale1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Led item : setColorScale1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double count;
    private List<Led> setCount = new ArrayList<>();

    /**
     * Setter for the led interval.
     */
    public Led setCount(Double count) {
        if (jsBase == null) {
            this.count = count;
        } else {
            this.count = count;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".count(%f)", count));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".count(%f)", count));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCount() {
        if (!setCount.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Led item : setCount) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double gap;
    private String gap1;
    private List<Led> setGap = new ArrayList<>();

    /**
     * Setter for the led gap.
     */
    public Led setGap(Double gap) {
        if (jsBase == null) {
            this.gap = null;
            this.gap1 = null;
            
            this.gap = gap;
        } else {
            this.gap = gap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".gap(%f)", gap));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".gap(%f)", gap));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetGap() {
        if (!setGap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Led item : setGap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Led> setGap1 = new ArrayList<>();

    /**
     * Setter for the led gap.
     */
    public Led setGap(String gap1) {
        if (jsBase == null) {
            this.gap = null;
            this.gap1 = null;
            
            this.gap1 = gap1;
        } else {
            this.gap1 = gap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".gap(%s)", wrapQuotes(gap1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".gap(%s)", wrapQuotes(gap1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetGap1() {
        if (!setGap1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Led item : setGap1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double size;
    private String size1;
    private List<Led> setSize = new ArrayList<>();

    /**
     * Setter for the led size.
     */
    public Led setSize(Double size) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size = size;
        } else {
            this.size = size;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".size(%f)", size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%f)", size));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSize() {
        if (!setSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Led item : setSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Led> setSize1 = new ArrayList<>();

    /**
     * Setter for the led size.
     */
    public Led setSize(String size1) {
        if (jsBase == null) {
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.size1 = size1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".size(%s)", wrapQuotes(size1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".size(%s)", wrapQuotes(size1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSize1() {
        if (!setSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Led item : setSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetColorScale() {
        if (getColorScale != null) {
            return getColorScale.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetColorScale());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetColorScale());
        js.append(generateJSsetColorScale1());
        js.append(generateJSsetCount());
        js.append(generateJSsetGap());
        js.append(generateJSsetGap1());
        js.append(generateJSsetSize());
        js.append(generateJSsetSize1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}