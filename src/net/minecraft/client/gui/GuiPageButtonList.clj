(ns net.minecraft.client.gui.GuiPageButtonList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiPageButtonList]))

(defn ->gui-page-button-list
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  width-in - `int`
  height-in - `int`
  top-in - `int`
  bottom-in - `int`
  slot-height-in - `int`
  p-i-45536-7 - `net.minecraft.client.gui.GuiPageButtonList$GuiResponder`
  p-i-45536-8 - `net.minecraft.client.gui.GuiPageButtonList$GuiListEntry[]`"
  (^GuiPageButtonList [^net.minecraft.client.Minecraft mc-in ^Integer width-in ^Integer height-in ^Integer top-in ^Integer bottom-in ^Integer slot-height-in ^net.minecraft.client.gui.GuiPageButtonList$GuiResponder p-i-45536-7 p-i-45536-8]
    (new GuiPageButtonList mc-in width-in height-in top-in bottom-in slot-height-in p-i-45536-7 p-i-45536-8)))

(defn get-list-width
  "returns: `int`"
  (^Integer [^GuiPageButtonList this]
    (-> this (.getListWidth))))

(defn get-component
  "p-178061-1 - `int`

  returns: `net.minecraft.client.gui.Gui`"
  (^net.minecraft.client.gui.Gui [^GuiPageButtonList this ^Integer p-178061-1]
    (-> this (.getComponent p-178061-1))))

(defn next-page
  ""
  ([^GuiPageButtonList this]
    (-> this (.nextPage))))

(defn set-page
  "p-181156-1 - `int`"
  ([^GuiPageButtonList this ^Integer p-181156-1]
    (-> this (.setPage p-181156-1))))

(defn on-key-pressed
  "p-178062-1 - `char`
  p-178062-2 - `int`"
  ([^GuiPageButtonList this ^Character p-178062-1 ^Integer p-178062-2]
    (-> this (.onKeyPressed p-178062-1 p-178062-2))))

(defn get-list-entry
  "index - `int`

  returns: `net.minecraft.client.gui.GuiPageButtonList$GuiEntry`"
  (^net.minecraft.client.gui.GuiPageButtonList$GuiEntry [^GuiPageButtonList this ^Integer index]
    (-> this (.getListEntry index))))

(defn previous-page
  ""
  ([^GuiPageButtonList this]
    (-> this (.previousPage))))

(defn get-focused-control
  "returns: `net.minecraft.client.gui.Gui`"
  (^net.minecraft.client.gui.Gui [^GuiPageButtonList this]
    (-> this (.getFocusedControl))))

(defn get-page
  "returns: `int`"
  (^Integer [^GuiPageButtonList this]
    (-> this (.getPage))))

(defn set-active
  "p-181155-1 - `boolean`"
  ([^GuiPageButtonList this ^Boolean p-181155-1]
    (-> this (.setActive p-181155-1))))

(defn get-size
  "returns: `int`"
  (^Integer [^GuiPageButtonList this]
    (-> this (.getSize))))

(defn mouse-clicked
  "mouse-x - `int`
  mouse-y - `int`
  mouse-event - `int`

  returns: `boolean`"
  (^Boolean [^GuiPageButtonList this ^Integer mouse-x ^Integer mouse-y ^Integer mouse-event]
    (-> this (.mouseClicked mouse-x mouse-y mouse-event))))

(defn get-page-count
  "returns: `int`"
  (^Integer [^GuiPageButtonList this]
    (-> this (.getPageCount))))

