(ns net.minecraft.client.gui.GuiListExtended
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiListExtended]))

(defn ->gui-list-extended
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  width-in - `int`
  height-in - `int`
  top-in - `int`
  bottom-in - `int`
  slot-height-in - `int`"
  (^GuiListExtended [^net.minecraft.client.Minecraft mc-in ^Integer width-in ^Integer height-in ^Integer top-in ^Integer bottom-in ^Integer slot-height-in]
    (new GuiListExtended mc-in width-in height-in top-in bottom-in slot-height-in)))

(defn mouse-clicked
  "mouse-x - `int`
  mouse-y - `int`
  mouse-event - `int`

  returns: `boolean`"
  (^Boolean [^GuiListExtended this ^Integer mouse-x ^Integer mouse-y ^Integer mouse-event]
    (-> this (.mouseClicked mouse-x mouse-y mouse-event))))

(defn mouse-released
  "x - `int`
  y - `int`
  mouse-event - `int`

  returns: `boolean`"
  (^Boolean [^GuiListExtended this ^Integer x ^Integer y ^Integer mouse-event]
    (-> this (.mouseReleased x y mouse-event))))

(defn get-list-entry
  "index - `int`

  returns: `net.minecraft.client.gui.GuiListExtended$IGuiListEntry`"
  (^net.minecraft.client.gui.GuiListExtended$IGuiListEntry [^GuiListExtended this ^Integer index]
    (-> this (.getListEntry index))))

