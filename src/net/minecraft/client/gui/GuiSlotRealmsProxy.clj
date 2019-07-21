(ns net.minecraft.client.gui.GuiSlotRealmsProxy
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiSlotRealmsProxy]))

(defn ->gui-slot-realms-proxy
  "Constructor.

  selection-list-in - `net.minecraft.realms.RealmsScrolledSelectionList`
  width-in - `int`
  height-in - `int`
  top-in - `int`
  bottom-in - `int`
  slot-height-in - `int`"
  (^GuiSlotRealmsProxy [^net.minecraft.realms.RealmsScrolledSelectionList selection-list-in ^Integer width-in ^Integer height-in ^Integer top-in ^Integer bottom-in ^Integer slot-height-in]
    (new GuiSlotRealmsProxy selection-list-in width-in height-in top-in bottom-in slot-height-in)))

(defn get-width
  "returns: `int`"
  (^Integer [^GuiSlotRealmsProxy this]
    (-> this (.getWidth))))

(defn get-mouse-y
  "returns: `int`"
  (^Integer [^GuiSlotRealmsProxy this]
    (-> this (.getMouseY))))

(defn get-mouse-x
  "returns: `int`"
  (^Integer [^GuiSlotRealmsProxy this]
    (-> this (.getMouseX))))

(defn handle-mouse-input
  ""
  ([^GuiSlotRealmsProxy this]
    (-> this (.handleMouseInput))))

