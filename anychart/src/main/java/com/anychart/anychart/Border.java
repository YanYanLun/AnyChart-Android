package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Border settings proxy. Doesn't store anything - just passes settings to and from the parent object.
 */
public class Border extends JsObject {

    public Border() {
        js.setLength(0);
        js.append("var border").append(++variableIndex).append(" = anychart.core.ui.table.border();");
        jsBase = "border" + variableIndex;
    }

    protected Border(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Border(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Stroke color;
    private ColoredFill color1;
    private String color2;
    private Double thickness;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;
    private List<Border> setBottom = new ArrayList<>();

    /**
     * Setter for bottom border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setBottom(Stroke color, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color = color;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", ((color != null) ? color.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottom() {
        if (!setBottom.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setBottom) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Border> setBottom1 = new ArrayList<>();

    /**
     * Setter for bottom border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setBottom(ColoredFill color1, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color1 = color1;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", ((color1 != null) ? color1.generateJs() : "null"), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottom1() {
        if (!setBottom1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setBottom1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Border> setBottom2 = new ArrayList<>();

    /**
     * Setter for bottom border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setBottom(String color2, Double thickness, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color2 = color2;
            this.thickness = thickness;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".bottom(%s, %f, %s, %s, %s)", wrapQuotes(color2), thickness, wrapQuotes(dashpattern), ((lineJoin != null) ? lineJoin.generateJs() : "null"), ((lineCap != null) ? lineCap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBottom2() {
        if (!setBottom2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setBottom2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color3;
    private ColoredFill color4;
    private String color5;
    private Double thickness1;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;
    private List<Border> setLeft = new ArrayList<>();

    /**
     * Setter for left border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setLeft(Stroke color3, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color3 = color3;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.color3 = color3;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", ((color3 != null) ? color3.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeft() {
        if (!setLeft.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setLeft) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Border> setLeft1 = new ArrayList<>();

    /**
     * Setter for left border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setLeft(ColoredFill color4, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", ((color4 != null) ? color4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", ((color4 != null) ? color4.generateJs() : "null"), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeft1() {
        if (!setLeft1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setLeft1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Border> setLeft2 = new ArrayList<>();

    /**
     * Setter for left border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setLeft(String color5, Double thickness1, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.color5 = color5;
            this.thickness1 = thickness1;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", wrapQuotes(color5), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".left(%s, %f, %s, %s, %s)", wrapQuotes(color5), thickness1, wrapQuotes(dashpattern1), ((lineJoin1 != null) ? lineJoin1.generateJs() : "null"), ((lineCap1 != null) ? lineCap1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLeft2() {
        if (!setLeft2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setLeft2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color6;
    private ColoredFill color7;
    private String color8;
    private Double thickness2;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;
    private List<Border> setRight = new ArrayList<>();

    /**
     * Setter for right border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setRight(Stroke color6, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", ((color6 != null) ? color6.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", ((color6 != null) ? color6.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRight() {
        if (!setRight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setRight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Border> setRight1 = new ArrayList<>();

    /**
     * Setter for right border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setRight(ColoredFill color7, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color7 = color7;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", ((color7 != null) ? color7.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", ((color7 != null) ? color7.generateJs() : "null"), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRight1() {
        if (!setRight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setRight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Border> setRight2 = new ArrayList<>();

    /**
     * Setter for right border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setRight(String color8, Double thickness2, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            
            this.color8 = color8;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color8 = color8;
            this.thickness2 = thickness2;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", wrapQuotes(color8), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".right(%s, %f, %s, %s, %s)", wrapQuotes(color8), thickness2, wrapQuotes(dashpattern2), ((lineJoin2 != null) ? lineJoin2.generateJs() : "null"), ((lineCap2 != null) ? lineCap2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRight2() {
        if (!setRight2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setRight2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Stroke color9;
    private ColoredFill color10;
    private String color11;
    private Double thickness3;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;
    private List<Border> setTop = new ArrayList<>();

    /**
     * Setter for top border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setTop(Stroke color9, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color9 = color9;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", ((color9 != null) ? color9.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", ((color9 != null) ? color9.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTop() {
        if (!setTop.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setTop) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Border> setTop1 = new ArrayList<>();

    /**
     * Setter for top border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setTop(ColoredFill color10, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            
            this.color10 = color10;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color10 = color10;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", ((color10 != null) ? color10.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", ((color10 != null) ? color10.generateJs() : "null"), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTop1() {
        if (!setTop1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setTop1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Border> setTop2 = new ArrayList<>();

    /**
     * Setter for top border settings.
{docs:Graphics/Stroke_Settings}Learn more about stroke settings.{docs}
     */
    public Border setTop(String color11, Double thickness3, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            
            this.color11 = color11;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color11 = color11;
            this.thickness3 = thickness3;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", wrapQuotes(color11), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".top(%s, %f, %s, %s, %s)", wrapQuotes(color11), thickness3, wrapQuotes(dashpattern3), ((lineJoin3 != null) ? lineJoin3.generateJs() : "null"), ((lineCap3 != null) ? lineCap3.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTop2() {
        if (!setTop2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Border item : setTop2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
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

        js.append(generateJSsetBottom());
        js.append(generateJSsetBottom1());
        js.append(generateJSsetBottom2());
        js.append(generateJSsetLeft());
        js.append(generateJSsetLeft1());
        js.append(generateJSsetLeft2());
        js.append(generateJSsetRight());
        js.append(generateJSsetRight1());
        js.append(generateJSsetRight2());
        js.append(generateJSsetTop());
        js.append(generateJSsetTop1());
        js.append(generateJSsetTop2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}