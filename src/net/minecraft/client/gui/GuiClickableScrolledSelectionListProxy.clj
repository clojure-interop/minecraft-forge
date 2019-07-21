(ns net.minecraft.client.gui.GuiClickableScrolledSelectionListProxy
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiClickableScrolledSelectionListProxy]))

(defn ->gui-clickable-scrolled-selection-list-proxy
  "Constructor.

  selection-list - `net.minecraft.realms.RealmsClickableScrolledSelectionList`
  width-in - `int`
  height-in - `int`
  top-in - `int`
  bottom-in - `int`
  slot-height-in - `int`"
  (^GuiClickableScrolledSelectionListProxy [^net.minecraft.realms.RealmsClickableScrolledSelectionList selection-list ^Integer width-in ^Integer height-in ^Integer top-in ^Integer bottom-in ^Integer slot-height-in]
    (new GuiClickableScrolledSelectionListProxy selection-list width-in height-in top-in bottom-in slot-height-in)))

(defn width
  "returns: `int`"
  (^Integer [^GuiClickableScrolledSelectionListProxy this]
    (-> this (.width))))

(defn mouse-y
  "returns: `int`"
  (^Integer [^GuiClickableScrolledSelectionListProxy this]
    (-> this (.mouseY))))

(defn mouse-x
  "returns: `int`"
  (^Integer [^GuiClickableScrolledSelectionListProxy this]
    (-> this (.mouseX))))

(defn handle-mouse-input
  ""
  ([^GuiClickableScrolledSelectionListProxy this]
    (-> this (.handleMouseInput))))

(defn render-selected
  "p-178043-1 - `int`
  p-178043-2 - `int`
  p-178043-3 - `int`
  p-178043-4 - `net.minecraft.realms.Tezzelator`"
  ([^GuiClickableScrolledSelectionListProxy this ^Integer p-178043-1 ^Integer p-178043-2 ^Integer p-178043-3 ^net.minecraft.realms.Tezzelator p-178043-4]
    (-> this (.renderSelected p-178043-1 p-178043-2 p-178043-3 p-178043-4))))

