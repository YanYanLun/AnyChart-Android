package com.anychart.anychart;

// class
/**
 * Fibonacci Arc annotation.
 */
public class FibonacciArc extends FibonacciBase {

    public FibonacciArc() {
        js.setLength(0);
        js.append("var fibonacciArc").append(++variableIndex).append(" = anychart.core.annotations.fibonacciArc();");
        jsBase = "fibonacciArc" + variableIndex;
    }

    protected FibonacciArc(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected FibonacciArc(StringBuilder js, String jsBase, boolean isChain) {
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