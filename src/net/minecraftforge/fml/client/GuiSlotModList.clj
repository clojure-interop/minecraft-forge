(ns net.minecraftforge.fml.client.GuiSlotModList
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiSlotModList]))

(defn ->gui-slot-mod-list
  "Constructor.

  parent - `net.minecraftforge.fml.client.GuiModList`
  mods - `java.util.ArrayList`
  list-width - `int`
  slot-height - `int`"
  (^GuiSlotModList [^net.minecraftforge.fml.client.GuiModList parent ^java.util.ArrayList mods ^Integer list-width ^Integer slot-height]
    (new GuiSlotModList parent mods list-width slot-height)))

