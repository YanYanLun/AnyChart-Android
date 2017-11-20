package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Tree data model.
 */
public class Tree extends CoreBase {

    public Tree() {
        js.setLength(0);
        js.append("var tree").append(++variableIndex).append(" = anychart.data.tree();");
        jsBase = "tree" + variableIndex;
    }

    protected Tree(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected Tree(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String child;
    private List<TreeDataItem> setAddChild = new ArrayList<>();

    /**
     * Adds a new root element and return it.
     */
    public TreeDataItem addChild(String child) {
        if (jsBase == null) {
            this.child = child;
        } else {
            this.child = child;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChild(%s)", wrapQuotes(child)));
                js.setLength(0);
            }
        }
        TreeDataItem item = new TreeDataItem("setAddChild" + variableIndex);
        setAddChild.add(item);
        return item;
    }
    private String generateJSsetAddChild() {
        if (!setAddChild.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : setAddChild) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String child1;
    private TreeDataItem child2;
    private TreeviewDataItem child3;
    private Double index;
    private List<TreeDataItem> setAddChildAt = new ArrayList<>();

    /**
     * Inserts a new root element into a specified position by index and return it.
     */
    public TreeDataItem addChildAt(String child1, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            
            this.child1 = child1;
            this.index = index;
        } else {
            this.child1 = child1;
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", wrapQuotes(child1), index));
                js.setLength(0);
            }
        }
        TreeDataItem item = new TreeDataItem("setAddChildAt" + variableIndex);
        setAddChildAt.add(item);
        return item;
    }
    private String generateJSsetAddChildAt() {
        if (!setAddChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : setAddChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeDataItem> setAddChildAt1 = new ArrayList<>();

    /**
     * Inserts a new root element into a specified position by index and return it.
     */
    public TreeDataItem addChildAt(TreeDataItem child2, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            
            this.child2 = child2;
            this.index = index;
        } else {
            this.child2 = child2;
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", ((child2 != null) ? child2.generateJs() : "null"), index));
                js.setLength(0);
            }
        }
        TreeDataItem item = new TreeDataItem("setAddChildAt1" + variableIndex);
        setAddChildAt1.add(item);
        return item;
    }
    private String generateJSsetAddChildAt1() {
        if (!setAddChildAt1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : setAddChildAt1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeDataItem> setAddChildAt2 = new ArrayList<>();

    /**
     * Inserts a new root element into a specified position by index and return it.
     */
    public TreeDataItem addChildAt(TreeviewDataItem child3, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            
            this.child3 = child3;
            this.index = index;
        } else {
            this.child3 = child3;
            this.index = index;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".addChildAt(%s, %f)", ((child3 != null) ? child3.generateJs() : "null"), index));
                js.setLength(0);
            }
        }
        TreeDataItem item = new TreeDataItem("setAddChildAt2" + variableIndex);
        setAddChildAt2.add(item);
        return item;
    }
    private String generateJSsetAddChildAt2() {
        if (!setAddChildAt2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : setAddChildAt2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String data;
    private String data1;
    private TreeFillingMethod fillingMethod;
    private String fillingMethod1;
    private String csvSettingsOrDeps;
    private Dependency[] csvSettingsOrDeps1;
    private List<Tree> setAddData = new ArrayList<>();

    /**
     * Adds a data.
     */
    public Tree addData(String data, TreeFillingMethod fillingMethod, String csvSettingsOrDeps) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillingMethod = null;
            this.fillingMethod1 = null;
            
            this.fillingMethod = fillingMethod;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps = csvSettingsOrDeps;
        } else {
            this.data = data;
            this.fillingMethod = fillingMethod;
            this.csvSettingsOrDeps = csvSettingsOrDeps;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillingMethod != null) ? fillingMethod.generateJs() : "null"), wrapQuotes(csvSettingsOrDeps)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillingMethod != null) ? fillingMethod.generateJs() : "null"), wrapQuotes(csvSettingsOrDeps)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddData() {
        if (!setAddData.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tree item : setAddData) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tree> setAddData1 = new ArrayList<>();

    /**
     * Adds a data.
     */
    public Tree addData(String data, TreeFillingMethod fillingMethod, Dependency[] csvSettingsOrDeps1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillingMethod = null;
            this.fillingMethod1 = null;
            
            this.fillingMethod = fillingMethod;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
        } else {
            this.data = data;
            this.fillingMethod = fillingMethod;
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillingMethod != null) ? fillingMethod.generateJs() : "null"), arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), ((fillingMethod != null) ? fillingMethod.generateJs() : "null"), arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddData1() {
        if (!setAddData1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tree item : setAddData1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tree> setAddData2 = new ArrayList<>();

    /**
     * Adds a data.
     */
    public Tree addData(String data, String fillingMethod1, String csvSettingsOrDeps) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillingMethod = null;
            this.fillingMethod1 = null;
            
            this.fillingMethod1 = fillingMethod1;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps = csvSettingsOrDeps;
        } else {
            this.data = data;
            this.fillingMethod1 = fillingMethod1;
            this.csvSettingsOrDeps = csvSettingsOrDeps;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillingMethod1), wrapQuotes(csvSettingsOrDeps)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillingMethod1), wrapQuotes(csvSettingsOrDeps)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddData2() {
        if (!setAddData2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tree item : setAddData2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<Tree> setAddData3 = new ArrayList<>();

    /**
     * Adds a data.
     */
    public Tree addData(String data, String fillingMethod1, Dependency[] csvSettingsOrDeps1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            
            this.data = data;
            this.fillingMethod = null;
            this.fillingMethod1 = null;
            
            this.fillingMethod1 = fillingMethod1;
            this.csvSettingsOrDeps = null;
            this.csvSettingsOrDeps1 = null;
            
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
        } else {
            this.data = data;
            this.fillingMethod1 = fillingMethod1;
            this.csvSettingsOrDeps1 = csvSettingsOrDeps1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillingMethod1), arrayToString(csvSettingsOrDeps1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addData(%s, %s, %s)", wrapQuotes(data), wrapQuotes(fillingMethod1), arrayToString(csvSettingsOrDeps1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddData3() {
        if (!setAddData3.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tree item : setAddData3) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String field;
    private Boolean asString;
    private List<Tree> setCreateIndexOn = new ArrayList<>();

    /**
     * Creates an index on a specified field.</br>
It can't be indexed by 'parent' or 'children' fields because these fields are not available by treeItem.get(field);.
     */
    public Tree createIndexOn(String field, Boolean asString) {
        if (jsBase == null) {
            this.field = field;
            this.asString = asString;
        } else {
            this.field = field;
            this.asString = asString;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".createIndexOn(%s, %b)", wrapQuotes(field), asString));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".createIndexOn(%s, %b)", wrapQuotes(field), asString));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetCreateIndexOn() {
        if (!setCreateIndexOn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tree item : setCreateIndexOn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Boolean dispatchEvents;
    private List<Tree> setDispatchEvents = new ArrayList<>();

    /**
     * Starts or stops tree CRUD events dispatching.
     */
    public Tree dispatchEvents(Boolean dispatchEvents) {
        if (jsBase == null) {
            this.dispatchEvents = dispatchEvents;
        } else {
            this.dispatchEvents = dispatchEvents;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".dispatchEvents(%b)", dispatchEvents));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".dispatchEvents(%b)", dispatchEvents));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetDispatchEvents() {
        if (!setDispatchEvents.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tree item : setDispatchEvents) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeDataItem> getGetChildAt = new ArrayList<>();

    /**
     * Gets the child by index.
     */
    public TreeDataItem getGetChildAt(Double index) {
        TreeDataItem item = new TreeDataItem(jsBase + ".getChildAt(" + index + ")");
        getGetChildAt.add(item);
        return item;
    }

    private String mapping;
    private List<TreeView> setMapAs = new ArrayList<>();

    /**
     * Returns a new mapping for the tree.
     */
    public TreeView mapAs(String mapping) {
        if (jsBase == null) {
            this.mapping = mapping;
        } else {
            this.mapping = mapping;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".mapAs(%s)", wrapQuotes(mapping)));
                js.setLength(0);
            }
        }
        TreeView item = new TreeView("setMapAs" + variableIndex);
        setMapAs.add(item);
        return item;
    }
    private String generateJSsetMapAs() {
        if (!setMapAs.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeView item : setMapAs) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private TreeDataItem child4;
    private List<TreeDataItem> setRemoveChild = new ArrayList<>();

    /**
     * Removes tree's root data item.
     */
    public TreeDataItem removeChild(TreeDataItem child4) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            
            this.child4 = child4;
        } else {
            this.child4 = child4;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child4.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeChild(%s);",  ((child4 != null) ? child4.getJsBase() : "null")));
        }
        TreeDataItem item = new TreeDataItem("setRemoveChild" + variableIndex);
        setRemoveChild.add(item);
        return item;
    }
    private String generateJSsetRemoveChild() {
        if (!setRemoveChild.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : setRemoveChild) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<TreeDataItem> setRemoveChildAt = new ArrayList<>();

    /**
     * Removes child at specified position.
     */
    public TreeDataItem removeChildAt(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeChildAt(%f)", index1));
                js.setLength(0);
            }
        }
        TreeDataItem item = new TreeDataItem("setRemoveChildAt" + variableIndex);
        setRemoveChildAt.add(item);
        return item;
    }
    private String generateJSsetRemoveChildAt() {
        if (!setRemoveChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : setRemoveChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String field1;
    private List<Tree> setRemoveIndexOn = new ArrayList<>();

    /**
     * Removes index on a specified field.
     */
    public Tree removeIndexOn(String field1) {
        if (jsBase == null) {
            this.field = null;
            this.field1 = null;
            
            this.field1 = field1;
        } else {
            this.field1 = field1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".removeIndexOn(%s)", wrapQuotes(field1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeIndexOn(%s)", wrapQuotes(field1)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRemoveIndexOn() {
        if (!setRemoveIndexOn.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (Tree item : setRemoveIndexOn) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String soughtField;
    private String search;
    private Double search1;
    private Boolean search2;
    private List<TreeDataItem> setSearch = new ArrayList<>();

    /**
     * Performs a data search.
     */
    public TreeDataItem search(String search, String soughtField) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search = search;
            this.soughtField = soughtField;
        } else {
            this.search = search;
            this.soughtField = soughtField;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%s, %s)", wrapQuotes(search), wrapQuotes(soughtField)));
                js.setLength(0);
            }
        }
        TreeDataItem item = new TreeDataItem("setSearch" + variableIndex);
        setSearch.add(item);
        return item;
    }
    private String generateJSsetSearch() {
        if (!setSearch.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : setSearch) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeDataItem> setSearch1 = new ArrayList<>();

    /**
     * Performs a data search.
     */
    public TreeDataItem search(Double search1, String soughtField) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search1 = search1;
            this.soughtField = soughtField;
        } else {
            this.search1 = search1;
            this.soughtField = soughtField;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%f, %s)", search1, wrapQuotes(soughtField)));
                js.setLength(0);
            }
        }
        TreeDataItem item = new TreeDataItem("setSearch1" + variableIndex);
        setSearch1.add(item);
        return item;
    }
    private String generateJSsetSearch1() {
        if (!setSearch1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : setSearch1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeDataItem> setSearch2 = new ArrayList<>();

    /**
     * Performs a data search.
     */
    public TreeDataItem search(Boolean search2, String soughtField) {
        if (jsBase == null) {
            this.search = null;
            this.search1 = null;
            this.search2 = null;
            
            this.search2 = search2;
            this.soughtField = soughtField;
        } else {
            this.search2 = search2;
            this.soughtField = soughtField;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".search(%b, %s)", search2, wrapQuotes(soughtField)));
                js.setLength(0);
            }
        }
        TreeDataItem item = new TreeDataItem("setSearch2" + variableIndex);
        setSearch2.add(item);
        return item;
    }
    private String generateJSsetSearch2() {
        if (!setSearch2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : setSearch2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String soughtField1;
    private String searchItems;
    private Double searchItems1;
    private Boolean searchItems2;

    /**
     * Performs a data search. Actually does the same as ({@link anychart.data.Tree#search}) but result is always an array.
     */
    public void searchItems(String searchItems, String soughtField1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems = searchItems;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
        } else {
            this.searchItems = searchItems;
            this.soughtField1 = soughtField1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%s, %s)", wrapQuotes(searchItems), wrapQuotes(soughtField1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Performs a data search. Actually does the same as ({@link anychart.data.Tree#search}) but result is always an array.
     */
    public void searchItems(Double searchItems1, String soughtField1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems1 = searchItems1;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
        } else {
            this.searchItems1 = searchItems1;
            this.soughtField1 = soughtField1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%f, %s)", searchItems1, wrapQuotes(soughtField1)));
                js.setLength(0);
            }
        }
    }


    /**
     * Performs a data search. Actually does the same as ({@link anychart.data.Tree#search}) but result is always an array.
     */
    public void searchItems(Boolean searchItems2, String soughtField1) {
        if (jsBase == null) {
            this.searchItems = null;
            this.searchItems1 = null;
            this.searchItems2 = null;
            
            this.searchItems2 = searchItems2;
            this.soughtField = null;
            this.soughtField1 = null;
            
            this.soughtField1 = soughtField1;
        } else {
            this.searchItems2 = searchItems2;
            this.soughtField1 = soughtField1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".searchItems(%b, %s)", searchItems2, wrapQuotes(soughtField1)));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetGetChildAt() {
        if (!getGetChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeDataItem item : getGetChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }



    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetChildAt());

        return jsGetters.toString();
    }

    @Override
    protected String generateJs() {
        if (isChain) {
            js.append(";");
            isChain = false;
        }

        js.append(generateJsGetters());

        js.append(generateJSsetAddChild());
        js.append(generateJSsetAddChildAt());
        js.append(generateJSsetAddChildAt1());
        js.append(generateJSsetAddChildAt2());
        js.append(generateJSsetAddData());
        js.append(generateJSsetAddData1());
        js.append(generateJSsetAddData2());
        js.append(generateJSsetAddData3());
        js.append(generateJSsetCreateIndexOn());
        js.append(generateJSsetDispatchEvents());
        js.append(generateJSsetMapAs());
        js.append(generateJSsetRemoveChild());
        js.append(generateJSsetRemoveChildAt());
        js.append(generateJSsetRemoveIndexOn());
        js.append(generateJSsetSearch());
        js.append(generateJSsetSearch1());
        js.append(generateJSsetSearch2());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}