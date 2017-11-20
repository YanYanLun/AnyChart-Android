package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Point representing choropleth points that belongs to map.
 */
public class ChoroplethPoint extends SeriesPoint {

    public ChoroplethPoint() {
        js.setLength(0);
        js.append("var choroplethPoint").append(++variableIndex).append(" = anychart.core.choroplethPoint();");
        jsBase = "choroplethPoint" + variableIndex;
    }

    protected ChoroplethPoint(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ChoroplethPoint(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String crs;
    private List<ChoroplethPoint> setCrs = new ArrayList<>();

    /**
     * Changes crs (coordinate system) of the point.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint crs(String crs) {
        if (jsBase == null) {
            this.crs = crs;
        } else {
            this.crs = crs;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".crs(%s)", wrapQuotes(crs)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".crs(%s)", wrapQuotes(crs)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCrs() {
        if (!setCrs.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChoroplethPoint item : setCrs) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private AnychartMathRect getGetFeatureBounds;

    /**
     * Getter for the current point bounds.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public AnychartMathRect getGetFeatureBounds() {
        if (getGetFeatureBounds == null)
            getGetFeatureBounds = new AnychartMathRect(jsBase + ".getFeatureBounds()");

        return getGetFeatureBounds;
    }

    private Double middleX;
    private List<ChoroplethPoint> setMiddleX = new ArrayList<>();

    /**
     * Setter for the X center of the point label.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint setMiddleX(Double middleX) {
        if (jsBase == null) {
            this.middleX = middleX;
        } else {
            this.middleX = middleX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".middleX(%f)", middleX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleX(%f)", middleX));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMiddleX() {
        if (!setMiddleX.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChoroplethPoint item : setMiddleX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double middleY;
    private List<ChoroplethPoint> setMiddleY = new ArrayList<>();

    /**
     * Setter for the Y center of the point label.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint setMiddleY(Double middleY) {
        if (jsBase == null) {
            this.middleY = middleY;
        } else {
            this.middleY = middleY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".middleY(%f)", middleY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".middleY(%f)", middleY));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMiddleY() {
        if (!setMiddleY.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChoroplethPoint item : setMiddleY) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double scale;
    private List<ChoroplethPoint> setScaleFactor = new ArrayList<>();

    /**
     * Scales point.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint scaleFactor(Double scale) {
        if (jsBase == null) {
            this.scale = scale;
        } else {
            this.scale = scale;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".scaleFactor(%f)", scale));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".scaleFactor(%f)", scale));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetScaleFactor() {
        if (!setScaleFactor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChoroplethPoint item : setScaleFactor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double dx;
    private Double dy;
    private List<ChoroplethPoint> setTranslate = new ArrayList<>();

    /**
     * Moves point.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint translate(Double dx, Double dy) {
        if (jsBase == null) {
            this.dx = dx;
            this.dy = dy;
        } else {
            this.dx = dx;
            this.dy = dy;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".translate(%f, %f)", dx, dy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".translate(%f, %f)", dx, dy));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTranslate() {
        if (!setTranslate.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChoroplethPoint item : setTranslate) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double dx1;
    private Double dy1;
    private List<ChoroplethPoint> setTranslation = new ArrayList<>();

    /**
     * Setter for the point translation.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Map#draw} is called.
     */
    public ChoroplethPoint setTranslation(Double dx1, Double dy1) {
        if (jsBase == null) {
            this.dx = null;
            this.dx1 = null;
            
            this.dx1 = dx1;
            this.dy = null;
            this.dy1 = null;
            
            this.dy1 = dy1;
        } else {
            this.dx1 = dx1;
            this.dy1 = dy1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".translation(%f, %f)", dx1, dy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".translation(%f, %f)", dx1, dy1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTranslation() {
        if (!setTranslation.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (ChoroplethPoint item : setTranslation) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetGetFeatureBounds() {
        if (getGetFeatureBounds != null) {
            return getGetFeatureBounds.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetFeatureBounds());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetCrs());
        js.append(generateJSsetMiddleX());
        js.append(generateJSsetMiddleY());
        js.append(generateJSsetScaleFactor());
        js.append(generateJSsetTranslate());
        js.append(generateJSsetTranslation());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}