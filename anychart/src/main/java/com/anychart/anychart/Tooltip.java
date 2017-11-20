package com.anychart.anychart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

// class
/**
 * Class for the tooltip.
 */
public class Tooltip extends VisualBase {

    public Tooltip() {
        js.setLength(0);
        js.append("var tooltip").append(++variableIndex).append(" = anychart.core.ui.tooltip();");
        jsBase = "tooltip" + variableIndex;
    }

    protected Tooltip(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Tooltip(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Boolean adjustOrAdjustByWidth;
    private Boolean[] adjustOrAdjustByWidth1;
    private String adjustOrAdjustByWidth2;
    private Boolean adjustByHeight;
    private List<Tooltip> setAdjustFontSize = new ArrayList<>();

    /**
     * Setter for the adjusting font size.
     */
    public Tooltip setAdjustFontSize(Boolean adjustOrAdjustByWidth, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth = adjustOrAdjustByWidth;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth = adjustOrAdjustByWidth;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".adjustFontSize(%b, %b)", adjustOrAdjustByWidth, adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%b, %b)", adjustOrAdjustByWidth, adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize() {
        if (!setAdjustFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setAdjustFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setAdjustFontSize1 = new ArrayList<>();

    /**
     * Setter for the adjusting font size.
     */
    public Tooltip setAdjustFontSize(Boolean[] adjustOrAdjustByWidth1, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth1 = adjustOrAdjustByWidth1;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth1 = adjustOrAdjustByWidth1;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", Arrays.toString(adjustOrAdjustByWidth1), adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%s, %b)", Arrays.toString(adjustOrAdjustByWidth1), adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize1() {
        if (!setAdjustFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setAdjustFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setAdjustFontSize2 = new ArrayList<>();

    /**
     * Setter for the adjusting font size.
     */
    public Tooltip setAdjustFontSize(String adjustOrAdjustByWidth2, Boolean adjustByHeight) {
        if (jsBase == null) {
            this.adjustOrAdjustByWidth = null;
            this.adjustOrAdjustByWidth1 = null;
            this.adjustOrAdjustByWidth2 = null;
            
            this.adjustOrAdjustByWidth2 = adjustOrAdjustByWidth2;
            this.adjustByHeight = adjustByHeight;
        } else {
            this.adjustOrAdjustByWidth2 = adjustOrAdjustByWidth2;
            this.adjustByHeight = adjustByHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".adjustFontSize(%s, %b)", wrapQuotes(adjustOrAdjustByWidth2), adjustByHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".adjustFontSize(%s, %b)", wrapQuotes(adjustOrAdjustByWidth2), adjustByHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAdjustFontSize2() {
        if (!setAdjustFontSize2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setAdjustFontSize2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean allowLeaveChart;
    private List<Tooltip> setAllowLeaveChart = new ArrayList<>();

    /**
     * Setter for the allowLeaveChart tooltip mode.
     */
    public Tooltip setAllowLeaveChart(Boolean allowLeaveChart) {
        if (jsBase == null) {
            this.allowLeaveChart = allowLeaveChart;
        } else {
            this.allowLeaveChart = allowLeaveChart;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".allowLeaveChart(%b)", allowLeaveChart));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".allowLeaveChart(%b)", allowLeaveChart));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAllowLeaveChart() {
        if (!setAllowLeaveChart.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setAllowLeaveChart) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean allowLeaveScreen;
    private List<Tooltip> setAllowLeaveScreen = new ArrayList<>();

    /**
     * Setter for the allowLeaveScreen tooltip mode.
     */
    public Tooltip setAllowLeaveScreen(Boolean allowLeaveScreen) {
        if (jsBase == null) {
            this.allowLeaveScreen = allowLeaveScreen;
        } else {
            this.allowLeaveScreen = allowLeaveScreen;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".allowLeaveScreen(%b)", allowLeaveScreen));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".allowLeaveScreen(%b)", allowLeaveScreen));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAllowLeaveScreen() {
        if (!setAllowLeaveScreen.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setAllowLeaveScreen) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean allowLeaveStage;
    private List<Tooltip> setAllowLeaveStage = new ArrayList<>();

    /**
     * Setter for the allowLeaveStage tooltip mode.
     */
    public Tooltip setAllowLeaveStage(Boolean allowLeaveStage) {
        if (jsBase == null) {
            this.allowLeaveStage = allowLeaveStage;
        } else {
            this.allowLeaveStage = allowLeaveStage;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".allowLeaveStage(%b)", allowLeaveStage));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".allowLeaveStage(%b)", allowLeaveStage));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAllowLeaveStage() {
        if (!setAllowLeaveStage.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setAllowLeaveStage) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsAnchor anchor;
    private String anchor1;
    private List<Tooltip> setAnchor = new ArrayList<>();

    /**
     * Setter for the tooltip anchor.
     */
    public Tooltip setAnchor(EnumsAnchor anchor) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor = anchor;
        } else {
            this.anchor = anchor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".anchor(%s)", ((anchor != null) ? anchor.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".anchor(%s)", ((anchor != null) ? anchor.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAnchor() {
        if (!setAnchor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setAnchor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setAnchor1 = new ArrayList<>();

    /**
     * Setter for the tooltip anchor.
     */
    public Tooltip setAnchor(String anchor1) {
        if (jsBase == null) {
            this.anchor = null;
            this.anchor1 = null;
            
            this.anchor1 = anchor1;
        } else {
            this.anchor1 = anchor1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".anchor(%s)", wrapQuotes(anchor1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".anchor(%s)", wrapQuotes(anchor1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAnchor1() {
        if (!setAnchor1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setAnchor1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiBackground getBackground;

    /**
     * Getter for tooltip background settings.
     */
    public UiBackground getBackground() {
        if (getBackground == null)
            getBackground = new UiBackground(jsBase + ".background()");

        return getBackground;
    }

    private Boolean background;
    private String background1;
    private String background2;
    private List<Tooltip> setBackground = new ArrayList<>();

    /**
     * Setter for tooltip background settings.
     */
    public Tooltip setBackground(Boolean background) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background = background;
        } else {
            this.background = background;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".background(%b)", background));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%b)", background));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground() {
        if (!setBackground.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setBackground) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setBackground1 = new ArrayList<>();

    /**
     * Setter for tooltip background settings.
     */
    public Tooltip setBackground(String background1) {
        if (jsBase == null) {
            this.background = null;
            this.background1 = null;
            this.background2 = null;
            
            this.background1 = background1;
        } else {
            this.background1 = background1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".background(%s)", wrapQuotes(background1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".background(%s)", wrapQuotes(background1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetBackground1() {
        if (!setBackground1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setBackground1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean disablePointerEvents;
    private List<Tooltip> setDisablePointerEvents = new ArrayList<>();

    /**
     * Setter for the pointer events setting.
     */
    public Tooltip setDisablePointerEvents(Boolean disablePointerEvents) {
        if (jsBase == null) {
            this.disablePointerEvents = disablePointerEvents;
        } else {
            this.disablePointerEvents = disablePointerEvents;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".disablePointerEvents(%b)", disablePointerEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".disablePointerEvents(%b)", disablePointerEvents));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDisablePointerEvents() {
        if (!setDisablePointerEvents.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setDisablePointerEvents) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TooltipDisplayMode displayMode;
    private String displayMode1;
    private List<Tooltip> setDisplayMode = new ArrayList<>();

    /**
     * Setter for display mode settings.
<b>Note</b>: Works only for the <b>chart</b> tooltip.
     */
    public Tooltip setDisplayMode(TooltipDisplayMode displayMode) {
        if (jsBase == null) {
            this.displayMode = null;
            this.displayMode1 = null;
            
            this.displayMode = displayMode;
        } else {
            this.displayMode = displayMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".displayMode(%s)", ((displayMode != null) ? displayMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".displayMode(%s)", ((displayMode != null) ? displayMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDisplayMode() {
        if (!setDisplayMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setDisplayMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setDisplayMode1 = new ArrayList<>();

    /**
     * Setter for display mode settings.
<b>Note</b>: Works only for the <b>chart</b> tooltip.
     */
    public Tooltip setDisplayMode(String displayMode1) {
        if (jsBase == null) {
            this.displayMode = null;
            this.displayMode1 = null;
            
            this.displayMode1 = displayMode1;
        } else {
            this.displayMode1 = displayMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".displayMode(%s)", wrapQuotes(displayMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".displayMode(%s)", wrapQuotes(displayMode1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDisplayMode1() {
        if (!setDisplayMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setDisplayMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontColor;
    private List<Tooltip> setFontColor = new ArrayList<>();

    /**
     * Setter for font color settings.
     */
    public Tooltip setFontColor(String fontColor) {
        if (jsBase == null) {
            this.fontColor = fontColor;
        } else {
            this.fontColor = fontColor;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontColor(%s)", wrapQuotes(fontColor)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontColor(%s)", wrapQuotes(fontColor)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontColor() {
        if (!setFontColor.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontColor) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Decoration fontDecoration;
    private String fontDecoration1;
    private List<Tooltip> setFontDecoration = new ArrayList<>();

    /**
     * Setter for font decoration settings.
     */
    public Tooltip setFontDecoration(Decoration fontDecoration) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration = fontDecoration;
        } else {
            this.fontDecoration = fontDecoration;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontDecoration(%s)", ((fontDecoration != null) ? fontDecoration.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontDecoration(%s)", ((fontDecoration != null) ? fontDecoration.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontDecoration() {
        if (!setFontDecoration.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontDecoration) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setFontDecoration1 = new ArrayList<>();

    /**
     * Setter for font decoration settings.
     */
    public Tooltip setFontDecoration(String fontDecoration1) {
        if (jsBase == null) {
            this.fontDecoration = null;
            this.fontDecoration1 = null;
            
            this.fontDecoration1 = fontDecoration1;
        } else {
            this.fontDecoration1 = fontDecoration1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontDecoration(%s)", wrapQuotes(fontDecoration1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontDecoration(%s)", wrapQuotes(fontDecoration1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontDecoration1() {
        if (!setFontDecoration1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontDecoration1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontFamily;
    private List<Tooltip> setFontFamily = new ArrayList<>();

    /**
     * Setter for font family settings.
     */
    public Tooltip setFontFamily(String fontFamily) {
        if (jsBase == null) {
            this.fontFamily = fontFamily;
        } else {
            this.fontFamily = fontFamily;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontFamily(%s)", wrapQuotes(fontFamily)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontFamily(%s)", wrapQuotes(fontFamily)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontFamily() {
        if (!setFontFamily.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontFamily) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double fontOpacity;
    private List<Tooltip> setFontOpacity = new ArrayList<>();

    /**
     * Setter for font opacity settings.
     */
    public Tooltip setFontOpacity(Double fontOpacity) {
        if (jsBase == null) {
            this.fontOpacity = fontOpacity;
        } else {
            this.fontOpacity = fontOpacity;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontOpacity(%f)", fontOpacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontOpacity(%f)", fontOpacity));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontOpacity() {
        if (!setFontOpacity.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontOpacity) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double fontSize;
    private String fontSize1;
    private List<Tooltip> setFontSize = new ArrayList<>();

    /**
     * Setter for font size settings.
     */
    public Tooltip setFontSize(Double fontSize) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize = fontSize;
        } else {
            this.fontSize = fontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontSize(%f)", fontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%f)", fontSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontSize() {
        if (!setFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setFontSize1 = new ArrayList<>();

    /**
     * Setter for font size settings.
     */
    public Tooltip setFontSize(String fontSize1) {
        if (jsBase == null) {
            this.fontSize = null;
            this.fontSize1 = null;
            
            this.fontSize1 = fontSize1;
        } else {
            this.fontSize1 = fontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontSize(%s)", wrapQuotes(fontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontSize1() {
        if (!setFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontStyle;
    private TextFontStyle fontStyle1;
    private List<Tooltip> setFontStyle = new ArrayList<>();

    /**
     * Setter for font style settings.
     */
    public Tooltip setFontStyle(String fontStyle) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle = fontStyle;
        } else {
            this.fontStyle = fontStyle;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", wrapQuotes(fontStyle)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontStyle() {
        if (!setFontStyle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontStyle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setFontStyle1 = new ArrayList<>();

    /**
     * Setter for font style settings.
     */
    public Tooltip setFontStyle(TextFontStyle fontStyle1) {
        if (jsBase == null) {
            this.fontStyle = null;
            this.fontStyle1 = null;
            
            this.fontStyle1 = fontStyle1;
        } else {
            this.fontStyle1 = fontStyle1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle1 != null) ? fontStyle1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontStyle(%s)", ((fontStyle1 != null) ? fontStyle1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontStyle1() {
        if (!setFontStyle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontStyle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontVariant;
    private TextFontVariant fontVariant1;
    private List<Tooltip> setFontVariant = new ArrayList<>();

    /**
     * Setter for font variant settings.
     */
    public Tooltip setFontVariant(String fontVariant) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant = fontVariant;
        } else {
            this.fontVariant = fontVariant;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", wrapQuotes(fontVariant)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontVariant() {
        if (!setFontVariant.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontVariant) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setFontVariant1 = new ArrayList<>();

    /**
     * Setter for font variant settings.
     */
    public Tooltip setFontVariant(TextFontVariant fontVariant1) {
        if (jsBase == null) {
            this.fontVariant = null;
            this.fontVariant1 = null;
            
            this.fontVariant1 = fontVariant1;
        } else {
            this.fontVariant1 = fontVariant1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant1 != null) ? fontVariant1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontVariant(%s)", ((fontVariant1 != null) ? fontVariant1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontVariant1() {
        if (!setFontVariant1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontVariant1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String fontWeight;
    private Double fontWeight1;
    private List<Tooltip> setFontWeight = new ArrayList<>();

    /**
     * Setter for font weight settings.
     */
    public Tooltip setFontWeight(String fontWeight) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight = fontWeight;
        } else {
            this.fontWeight = fontWeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontWeight(%s)", wrapQuotes(fontWeight)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%s)", wrapQuotes(fontWeight)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontWeight() {
        if (!setFontWeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontWeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setFontWeight1 = new ArrayList<>();

    /**
     * Setter for font weight settings.
     */
    public Tooltip setFontWeight(Double fontWeight1) {
        if (jsBase == null) {
            this.fontWeight = null;
            this.fontWeight1 = null;
            
            this.fontWeight1 = fontWeight1;
        } else {
            this.fontWeight1 = fontWeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".fontWeight(%f)", fontWeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".fontWeight(%f)", fontWeight1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFontWeight1() {
        if (!setFontWeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFontWeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String format;
    private List<Tooltip> setFormat = new ArrayList<>();

    /**
     * Setter for function content text for the tooltip.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using format() method.{docs}
     */
    public Tooltip setFormat(String format) {
        if (jsBase == null) {
            this.format = format;
        } else {
            this.format = format;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".format(%s)", wrapQuotes(format)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".format(%s)", wrapQuotes(format)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetFormat() {
        if (!setFormat.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setFormat) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String hAlign;
    private TextHAlign hAlign1;
    private List<Tooltip> setHAlign = new ArrayList<>();

    /**
     * Setter for the text horizontal align settings.
     */
    public Tooltip setHAlign(String hAlign) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign = hAlign;
        } else {
            this.hAlign = hAlign;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hAlign(%s)", wrapQuotes(hAlign)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", wrapQuotes(hAlign)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHAlign() {
        if (!setHAlign.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setHAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setHAlign1 = new ArrayList<>();

    /**
     * Setter for the text horizontal align settings.
     */
    public Tooltip setHAlign(TextHAlign hAlign1) {
        if (jsBase == null) {
            this.hAlign = null;
            this.hAlign1 = null;
            
            this.hAlign1 = hAlign1;
        } else {
            this.hAlign1 = hAlign1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hAlign(%s)", ((hAlign1 != null) ? hAlign1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hAlign(%s)", ((hAlign1 != null) ? hAlign1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHAlign1() {
        if (!setHAlign1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setHAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String height;
    private Double height1;
    private List<Tooltip> setHeight = new ArrayList<>();

    /**
     * Setter for the tooltip height.
     */
    public Tooltip setHeight(String height) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".height(%s)", wrapQuotes(height)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%s)", wrapQuotes(height)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeight() {
        if (!setHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setHeight1 = new ArrayList<>();

    /**
     * Setter for the tooltip height.
     */
    public Tooltip setHeight(Double height1) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.height1 = height1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".height(%f)", height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".height(%f)", height1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHeight1() {
        if (!setHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean force;

    /**
     * Hides tooltips with delay.
     */
    public void hide(Boolean force) {
        if (jsBase == null) {
            this.force = force;
        } else {
            this.force = force;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hide(%b)", force));
                js.setLength(0);
            }
        }
    }

    private Double hideDelay;
    private List<Tooltip> setHideDelay = new ArrayList<>();

    /**
     * Setter for the delay in milliseconds before a tooltip becomes hidden.
     */
    public Tooltip setHideDelay(Double hideDelay) {
        if (jsBase == null) {
            this.hideDelay = hideDelay;
        } else {
            this.hideDelay = hideDelay;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".hideDelay(%f)", hideDelay));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".hideDelay(%f)", hideDelay));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetHideDelay() {
        if (!setHideDelay.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setHideDelay) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double letterSpacing;
    private List<Tooltip> setLetterSpacing = new ArrayList<>();

    /**
     * Setter for text letter spacing settings.
     */
    public Tooltip setLetterSpacing(Double letterSpacing) {
        if (jsBase == null) {
            this.letterSpacing = letterSpacing;
        } else {
            this.letterSpacing = letterSpacing;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".letterSpacing(%f)", letterSpacing));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".letterSpacing(%f)", letterSpacing));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLetterSpacing() {
        if (!setLetterSpacing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setLetterSpacing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double lineHeight;
    private String lineHeight1;
    private List<Tooltip> setLineHeight = new ArrayList<>();

    /**
     * Setter for text line height settings.
     */
    public Tooltip setLineHeight(Double lineHeight) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight = lineHeight;
        } else {
            this.lineHeight = lineHeight;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lineHeight(%f)", lineHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%f)", lineHeight));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLineHeight() {
        if (!setLineHeight.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setLineHeight) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setLineHeight1 = new ArrayList<>();

    /**
     * Setter for text line height settings.
     */
    public Tooltip setLineHeight(String lineHeight1) {
        if (jsBase == null) {
            this.lineHeight = null;
            this.lineHeight1 = null;
            
            this.lineHeight1 = lineHeight1;
        } else {
            this.lineHeight1 = lineHeight1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".lineHeight(%s)", wrapQuotes(lineHeight1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".lineHeight(%s)", wrapQuotes(lineHeight1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLineHeight1() {
        if (!setLineHeight1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setLineHeight1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double maxFontSize;
    private String maxFontSize1;
    private List<Tooltip> setMaxFontSize = new ArrayList<>();

    /**
     * Setter for maximum font size settings for adjust text from.
     */
    public Tooltip setMaxFontSize(Double maxFontSize) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize = maxFontSize;
        } else {
            this.maxFontSize = maxFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".maxFontSize(%f)", maxFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxFontSize(%f)", maxFontSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxFontSize() {
        if (!setMaxFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setMaxFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setMaxFontSize1 = new ArrayList<>();

    /**
     * Setter for maximum font size settings for adjust text from.
     */
    public Tooltip setMaxFontSize(String maxFontSize1) {
        if (jsBase == null) {
            this.maxFontSize = null;
            this.maxFontSize1 = null;
            
            this.maxFontSize1 = maxFontSize1;
        } else {
            this.maxFontSize1 = maxFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".maxFontSize(%s)", wrapQuotes(maxFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".maxFontSize(%s)", wrapQuotes(maxFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMaxFontSize1() {
        if (!setMaxFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setMaxFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double minFontSize;
    private String minFontSize1;
    private List<Tooltip> setMinFontSize = new ArrayList<>();

    /**
     * Setter for minimum font size settings for adjust text from.
     */
    public Tooltip setMinFontSize(Double minFontSize) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize = minFontSize;
        } else {
            this.minFontSize = minFontSize;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".minFontSize(%f)", minFontSize));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minFontSize(%f)", minFontSize));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinFontSize() {
        if (!setMinFontSize.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setMinFontSize) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setMinFontSize1 = new ArrayList<>();

    /**
     * Setter for minimum font size settings for adjust text from.
     */
    public Tooltip setMinFontSize(String minFontSize1) {
        if (jsBase == null) {
            this.minFontSize = null;
            this.minFontSize1 = null;
            
            this.minFontSize1 = minFontSize1;
        } else {
            this.minFontSize1 = minFontSize1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".minFontSize(%s)", wrapQuotes(minFontSize1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".minFontSize(%s)", wrapQuotes(minFontSize1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetMinFontSize1() {
        if (!setMinFontSize1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setMinFontSize1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double offsetX;
    private List<Tooltip> setOffsetX = new ArrayList<>();

    /**
     * Setter for union tooltip offsetX.
     */
    public Tooltip setOffsetX(Double offsetX) {
        if (jsBase == null) {
            this.offsetX = offsetX;
        } else {
            this.offsetX = offsetX;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".offsetX(%f)", offsetX));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetX(%f)", offsetX));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOffsetX() {
        if (!setOffsetX.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setOffsetX) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double offsetY;
    private List<Tooltip> setOffsetY = new ArrayList<>();

    /**
     * Setter for the tooltip offset by Y.
     */
    public Tooltip setOffsetY(Double offsetY) {
        if (jsBase == null) {
            this.offsetY = offsetY;
        } else {
            this.offsetY = offsetY;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".offsetY(%f)", offsetY));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".offsetY(%f)", offsetY));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetOffsetY() {
        if (!setOffsetY.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setOffsetY) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UtilsPadding getPadding;

    /**
     * Getter for the tooltip padding.
     */
    public UtilsPadding getPadding() {
        if (getPadding == null)
            getPadding = new UtilsPadding(jsBase + ".padding()");

        return getPadding;
    }

    private Double[] padding;
    private String[] padding1;
    private String padding2;
    private List<Tooltip> setPadding = new ArrayList<>();

    /**
     * Setter for the tooltip padding in pixels by one value.
     */
    public Tooltip setPadding(Double[] padding) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding = padding;
        } else {
            this.padding = padding;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", Arrays.toString(padding)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding() {
        if (!setPadding.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setPadding) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setPadding1 = new ArrayList<>();

    /**
     * Setter for the tooltip padding in pixels by one value.
     */
    public Tooltip setPadding(String[] padding1) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding1 = padding1;
        } else {
            this.padding1 = padding1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", arrayToStringWrapQuotes(padding1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding1() {
        if (!setPadding1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setPadding1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setPadding2 = new ArrayList<>();

    /**
     * Setter for the tooltip padding in pixels by one value.
     */
    public Tooltip setPadding(String padding2) {
        if (jsBase == null) {
            this.padding = null;
            this.padding1 = null;
            this.padding2 = null;
            
            this.padding2 = padding2;
        } else {
            this.padding2 = padding2;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s)", wrapQuotes(padding2)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding2() {
        if (!setPadding2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setPadding2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String value;
    private Double value1;
    private String value2;
    private Double value3;
    private String value4;
    private Double value5;
    private String value6;
    private Double value7;
    private List<Tooltip> setPadding3 = new ArrayList<>();

    /**
     * Setter for the tooltip padding in pixels.
     */
    public Tooltip setPadding(String value, String value2, String value4, String value6) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value = value;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value2 = value2;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value4 = value4;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value6 = value6;
        } else {
            this.value = value;
            this.value2 = value2;
            this.value4 = value4;
            this.value6 = value6;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%s, %s, %s, %s)", wrapQuotes(value), wrapQuotes(value2), wrapQuotes(value4), wrapQuotes(value6)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding3() {
        if (!setPadding3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setPadding3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setPadding4 = new ArrayList<>();

    /**
     * Setter for the tooltip padding in pixels.
     */
    public Tooltip setPadding(Double value1, Double value3, Double value5, Double value7) {
        if (jsBase == null) {
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value1 = value1;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value3 = value3;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value5 = value5;
            this.value = null;
            this.value1 = null;
            this.value2 = null;
            this.value3 = null;
            this.value4 = null;
            this.value5 = null;
            this.value6 = null;
            this.value7 = null;
            
            this.value7 = value7;
        } else {
            this.value1 = value1;
            this.value3 = value3;
            this.value5 = value5;
            this.value7 = value7;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".padding(%f, %f, %f, %f)", value1, value3, value5, value7));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPadding4() {
        if (!setPadding4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setPadding4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Position position;
    private String position1;
    private List<Tooltip> setPosition = new ArrayList<>();

    /**
     * Setter for the union tooltip position.<br/>
<b>Note:</b> Do not works with position mode <b>FLOAT</b>.
     */
    public Tooltip setPosition(Position position) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position = position;
        } else {
            this.position = position;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", ((position != null) ? position.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition() {
        if (!setPosition.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setPosition) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setPosition1 = new ArrayList<>();

    /**
     * Setter for the union tooltip position.<br/>
<b>Note:</b> Do not works with position mode <b>FLOAT</b>.
     */
    public Tooltip setPosition(String position1) {
        if (jsBase == null) {
            this.position = null;
            this.position1 = null;
            
            this.position1 = position1;
        } else {
            this.position1 = position1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".position(%s)", wrapQuotes(position1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPosition1() {
        if (!setPosition1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setPosition1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TooltipPositionMode positionMode;
    private String positionMode1;
    private List<Tooltip> setPositionMode = new ArrayList<>();

    /**
     * Setter for all tooltips position mode.
     */
    public Tooltip setPositionMode(TooltipPositionMode positionMode) {
        if (jsBase == null) {
            this.positionMode = null;
            this.positionMode1 = null;
            
            this.positionMode = positionMode;
        } else {
            this.positionMode = positionMode;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".positionMode(%s)", ((positionMode != null) ? positionMode.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".positionMode(%s)", ((positionMode != null) ? positionMode.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPositionMode() {
        if (!setPositionMode.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setPositionMode) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setPositionMode1 = new ArrayList<>();

    /**
     * Setter for all tooltips position mode.
     */
    public Tooltip setPositionMode(String positionMode1) {
        if (jsBase == null) {
            this.positionMode = null;
            this.positionMode1 = null;
            
            this.positionMode1 = positionMode1;
        } else {
            this.positionMode1 = positionMode1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".positionMode(%s)", wrapQuotes(positionMode1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".positionMode(%s)", wrapQuotes(positionMode1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetPositionMode1() {
        if (!setPositionMode1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setPositionMode1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean selectable;
    private List<Tooltip> setSelectable = new ArrayList<>();

    /**
     * Setter for the text selectable option.
     */
    public Tooltip setSelectable(Boolean selectable) {
        if (jsBase == null) {
            this.selectable = selectable;
        } else {
            this.selectable = selectable;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".selectable(%b)", selectable));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".selectable(%b)", selectable));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSelectable() {
        if (!setSelectable.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setSelectable) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Separator getSeparator;

    /**
     * Getter for the union tooltip separator.
     */
    public Separator getSeparator() {
        if (getSeparator == null)
            getSeparator = new Separator(jsBase + ".separator()");

        return getSeparator;
    }

    private Boolean separator;
    private String separator1;
    private List<Tooltip> setSeparator = new ArrayList<>();

    /**
     * Setter for the union tooltip separator.
     */
    public Tooltip setSeparator(Boolean separator) {
        if (jsBase == null) {
            this.separator = null;
            this.separator1 = null;
            
            this.separator = separator;
        } else {
            this.separator = separator;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".separator(%b)", separator));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".separator(%b)", separator));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSeparator() {
        if (!setSeparator.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setSeparator) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setSeparator1 = new ArrayList<>();

    /**
     * Setter for the union tooltip separator.
     */
    public Tooltip setSeparator(String separator1) {
        if (jsBase == null) {
            this.separator = null;
            this.separator1 = null;
            
            this.separator1 = separator1;
        } else {
            this.separator1 = separator1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".separator(%s)", wrapQuotes(separator1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".separator(%s)", wrapQuotes(separator1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetSeparator1() {
        if (!setSeparator1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setSeparator1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String textDirection;
    private Direction textDirection1;
    private List<Tooltip> setTextDirection = new ArrayList<>();

    /**
     * Setter for text direction settings.
     */
    public Tooltip setTextDirection(String textDirection) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection = textDirection;
        } else {
            this.textDirection = textDirection;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textDirection(%s)", wrapQuotes(textDirection)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textDirection(%s)", wrapQuotes(textDirection)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextDirection() {
        if (!setTextDirection.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTextDirection) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setTextDirection1 = new ArrayList<>();

    /**
     * Setter for text direction settings.
     */
    public Tooltip setTextDirection(Direction textDirection1) {
        if (jsBase == null) {
            this.textDirection = null;
            this.textDirection1 = null;
            
            this.textDirection1 = textDirection1;
        } else {
            this.textDirection1 = textDirection1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textDirection(%s)", ((textDirection1 != null) ? textDirection1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textDirection(%s)", ((textDirection1 != null) ? textDirection1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextDirection1() {
        if (!setTextDirection1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTextDirection1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double textIndent;
    private List<Tooltip> setTextIndent = new ArrayList<>();

    /**
     * Setter for text-indent settings.
     */
    public Tooltip setTextIndent(Double textIndent) {
        if (jsBase == null) {
            this.textIndent = textIndent;
        } else {
            this.textIndent = textIndent;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textIndent(%f)", textIndent));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textIndent(%f)", textIndent));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextIndent() {
        if (!setTextIndent.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTextIndent) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TextOverflow textOverflow;
    private String textOverflow1;
    private List<Tooltip> setTextOverflow = new ArrayList<>();

    /**
     * Setter for text overflow settings.
     */
    public Tooltip setTextOverflow(TextOverflow textOverflow) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow = textOverflow;
        } else {
            this.textOverflow = textOverflow;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textOverflow(%s)", ((textOverflow != null) ? textOverflow.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textOverflow(%s)", ((textOverflow != null) ? textOverflow.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextOverflow() {
        if (!setTextOverflow.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTextOverflow) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setTextOverflow1 = new ArrayList<>();

    /**
     * Setter for text overflow settings.
     */
    public Tooltip setTextOverflow(String textOverflow1) {
        if (jsBase == null) {
            this.textOverflow = null;
            this.textOverflow1 = null;
            
            this.textOverflow1 = textOverflow1;
        } else {
            this.textOverflow1 = textOverflow1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textOverflow(%s)", wrapQuotes(textOverflow1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textOverflow(%s)", wrapQuotes(textOverflow1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextOverflow1() {
        if (!setTextOverflow1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTextOverflow1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String textSettings;
    private List<Tooltip> setTextSettings = new ArrayList<>();

    /**
     * Setter for the full text appearance settings.
     */
    public Tooltip setTextSettings(String textSettings) {
        if (jsBase == null) {
            this.textSettings = textSettings;
        } else {
            this.textSettings = textSettings;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textSettings(%s)", wrapQuotes(textSettings)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textSettings(%s)", wrapQuotes(textSettings)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextSettings() {
        if (!setTextSettings.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTextSettings) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String name;
    private String textSettings1;
    private Double textSettings2;
    private Boolean textSettings3;
    private List<Tooltip> setTextSettings1 = new ArrayList<>();

    /**
     * Setter for the custom text appearance settings.
     */
    public Tooltip setTextSettings(String textSettings1, String name) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            this.textSettings3 = null;
            
            this.textSettings1 = textSettings1;
            this.name = name;
        } else {
            this.textSettings1 = textSettings1;
            this.name = name;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textSettings(%s, %s)", wrapQuotes(textSettings1), wrapQuotes(name)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textSettings(%s, %s)", wrapQuotes(textSettings1), wrapQuotes(name)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextSettings1() {
        if (!setTextSettings1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTextSettings1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setTextSettings2 = new ArrayList<>();

    /**
     * Setter for the custom text appearance settings.
     */
    public Tooltip setTextSettings(Double textSettings2, String name) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            this.textSettings3 = null;
            
            this.textSettings2 = textSettings2;
            this.name = name;
        } else {
            this.textSettings2 = textSettings2;
            this.name = name;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textSettings(%f, %s)", textSettings2, wrapQuotes(name)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textSettings(%f, %s)", textSettings2, wrapQuotes(name)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextSettings2() {
        if (!setTextSettings2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTextSettings2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setTextSettings3 = new ArrayList<>();

    /**
     * Setter for the custom text appearance settings.
     */
    public Tooltip setTextSettings(Boolean textSettings3, String name) {
        if (jsBase == null) {
            this.textSettings = null;
            this.textSettings1 = null;
            this.textSettings2 = null;
            this.textSettings3 = null;
            
            this.textSettings3 = textSettings3;
            this.name = name;
        } else {
            this.textSettings3 = textSettings3;
            this.name = name;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".textSettings(%b, %s)", textSettings3, wrapQuotes(name)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".textSettings(%b, %s)", textSettings3, wrapQuotes(name)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTextSettings3() {
        if (!setTextSettings3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTextSettings3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private UiTitle getTitle;

    /**
     * Getter for union tooltip title visual settings.
     */
    public UiTitle getTitle() {
        if (getTitle == null)
            getTitle = new UiTitle(jsBase + ".title()");

        return getTitle;
    }

    private Boolean title;
    private String title1;
    private List<Tooltip> setTitle = new ArrayList<>();

    /**
     * Setter for union tooltip title visual settings.
     */
    public Tooltip setTitle(Boolean title) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            
            this.title = title;
        } else {
            this.title = title;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".title(%b)", title));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".title(%b)", title));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTitle() {
        if (!setTitle.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTitle) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setTitle1 = new ArrayList<>();

    /**
     * Setter for union tooltip title visual settings.
     */
    public Tooltip setTitle(String title1) {
        if (jsBase == null) {
            this.title = null;
            this.title1 = null;
            
            this.title1 = title1;
        } else {
            this.title1 = title1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".title(%s)", wrapQuotes(title1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTitle1() {
        if (!setTitle1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTitle1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String titleFormat;
    private List<Tooltip> setTitleFormat = new ArrayList<>();

    /**
     * Setter for the function to format title.<br/>
<b>Note:</b> Use {@link anychart.core.ui.Tooltip#title} method to set title visual settings.
     */
    public Tooltip setTitleFormat(String titleFormat) {
        if (jsBase == null) {
            this.titleFormat = titleFormat;
        } else {
            this.titleFormat = titleFormat;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".titleFormat(%s)", wrapQuotes(titleFormat)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".titleFormat(%s)", wrapQuotes(titleFormat)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetTitleFormat() {
        if (!setTitleFormat.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setTitleFormat) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String unionFormat;
    private List<Tooltip> setUnionFormat = new ArrayList<>();

    /**
     * Setter for the function content text for union tooltip.<br/>
{docs:Common_Settings/Text_Formatters}Learn more about using unionFormat() method.{docs}
     */
    public Tooltip setUnionFormat(String unionFormat) {
        if (jsBase == null) {
            this.unionFormat = unionFormat;
        } else {
            this.unionFormat = unionFormat;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".unionFormat(%s)", wrapQuotes(unionFormat)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".unionFormat(%s)", wrapQuotes(unionFormat)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUnionFormat() {
        if (!setUnionFormat.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setUnionFormat) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean useHtml;
    private List<Tooltip> setUseHtml = new ArrayList<>();

    /**
     * Setter for the useHTML flag.
     */
    public Tooltip setUseHtml(Boolean useHtml) {
        if (jsBase == null) {
            this.useHtml = useHtml;
        } else {
            this.useHtml = useHtml;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".useHtml(%b)", useHtml));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".useHtml(%b)", useHtml));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUseHtml() {
        if (!setUseHtml.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setUseHtml) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String vAlign;
    private TextVAlign vAlign1;
    private List<Tooltip> setVAlign = new ArrayList<>();

    /**
     * Setter for text vertical align settings.
     */
    public Tooltip setVAlign(String vAlign) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign = vAlign;
        } else {
            this.vAlign = vAlign;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".vAlign(%s)", wrapQuotes(vAlign)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", wrapQuotes(vAlign)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetVAlign() {
        if (!setVAlign.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setVAlign) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setVAlign1 = new ArrayList<>();

    /**
     * Setter for text vertical align settings.
     */
    public Tooltip setVAlign(TextVAlign vAlign1) {
        if (jsBase == null) {
            this.vAlign = null;
            this.vAlign1 = null;
            
            this.vAlign1 = vAlign1;
        } else {
            this.vAlign1 = vAlign1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".vAlign(%s)", ((vAlign1 != null) ? vAlign1.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".vAlign(%s)", ((vAlign1 != null) ? vAlign1.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetVAlign1() {
        if (!setVAlign1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setVAlign1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String valuePostfix;
    private List<Tooltip> setValuePostfix = new ArrayList<>();

    /**
     * Setter for tooltip postfix value.
     */
    public Tooltip setValuePostfix(String valuePostfix) {
        if (jsBase == null) {
            this.valuePostfix = valuePostfix;
        } else {
            this.valuePostfix = valuePostfix;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".valuePostfix(%s)", wrapQuotes(valuePostfix)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valuePostfix(%s)", wrapQuotes(valuePostfix)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValuePostfix() {
        if (!setValuePostfix.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setValuePostfix) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String valuePrefix;
    private List<Tooltip> setValuePrefix = new ArrayList<>();

    /**
     * Setter for tooltip prefix value.
     */
    public Tooltip setValuePrefix(String valuePrefix) {
        if (jsBase == null) {
            this.valuePrefix = valuePrefix;
        } else {
            this.valuePrefix = valuePrefix;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".valuePrefix(%s)", wrapQuotes(valuePrefix)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".valuePrefix(%s)", wrapQuotes(valuePrefix)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetValuePrefix() {
        if (!setValuePrefix.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setValuePrefix) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String width;
    private Double width1;
    private List<Tooltip> setWidth = new ArrayList<>();

    /**
     * Setter for the tooltip width.
     */
    public Tooltip setWidth(String width) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width = width;
        } else {
            this.width = width;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".width(%s)", wrapQuotes(width)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%s)", wrapQuotes(width)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWidth() {
        if (!setWidth.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setWidth) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setWidth1 = new ArrayList<>();

    /**
     * Setter for the tooltip width.
     */
    public Tooltip setWidth(Double width1) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
        } else {
            this.width1 = width1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".width(%f)", width1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".width(%f)", width1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWidth1() {
        if (!setWidth1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setWidth1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsWordBreak wordBreak;
    private String wordBreak1;
    private List<Tooltip> setWordBreak = new ArrayList<>();

    /**
     * Setter for the word-break mode.
     */
    public Tooltip setWordBreak(EnumsWordBreak wordBreak) {
        if (jsBase == null) {
            this.wordBreak = null;
            this.wordBreak1 = null;
            
            this.wordBreak = wordBreak;
        } else {
            this.wordBreak = wordBreak;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".wordBreak(%s)", ((wordBreak != null) ? wordBreak.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", ((wordBreak != null) ? wordBreak.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordBreak() {
        if (!setWordBreak.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setWordBreak) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setWordBreak1 = new ArrayList<>();

    /**
     * Setter for the word-break mode.
     */
    public Tooltip setWordBreak(String wordBreak1) {
        if (jsBase == null) {
            this.wordBreak = null;
            this.wordBreak1 = null;
            
            this.wordBreak1 = wordBreak1;
        } else {
            this.wordBreak1 = wordBreak1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".wordBreak(%s)", wrapQuotes(wordBreak1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordBreak(%s)", wrapQuotes(wordBreak1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordBreak1() {
        if (!setWordBreak1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setWordBreak1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private EnumsWordWrap wordWrap;
    private String wordWrap1;
    private List<Tooltip> setWordWrap = new ArrayList<>();

    /**
     * Setter for the word-wrap mode.
     */
    public Tooltip setWordWrap(EnumsWordWrap wordWrap) {
        if (jsBase == null) {
            this.wordWrap = null;
            this.wordWrap1 = null;
            
            this.wordWrap = wordWrap;
        } else {
            this.wordWrap = wordWrap;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".wordWrap(%s)", ((wordWrap != null) ? wordWrap.generateJs() : "null")));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", ((wordWrap != null) ? wordWrap.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordWrap() {
        if (!setWordWrap.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setWordWrap) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tooltip> setWordWrap1 = new ArrayList<>();

    /**
     * Setter for the word-wrap mode.
     */
    public Tooltip setWordWrap(String wordWrap1) {
        if (jsBase == null) {
            this.wordWrap = null;
            this.wordWrap1 = null;
            
            this.wordWrap1 = wordWrap1;
        } else {
            this.wordWrap1 = wordWrap1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".wordWrap(%s)", wrapQuotes(wordWrap1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".wordWrap(%s)", wrapQuotes(wordWrap1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetWordWrap1() {
        if (!setWordWrap1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tooltip item : setWordWrap1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetBackground() {
        if (getBackground != null) {
            return getBackground.generateJs();
        }
        return "";
    }

    private String generateJSgetPadding() {
        if (getPadding != null) {
            return getPadding.generateJs();
        }
        return "";
    }

    private String generateJSgetSeparator() {
        if (getSeparator != null) {
            return getSeparator.generateJs();
        }
        return "";
    }

    private String generateJSgetTitle() {
        if (getTitle != null) {
            return getTitle.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetBackground());
        jsGetters.append(generateJSgetPadding());
        jsGetters.append(generateJSgetSeparator());
        jsGetters.append(generateJSgetTitle());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetAdjustFontSize());
        js.append(generateJSsetAdjustFontSize1());
        js.append(generateJSsetAdjustFontSize2());
        js.append(generateJSsetAllowLeaveChart());
        js.append(generateJSsetAllowLeaveScreen());
        js.append(generateJSsetAllowLeaveStage());
        js.append(generateJSsetAnchor());
        js.append(generateJSsetAnchor1());
        js.append(generateJSsetBackground());
        js.append(generateJSsetBackground1());
        js.append(generateJSsetDisablePointerEvents());
        js.append(generateJSsetDisplayMode());
        js.append(generateJSsetDisplayMode1());
        js.append(generateJSsetFontColor());
        js.append(generateJSsetFontDecoration());
        js.append(generateJSsetFontDecoration1());
        js.append(generateJSsetFontFamily());
        js.append(generateJSsetFontOpacity());
        js.append(generateJSsetFontSize());
        js.append(generateJSsetFontSize1());
        js.append(generateJSsetFontStyle());
        js.append(generateJSsetFontStyle1());
        js.append(generateJSsetFontVariant());
        js.append(generateJSsetFontVariant1());
        js.append(generateJSsetFontWeight());
        js.append(generateJSsetFontWeight1());
        js.append(generateJSsetFormat());
        js.append(generateJSsetHAlign());
        js.append(generateJSsetHAlign1());
        js.append(generateJSsetHeight());
        js.append(generateJSsetHeight1());
        js.append(generateJSsetHideDelay());
        js.append(generateJSsetLetterSpacing());
        js.append(generateJSsetLineHeight());
        js.append(generateJSsetLineHeight1());
        js.append(generateJSsetMaxFontSize());
        js.append(generateJSsetMaxFontSize1());
        js.append(generateJSsetMinFontSize());
        js.append(generateJSsetMinFontSize1());
        js.append(generateJSsetOffsetX());
        js.append(generateJSsetOffsetY());
        js.append(generateJSsetPadding());
        js.append(generateJSsetPadding1());
        js.append(generateJSsetPadding2());
        js.append(generateJSsetPadding3());
        js.append(generateJSsetPadding4());
        js.append(generateJSsetPosition());
        js.append(generateJSsetPosition1());
        js.append(generateJSsetPositionMode());
        js.append(generateJSsetPositionMode1());
        js.append(generateJSsetSelectable());
        js.append(generateJSsetSeparator());
        js.append(generateJSsetSeparator1());
        js.append(generateJSsetTextDirection());
        js.append(generateJSsetTextDirection1());
        js.append(generateJSsetTextIndent());
        js.append(generateJSsetTextOverflow());
        js.append(generateJSsetTextOverflow1());
        js.append(generateJSsetTextSettings());
        js.append(generateJSsetTextSettings1());
        js.append(generateJSsetTextSettings2());
        js.append(generateJSsetTextSettings3());
        js.append(generateJSsetTitle());
        js.append(generateJSsetTitle1());
        js.append(generateJSsetTitleFormat());
        js.append(generateJSsetUnionFormat());
        js.append(generateJSsetUseHtml());
        js.append(generateJSsetVAlign());
        js.append(generateJSsetVAlign1());
        js.append(generateJSsetValuePostfix());
        js.append(generateJSsetValuePrefix());
        js.append(generateJSsetWidth());
        js.append(generateJSsetWidth1());
        js.append(generateJSsetWordBreak());
        js.append(generateJSsetWordBreak1());
        js.append(generateJSsetWordWrap());
        js.append(generateJSsetWordWrap1());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}