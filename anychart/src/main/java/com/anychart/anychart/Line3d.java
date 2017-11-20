package com.anychart.anychart;

// class
/**
 * 3D Line Series Class.<br/>
<b>Note:</b> Use {@link anychart.charts.Cartesian3d#Line3d} method to get this series.<br/>
{docs:Basic_Charts/3D/Line_Chart}Learn more about 3D Line series{docs}
 */
public class Line3d extends CartesianSeriesContinuousBase {

    public Line3d() {
        js.setLength(0);
        js.append("var line3d").append(++variableIndex).append(" = anychart.core.cartesian.series.line3d();");
        jsBase = "line3d" + variableIndex;
    }

    protected Line3d(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Line3d(StringBuilder js, String jsBase, boolean isChain) {
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