package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Define class Credits.<br/>
<b>Note:</b> Use {@link anychart.ui#credits} method to create instance of this class.<br/>
<b>Note:</b> You can't customize credits without <u>a license key</u>. See <a href="https://www.anychart.com/buy/">AnyChart Licensing</a> to learn more.
 */
public class StageCredits extends JsObject {

    public StageCredits() {
        js.setLength(0);
        js.append("var stageCredits").append(++variableIndex).append(" = anychart.core.ui.stageCredits();");
        jsBase = "stageCredits" + variableIndex;
    }

    protected StageCredits(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected StageCredits(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String alt;
    private List<StageCredits> setAlt = new ArrayList<>();

    /**
     * Setter for credits alternative text.
     */
    public StageCredits setAlt(String alt) {
        if (jsBase == null) {
            this.alt = alt;
        } else {
            this.alt = alt;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".alt(%s)", wrapQuotes(alt)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".alt(%s)", wrapQuotes(alt)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAlt() {
        if (!setAlt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StageCredits item : setAlt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean enabled;
    private List<StageCredits> setEnabled = new ArrayList<>();

    /**
     * Setter for the stage credits state.
     */
    public StageCredits setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".enabled(%b)", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".enabled(%b)", enabled));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetEnabled() {
        if (!setEnabled.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StageCredits item : setEnabled) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String imgAlt;
    private List<StageCredits> setImgAlt = new ArrayList<>();

    /**
     * Setter for the image alternative text.
     */
    public StageCredits setImgAlt(String imgAlt) {
        if (jsBase == null) {
            this.imgAlt = imgAlt;
        } else {
            this.imgAlt = imgAlt;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".imgAlt(%s)", wrapQuotes(imgAlt)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".imgAlt(%s)", wrapQuotes(imgAlt)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetImgAlt() {
        if (!setImgAlt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StageCredits item : setImgAlt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String logoSrc;
    private List<StageCredits> setLogoSrc = new ArrayList<>();

    /**
     * Setter for credits logo source.<br/>
<b>Note:</b> <b>Note:</b> You can't customize credits without <u>a license key</u>. See <a href="https://www.anychart.com/buy/">AnyChart Licensing</a> to learn more.
     */
    public StageCredits setLogoSrc(String logoSrc) {
        if (jsBase == null) {
            this.logoSrc = logoSrc;
        } else {
            this.logoSrc = logoSrc;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".logoSrc(%s)", wrapQuotes(logoSrc)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".logoSrc(%s)", wrapQuotes(logoSrc)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetLogoSrc() {
        if (!setLogoSrc.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StageCredits item : setLogoSrc) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String text;
    private List<StageCredits> setText = new ArrayList<>();

    /**
     * Setter for credits text value.
     */
    public StageCredits setText(String text) {
        if (jsBase == null) {
            this.text = text;
        } else {
            this.text = text;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".text(%s)", wrapQuotes(text)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".text(%s)", wrapQuotes(text)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetText() {
        if (!setText.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StageCredits item : setText) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String url;
    private List<StageCredits> setUrl = new ArrayList<>();

    /**
     * Setter for credits url.
     */
    public StageCredits setUrl(String url) {
        if (jsBase == null) {
            this.url = url;
        } else {
            this.url = url;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".url(%s)", wrapQuotes(url)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".url(%s)", wrapQuotes(url)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetUrl() {
        if (!setUrl.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (StageCredits item : setUrl) {
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

        js.append(generateJSsetAlt());
        js.append(generateJSsetEnabled());
        js.append(generateJSsetImgAlt());
        js.append(generateJSsetLogoSrc());
        js.append(generateJSsetText());
        js.append(generateJSsetUrl());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}