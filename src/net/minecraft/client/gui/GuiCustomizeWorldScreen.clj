(ns net.minecraft.client.gui.GuiCustomizeWorldScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiCustomizeWorldScreen]))

(defn ->gui-customize-world-screen
  "Constructor.

  parent-in - `net.minecraft.client.gui.GuiScreen`
  p-i-45521-2 - `java.lang.String`"
  (^GuiCustomizeWorldScreen [^net.minecraft.client.gui.GuiScreen parent-in ^java.lang.String p-i-45521-2]
    (new GuiCustomizeWorldScreen parent-in p-i-45521-2)))

(defn init-gui
  ""
  ([^GuiCustomizeWorldScreen this]
    (-> this (.initGui))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiCustomizeWorldScreen this]
    (-> this (.handleMouseInput))))

(defn save-values
  "returns: `java.lang.String`"
  (^java.lang.String [^GuiCustomizeWorldScreen this]
    (-> this (.saveValues))))

(defn load-values
  "p-175324-1 - `java.lang.String`"
  ([^GuiCustomizeWorldScreen this ^java.lang.String p-175324-1]
    (-> this (.loadValues p-175324-1))))

(defn set-entry-value
  "id - `int`
  value - `java.lang.String`"
  ([^GuiCustomizeWorldScreen this ^Integer id ^java.lang.String value]
    (-> this (.setEntryValue id value))))

(defn get-text
  "id - `int`
  name - `java.lang.String`
  value - `float`

  returns: `java.lang.String`"
  (^java.lang.String [^GuiCustomizeWorldScreen this ^Integer id ^java.lang.String name ^Float value]
    (-> this (.getText id name value))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiCustomizeWorldScreen this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

