package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Scroller standalone class.
 */
public class StandalonesScroller extends UiScroller {

    public StandalonesScroller() {
        js.setLength(0);
        js.append("var standalonesScroller").append(++variableIndex).append(" = anychart.standalones.scroller();");
        jsBase = "standalonesScroller" + variableIndex;
    }

    protected StandalonesScroller(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StandalonesScroller(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private Element getContainer;

    /**
     * Getter for the scroller current container.
     */
    public Element getContainer() {
        if (getContainer == null)
            getContainer = new Element(jsBase + ".container()");

        return getContainer;
    }

    private String container;
    private Element container1;

    /**
     * Setter for the scroller container.
     */
    public StandalonesScroller setContainer(String container) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            
            this.container = container;
        } else {
            this.container = container;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".container(%s)", wrapQuotes(container)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", wrapQuotes(container)));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for the scroller container.
     */
    public StandalonesScroller setContainer(Element container1) {
        if (jsBase == null) {
            this.container = null;
            this.container1 = null;
            
            this.container1 = container1;
        } else {
            this.container1 = container1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(container1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".container(%s);",  ((container1 != null) ? container1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".container(%s)", ((container1 != null) ? container1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double endRatio;

    /**
     * Setter for the ending ratio.
<b>Note</b>: It is always greater than the startRatio.
     */
    public StandalonesScroller setEndRatio(Double endRatio) {
        if (jsBase == null) {
            this.endRatio = endRatio;
        } else {
            this.endRatio = endRatio;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".endRatio(%f)", endRatio));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".endRatio(%f)", endRatio));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnychartMathRect getParentBounds;

    /**
     * Getter for bounds. As a getter falls back to stage bounds.
     */
    public AnychartMathRect getParentBounds() {
        if (getParentBounds == null)
            getParentBounds = new AnychartMathRect(jsBase + ".parentBounds()");

        return getParentBounds;
    }

    private AnychartMathRect parentBounds;
    private String parentBounds1;

    /**
     * Setter for bounds using single value.
     */
    public StandalonesScroller setParentBounds(AnychartMathRect parentBounds) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds = parentBounds;
        } else {
            this.parentBounds = parentBounds;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(parentBounds.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".parentBounds(%s);",  ((parentBounds != null) ? parentBounds.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%s)", ((parentBounds != null) ? parentBounds.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }


    /**
     * Setter for bounds using single value.
     */
    public StandalonesScroller setParentBounds(String parentBounds1) {
        if (jsBase == null) {
            this.parentBounds = null;
            this.parentBounds1 = null;
            
            this.parentBounds1 = parentBounds1;
        } else {
            this.parentBounds1 = parentBounds1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".parentBounds(%s)", wrapQuotes(parentBounds1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%s)", wrapQuotes(parentBounds1)));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double left;
    private Double top;
    private Double width;
    private Double height;

    /**
     * Setter for bounds using several value.
     */
    public StandalonesScroller setParentBounds(Double left, Double top, Double width, Double height) {
        if (jsBase == null) {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
        } else {
            this.left = left;
            this.top = top;
            this.width = width;
            this.height = height;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".parentBounds(%f, %f, %f, %f)", left, top, width, height));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".parentBounds(%f, %f, %f, %f)", left, top, width, height));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double startRatio;
    private Double endRatio1;

    /**
     * Changes current selected range to the passed one.
     */
    public StandalonesScroller setRange(Double startRatio, Double endRatio1) {
        if (jsBase == null) {
            this.startRatio = startRatio;
            this.endRatio = null;
            this.endRatio1 = null;
            
            this.endRatio1 = endRatio1;
        } else {
            this.startRatio = startRatio;
            this.endRatio1 = endRatio1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".setRange(%f, %f)", startRatio, endRatio1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".setRange(%f, %f)", startRatio, endRatio1));
                js.setLength(0);
            }
        }
        return this;
    }

    private Double startRatio1;

    /**
     * Setter for the starting ratio.
<b>Note</b>: It is always less than the endRatio.
     */
    public StandalonesScroller setStartRatio(Double startRatio1) {
        if (jsBase == null) {
            this.startRatio = null;
            this.startRatio1 = null;
            
            this.startRatio1 = startRatio1;
        } else {
            this.startRatio1 = startRatio1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }

            js.append(String.format(Locale.US, ".startRatio(%f)", startRatio1));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".startRatio(%f)", startRatio1));
                js.setLength(0);
            }
        }
        return this;
    }

    private String generateJSgetContainer() {
        if (getContainer != null) {
            return getContainer.generateJs();
        }
        return "";
    }

    private String generateJSgetParentBounds() {
        if (getParentBounds != null) {
            return getParentBounds.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetContainer());
        jsGetters.append(generateJSgetParentBounds());

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