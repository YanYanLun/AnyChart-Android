package com.anychart.anychart;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

// class
/**
 * Mapped data item class.
 */
public class TreeviewDataItem extends JsObject {

    public TreeviewDataItem() {
        js.setLength(0);
        js.append("var treeviewDataItem").append(++variableIndex).append(" = anychart.data.TreeView.dataItem();");
        jsBase = "treeviewDataItem" + variableIndex;
    }

    protected TreeviewDataItem(String jsBase) {
        js.setLength(0);
        this.jsBase = jsBase;
    }

    protected TreeviewDataItem(StringBuilder js, String jsBase, boolean isChain) {
        this.js = js;
        this.jsBase = jsBase;
        this.isChain = isChain;
    }

    protected String getJsBase() {
        return jsBase;
    }

    
    private String child;
    private TreeDataItem child1;
    private TreeviewDataItem child2;
    private List<TreeviewDataItem> setAddChild = new ArrayList<>();

    /**
     * Adds a child.
     */
    public TreeviewDataItem addChild(String child) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child = child;
        } else {
            this.child = child;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".addChild(%s)", wrapQuotes(child)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChild(%s)", wrapQuotes(child)));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddChild() {
        if (!setAddChild.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChild) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setAddChild1 = new ArrayList<>();

    /**
     * Adds a child.
     */
    public TreeviewDataItem addChild(TreeDataItem child1) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child1 = child1;
        } else {
            this.child1 = child1;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child1.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".addChild(%s);",  ((child1 != null) ? child1.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetAddChild1() {
        if (!setAddChild1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChild1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setAddChild2 = new ArrayList<>();

    /**
     * Adds a child.
     */
    public TreeviewDataItem addChild(TreeviewDataItem child2) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            
            this.child2 = child2;
        } else {
            this.child2 = child2;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child2.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".addChild(%s);",  ((child2 != null) ? child2.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetAddChild2() {
        if (!setAddChild2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChild2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String child3;
    private TreeDataItem child4;
    private TreeviewDataItem child5;
    private Double index;
    private List<TreeviewDataItem> setAddChildAt = new ArrayList<>();

    /**
     * Inserts a child into a specified position.
     */
    public TreeviewDataItem addChildAt(String child3, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child3 = child3;
            this.index = index;
        } else {
            this.child3 = child3;
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", wrapQuotes(child3), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", wrapQuotes(child3), index));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddChildAt() {
        if (!setAddChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setAddChildAt1 = new ArrayList<>();

    /**
     * Inserts a child into a specified position.
     */
    public TreeviewDataItem addChildAt(TreeDataItem child4, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child4 = child4;
            this.index = index;
        } else {
            this.child4 = child4;
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", ((child4 != null) ? child4.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", ((child4 != null) ? child4.generateJs() : "null"), index));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddChildAt1() {
        if (!setAddChildAt1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChildAt1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setAddChildAt2 = new ArrayList<>();

    /**
     * Inserts a child into a specified position.
     */
    public TreeviewDataItem addChildAt(TreeviewDataItem child5, Double index) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            
            this.child5 = child5;
            this.index = index;
        } else {
            this.child5 = child5;
            this.index = index;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".addChildAt(%s, %f)", ((child5 != null) ? child5.generateJs() : "null"), index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".addChildAt(%s, %f)", ((child5 != null) ? child5.generateJs() : "null"), index));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetAddChildAt2() {
        if (!setAddChildAt2.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setAddChildAt2) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> getGetChildAt = new ArrayList<>();

    /**
     * Gets the child by index.
     */
    public TreeviewDataItem getGetChildAt(Double index) {
        TreeviewDataItem item = new TreeviewDataItem(jsBase + ".getChildAt(" + index + ")");
        getGetChildAt.add(item);
        return item;
    }

    private TreeviewDataItem getGetParent;

    /**
     * Gets a data item's parent.
     */
    public TreeviewDataItem getGetParent() {
        if (getGetParent == null)
            getGetParent = new TreeviewDataItem(jsBase + ".getParent()");

        return getGetParent;
    }

    private String key;

    /**
     * Setter for a meta data.
     */
    public void setMeta(String key) {
        if (jsBase == null) {
            this.key = key;
        } else {
            this.key = key;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".meta(%s)", wrapQuotes(key)));
                js.setLength(0);
            }
        }
    }

    private TreeDataItem child6;
    private TreeviewDataItem child7;
    private List<TreeviewDataItem> setRemoveChild = new ArrayList<>();

    /**
     * Removes data item's child.
     */
    public TreeviewDataItem removeChild(TreeDataItem child6) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            this.child7 = null;
            
            this.child6 = child6;
        } else {
            this.child6 = child6;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child6.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeChild(%s);",  ((child6 != null) ? child6.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetRemoveChild() {
        if (!setRemoveChild.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setRemoveChild) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private List<TreeviewDataItem> setRemoveChild1 = new ArrayList<>();

    /**
     * Removes data item's child.
     */
    public TreeviewDataItem removeChild(TreeviewDataItem child7) {
        if (jsBase == null) {
            this.child = null;
            this.child1 = null;
            this.child2 = null;
            this.child3 = null;
            this.child4 = null;
            this.child5 = null;
            this.child6 = null;
            this.child7 = null;
            
            this.child7 = child7;
        } else {
            this.child7 = child7;
            if (isChain) {
                js.append(";");
                isChain = false;
            }
            js.append(child7.generateJs());
            js.append(jsBase);

            js.append(String.format(Locale.US, ".removeChild(%s);",  ((child7 != null) ? child7.getJsBase() : "null")));
        }
        return this;
    }
    private String generateJSsetRemoveChild1() {
        if (!setRemoveChild1.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setRemoveChild1) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private Double index1;
    private List<TreeviewDataItem> setRemoveChildAt = new ArrayList<>();

    /**
     * Removes child at specified position.
     */
    public TreeviewDataItem removeChildAt(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;
            if (!isChain) {
                js.append(jsBase);
                isChain = true;
            }
            js.append(String.format(Locale.US, ".removeChildAt(%f)", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, ".removeChildAt(%f)", index1));
                js.setLength(0);
            }
        }
        return this;
    }
    private String generateJSsetRemoveChildAt() {
        if (!setRemoveChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : setRemoveChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }

    private String generateJSgetGetChildAt() {
        if (!getGetChildAt.isEmpty()) {
            StringBuilder resultJs = new StringBuilder();
            for (TreeviewDataItem item : getGetChildAt) {
                resultJs.append(item.generateJs());
            }
            return resultJs.toString();
        }
        return "";
    }


    private String generateJSgetGetParent() {
        if (getGetParent != null) {
            return getGetParent.generateJs();
        }
        return "";
    }


    protected String generateJsGetters() {
        StringBuilder jsGetters = new StringBuilder();

        jsGetters.append(super.generateJsGetters());

    
        jsGetters.append(generateJSgetGetChildAt());
        jsGetters.append(generateJSgetGetParent());

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
        js.append(generateJSsetAddChild1());
        js.append(generateJSsetAddChild2());
        js.append(generateJSsetAddChildAt());
        js.append(generateJSsetAddChildAt1());
        js.append(generateJSsetAddChildAt2());
        js.append(generateJSsetRemoveChild());
        js.append(generateJSsetRemoveChild1());
        js.append(generateJSsetRemoveChildAt());
        

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}