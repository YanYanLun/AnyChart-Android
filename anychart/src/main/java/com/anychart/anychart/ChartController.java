package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * Chart controller class.
 */
public class ChartController extends CoreBase {

    public ChartController() {
        js.setLength(0);
        js.append("var chartController").append(++variableIndex).append(" = anychart.core.annotations.chartController();");
        jsBase = "chartController" + variableIndex;
    }

    protected ChartController(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected ChartController(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private AnnotationsBase annotation;

    /**
     * Removes one of annotations from plot by its instance.
     */
    public ChartController removeAnnotation(AnnotationsBase annotation) {
        if (jsBase == null) {
            this.annotation = annotation;
        } else {
            this.annotation = annotation;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(annotation.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeAnnotation(%s);",  ((annotation != null) ? annotation.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeAnnotation(%s)", ((annotation != null) ? annotation.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnnotationsBase annotation1;

    /**
     * Selects annotation.
     */
    public ChartController select(AnnotationsBase annotation1) {
        if (jsBase == null) {
            this.annotation = null;
            this.annotation1 = null;
            
            this.annotation1 = annotation1;
        } else {
            this.annotation1 = annotation1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(annotation1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".select(%s);",  ((annotation1 != null) ? annotation1.getJsBase() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".select(%s)", ((annotation1 != null) ? annotation1.getJsBase() : "null")));
                js.setLength(0);
            }
        }
        return this;
    }

    private AnnotationTypes annotationTypeOrConfig;
    private String annotationTypeOrConfig1;
    private AnnotationJSONFormat annotationTypeOrConfig2;

    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Stock#draw} is called.
     */
    public AnnotationsBase startDrawing(AnnotationTypes annotationTypeOrConfig) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            
            this.annotationTypeOrConfig = annotationTypeOrConfig;
        } else {
            this.annotationTypeOrConfig = annotationTypeOrConfig;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".startDrawing(%s);", ((annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s)", ((annotationTypeOrConfig != null) ? annotationTypeOrConfig.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }


    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Stock#draw} is called.
     */
    public AnnotationsBase startDrawing(String annotationTypeOrConfig1) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            
            this.annotationTypeOrConfig1 = annotationTypeOrConfig1;
        } else {
            this.annotationTypeOrConfig1 = annotationTypeOrConfig1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".startDrawing(%s);", wrapQuotes(annotationTypeOrConfig1)));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s)", wrapQuotes(annotationTypeOrConfig1)));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
    }


    /**
     * Starts annotation drawing.<br/>
<b>Note:</b> Works only after {@link anychart.charts.Stock#draw} is called.
     */
    public AnnotationsBase startDrawing(AnnotationJSONFormat annotationTypeOrConfig2) {
        if (jsBase == null) {
            this.annotationTypeOrConfig = null;
            this.annotationTypeOrConfig1 = null;
            this.annotationTypeOrConfig2 = null;
            
            this.annotationTypeOrConfig2 = annotationTypeOrConfig2;
        } else {
            this.annotationTypeOrConfig2 = annotationTypeOrConfig2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(String.format(Locale.US, jsBase + ".startDrawing(%s);", ((annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null")));
            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".startDrawing(%s)", ((annotationTypeOrConfig2 != null) ? annotationTypeOrConfig2.generateJs() : "null")));
                js.setLength(0);
            }
        }
        return new AnnotationsBase(jsBase);
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