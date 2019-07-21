(ns net.minecraft.client.gui.GuiOptionsRowList$Row
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiOptionsRowList$Row]))

(defn ->row
  "Constructor.

  button-a-in - `net.minecraft.client.gui.GuiButton`
  button-b-in - `net.minecraft.client.gui.GuiButton`"
  (^GuiOptionsRowList$Row [^net.minecraft.client.gui.GuiButton button-a-in ^net.minecraft.client.gui.GuiButton button-b-in]
    (new GuiOptionsRowList$Row button-a-in button-b-in)))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^GuiOptionsRowList$Row this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn mouse-pressed
  "slot-index - `int`
  mouse-x - `int`
  mouse-y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiOptionsRowList$Row this ^Integer slot-index ^Integer mouse-x ^Integer mouse-y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mousePressed slot-index mouse-x mouse-y mouse-event relative-x relative-y))))

(defn mouse-released
  "slot-index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`"
  ([^GuiOptionsRowList$Row this ^Integer slot-index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mouseReleased slot-index x y mouse-event relative-x relative-y))))

(defn set-selected
  "p-178011-1 - `int`
  p-178011-2 - `int`
  p-178011-3 - `int`"
  ([^GuiOptionsRowList$Row this ^Integer p-178011-1 ^Integer p-178011-2 ^Integer p-178011-3]
    (-> this (.setSelected p-178011-1 p-178011-2 p-178011-3))))

