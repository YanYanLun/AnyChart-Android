package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// chart class
/**
 * Pert chart class.<br/>
<b>Note:</b> Use {@link anychart#pert} method to get an instance of this class.
 */
public class Pert extends SeparateChart {

    protected Pert(String name) {
        super(name);

        js.setLength(0);
        js.append(String.format(Locale.US, "chart = %s();", name));
        jsBase = "chart";
    }

    public Pert setData(SingleValueDataSet data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            js.append(data.generateJs());

            js.append("]);");
        }

        return this;
    }

    public Pert setData(List<DataEntry> data) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("]);");
        }

        return this;
    }

    public Pert setData(List<DataEntry> data, TreeFillingMethod mode) {
        if (!data.isEmpty()) {
            if (isChain) {
                js.append(";");
                isChain = false;
            }

            js.append(jsBase).append(".data([");

            for (DataEntry dataEntry : data) {
                js.append(dataEntry.generateJs()).append(",");
            }
            js.setLength(js.length() - 1);

            js.append("], ").append((mode != null) ? mode.generateJs() : "null").append(");");
        }

        return this;
    }

    

    private CriticalPath getCriticalPath;

    /**
     * Getter for the critical path settings.
     */
    public CriticalPath getCriticalPath() {
        if (getCriticalPath == null)
            getCriticalPath = new CriticalPath(jsBase + ".criticalPath()");

        return getCriticalPath;
    }
    private String criticalPath;
    private List<Pert> setCriticalPath = new ArrayList<>();

    /**
     * Setter for the critical path settings.
     */
    public Pert setCriticalPath(String criticalPath) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".criticalPath(%s)", wrapQuotes(criticalPath)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".criticalPath(%s)", wrapQuotes(criticalPath)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetCriticalPath() {
        if (!setCriticalPath.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setCriticalPath) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Tree getData;

    /**
     * Getter for the chart data.
     */
    public Tree getData() {
        if (getData == null)
            getData = new Tree(jsBase + ".data()");

        return getData;
    }
    private Tree data;
    private TreeView data1;
    private String data2;
    private TreeFillingMethod fillMethod;
    private String fillMethod1;
    private Dependency[] deps;
    private List<Pert> setData = new ArrayList<>();

    /**
     * Setter for the chart data.
     */
    public Pert setData(Tree data, TreeFillingMethod fillMethod, Dependency[] deps) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s, %s)", ((data != null) ? data.generateJs() : "null"), ((fillMethod != null) ? fillMethod.generateJs() : "null"), arrayToString(deps)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", ((data != null) ? data.generateJs() : "null"), ((fillMethod != null) ? fillMethod.generateJs() : "null"), arrayToString(deps)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData() {
        if (!setData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pert> setData1 = new ArrayList<>();

    /**
     * Setter for the chart data.
     */
    public Pert setData(Tree data, String fillMethod1, Dependency[] deps) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s, %s)", ((data != null) ? data.generateJs() : "null"), wrapQuotes(fillMethod1), arrayToString(deps)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", ((data != null) ? data.generateJs() : "null"), wrapQuotes(fillMethod1), arrayToString(deps)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData1() {
        if (!setData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pert> setData2 = new ArrayList<>();

    /**
     * Setter for the chart data.
     */
    public Pert setData(TreeView data1, TreeFillingMethod fillMethod, Dependency[] deps) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s, %s)", ((data1 != null) ? data1.generateJs() : "null"), ((fillMethod != null) ? fillMethod.generateJs() : "null"), arrayToString(deps)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", ((data1 != null) ? data1.generateJs() : "null"), ((fillMethod != null) ? fillMethod.generateJs() : "null"), arrayToString(deps)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData2() {
        if (!setData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pert> setData3 = new ArrayList<>();

    /**
     * Setter for the chart data.
     */
    public Pert setData(TreeView data1, String fillMethod1, Dependency[] deps) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s, %s)", ((data1 != null) ? data1.generateJs() : "null"), wrapQuotes(fillMethod1), arrayToString(deps)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", ((data1 != null) ? data1.generateJs() : "null"), wrapQuotes(fillMethod1), arrayToString(deps)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData3() {
        if (!setData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pert> setData4 = new ArrayList<>();

    /**
     * Setter for the chart data.
     */
    public Pert setData(String data2, TreeFillingMethod fillMethod, Dependency[] deps) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s, %s)", wrapQuotes(data2), ((fillMethod != null) ? fillMethod.generateJs() : "null"), arrayToString(deps)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", wrapQuotes(data2), ((fillMethod != null) ? fillMethod.generateJs() : "null"), arrayToString(deps)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData4() {
        if (!setData4.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setData4) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pert> setData5 = new ArrayList<>();

    /**
     * Setter for the chart data.
     */
    public Pert setData(String data2, String fillMethod1, Dependency[] deps) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".data(%s, %s, %s)", wrapQuotes(data2), wrapQuotes(fillMethod1), arrayToString(deps)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".data(%s, %s, %s)", wrapQuotes(data2), wrapQuotes(fillMethod1), arrayToString(deps)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetData5() {
        if (!setData5.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setData5) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double horizontalSpacing;
    private String horizontalSpacing1;
    private List<Pert> setHorizontalSpacing = new ArrayList<>();

    /**
     * Setter for milestones horizontal spacing.
     */
    public Pert setHorizontalSpacing(Double horizontalSpacing) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".horizontalSpacing(%f)", horizontalSpacing));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".horizontalSpacing(%f)", horizontalSpacing));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHorizontalSpacing() {
        if (!setHorizontalSpacing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setHorizontalSpacing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pert> setHorizontalSpacing1 = new ArrayList<>();

    /**
     * Setter for milestones horizontal spacing.
     */
    public Pert setHorizontalSpacing(String horizontalSpacing1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".horizontalSpacing(%s)", wrapQuotes(horizontalSpacing1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".horizontalSpacing(%s)", wrapQuotes(horizontalSpacing1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetHorizontalSpacing1() {
        if (!setHorizontalSpacing1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setHorizontalSpacing1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Milestones getMilestones;

    /**
     * Getter for milestones settings.
     */
    public Milestones getMilestones() {
        if (getMilestones == null)
            getMilestones = new Milestones(jsBase + ".milestones()");

        return getMilestones;
    }
    private String milestones;
    private List<Pert> setMilestones = new ArrayList<>();

    /**
     * Setter for milestones settings object.
     */
    public Pert setMilestones(String milestones) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".milestones(%s)", wrapQuotes(milestones)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".milestones(%s)", wrapQuotes(milestones)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetMilestones() {
        if (!setMilestones.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setMilestones) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private Tasks getTasks;

    /**
     * Getter for the tasks settings.
     */
    public Tasks getTasks() {
        if (getTasks == null)
            getTasks = new Tasks(jsBase + ".tasks()");

        return getTasks;
    }
    private String tasks;
    private List<Pert> setTasks = new ArrayList<>();

    /**
     * Setter for the tasks settings.
     */
    public Pert setTasks(String tasks) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".tasks(%s)", wrapQuotes(tasks)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".tasks(%s)", wrapQuotes(tasks)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetTasks() {
        if (!setTasks.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setTasks) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double verticalSpacing;
    private String verticalSpacing1;
    private List<Pert> setVerticalSpacing = new ArrayList<>();

    /**
     * Setter for milestones vertical spacing.
     */
    public Pert setVerticalSpacing(Double verticalSpacing) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".verticalSpacing(%f)", verticalSpacing));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".verticalSpacing(%f)", verticalSpacing));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetVerticalSpacing() {
        if (!setVerticalSpacing.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setVerticalSpacing) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Pert> setVerticalSpacing1 = new ArrayList<>();

    /**
     * Setter for milestones vertical spacing.
     */
    public Pert setVerticalSpacing(String verticalSpacing1) {
        if (!isChain) {
            js.append(jsBase);
            isChain = true;
        }
        js.append(String.format(Locale.US, ".verticalSpacing(%s)", wrapQuotes(verticalSpacing1)));

        if (isRendered) {
            onChangeListener.onChange(String.format(Locale.US, ".verticalSpacing(%s)", wrapQuotes(verticalSpacing1)));
            js.setLength(0);
        }
        return this;
    }
    private String generateJSsetVerticalSpacing1() {
        if (!setVerticalSpacing1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Pert item : setVerticalSpacing1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetCriticalPath() {
        if (getCriticalPath != null) {
            return getCriticalPath.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetMilestones() {
        if (getMilestones != null) {
            return getMilestones.generateJs();
        }
        return "";
    }

    private String generateJSgetTasks() {
        if (getTasks != null) {
            return getTasks.generateJs();
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }
        js.append(generateJSgetCriticalPath());
        js.append(generateJSgetData());
        js.append(generateJSgetMilestones());
        js.append(generateJSgetTasks());
        js.append(generateJSsetCriticalPath());
        js.append(generateJSsetData());
        js.append(generateJSsetData1());
        js.append(generateJSsetData2());
        js.append(generateJSsetData3());
        js.append(generateJSsetData4());
        js.append(generateJSsetData5());
        js.append(generateJSsetHorizontalSpacing());
        js.append(generateJSsetHorizontalSpacing1());
        js.append(generateJSsetMilestones());
        js.append(generateJSsetTasks());
        js.append(generateJSsetVerticalSpacing());
        js.append(generateJSsetVerticalSpacing1());

        js.append(super.generateJsGetters());
        js.append(super.generateJs());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}