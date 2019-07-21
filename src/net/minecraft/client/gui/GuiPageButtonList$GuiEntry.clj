(ns net.minecraft.client.gui.GuiPageButtonList$GuiEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiPageButtonList$GuiEntry]))

(defn ->gui-entry
  "Constructor.

  p-i-45533-1 - `net.minecraft.client.gui.Gui`
  p-i-45533-2 - `net.minecraft.client.gui.Gui`"
  (^GuiPageButtonList$GuiEntry [^net.minecraft.client.gui.Gui p-i-45533-1 ^net.minecraft.client.gui.Gui p-i-45533-2]
    (new GuiPageButtonList$GuiEntry p-i-45533-1 p-i-45533-2)))

(defn get-component-1
  "returns: `net.minecraft.client.gui.Gui`"
  (^net.minecraft.client.gui.Gui [^GuiPageButtonList$GuiEntry this]
    (-> this (.getComponent1))))

(defn get-component-2
  "returns: `net.minecraft.client.gui.Gui`"
  (^net.minecraft.client.gui.Gui [^GuiPageButtonList$GuiEntry this]
    (-> this (.getComponent2))))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^GuiPageButtonList$GuiEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn set-selected
  "p-178011-1 - `int`
  p-178011-2 - `int`
  p-178011-3 - `int`"
  ([^GuiPageButtonList$GuiEntry this ^Integer p-178011-1 ^Integer p-178011-2 ^Integer p-178011-3]
    (-> this (.setSelected p-178011-1 p-178011-2 p-178011-3))))

(defn mouse-pressed
  "slot-index - `int`
  mouse-x - `int`
  mouse-y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiPageButtonList$GuiEntry this ^Integer slot-index ^Integer mouse-x ^Integer mouse-y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mousePressed slot-index mouse-x mouse-y mouse-event relative-x relative-y))))

(defn mouse-released
  "slot-index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`"
  ([^GuiPageButtonList$GuiEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mouseReleased slot-index x y mouse-event relative-x relative-y))))

