(ns net.minecraft.client.gui.GuiListWorldSelectionEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiListWorldSelectionEntry]))

(defn ->gui-list-world-selection-entry
  "Constructor.

  list-world-sel-in - `net.minecraft.client.gui.GuiListWorldSelection`
  world-summary-in - `net.minecraft.world.storage.WorldSummary`
  save-format - `net.minecraft.world.storage.ISaveFormat`"
  (^GuiListWorldSelectionEntry [^net.minecraft.client.gui.GuiListWorldSelection list-world-sel-in ^net.minecraft.world.storage.WorldSummary world-summary-in ^net.minecraft.world.storage.ISaveFormat save-format]
    (new GuiListWorldSelectionEntry list-world-sel-in world-summary-in save-format)))

(defn draw-entry
  "slot-index - `int`
  x - `int`
  y - `int`
  list-width - `int`
  slot-height - `int`
  mouse-x - `int`
  mouse-y - `int`
  is-selected - `boolean`"
  ([^GuiListWorldSelectionEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer list-width ^Integer slot-height ^Integer mouse-x ^Integer mouse-y ^Boolean is-selected]
    (-> this (.drawEntry slot-index x y list-width slot-height mouse-x mouse-y is-selected))))

(defn mouse-pressed
  "slot-index - `int`
  mouse-x - `int`
  mouse-y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiListWorldSelectionEntry this ^Integer slot-index ^Integer mouse-x ^Integer mouse-y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mousePressed slot-index mouse-x mouse-y mouse-event relative-x relative-y))))

(defn join-world
  ""
  ([^GuiListWorldSelectionEntry this]
    (-> this (.joinWorld))))

(defn delete-world
  ""
  ([^GuiListWorldSelectionEntry this]
    (-> this (.deleteWorld))))

(defn edit-world
  ""
  ([^GuiListWorldSelectionEntry this]
    (-> this (.editWorld))))

(defn recreate-world
  ""
  ([^GuiListWorldSelectionEntry this]
    (-> this (.recreateWorld))))

(defn mouse-released
  "slot-index - `int`
  x - `int`
  y - `int`
  mouse-event - `int`
  relative-x - `int`
  relative-y - `int`"
  ([^GuiListWorldSelectionEntry this ^Integer slot-index ^Integer x ^Integer y ^Integer mouse-event ^Integer relative-x ^Integer relative-y]
    (-> this (.mouseReleased slot-index x y mouse-event relative-x relative-y))))

(defn set-selected
  "p-178011-1 - `int`
  p-178011-2 - `int`
  p-178011-3 - `int`"
  ([^GuiListWorldSelectionEntry this ^Integer p-178011-1 ^Integer p-178011-2 ^Integer p-178011-3]
    (-> this (.setSelected p-178011-1 p-178011-2 p-178011-3))))

