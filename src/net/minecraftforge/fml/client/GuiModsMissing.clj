(ns net.minecraftforge.fml.client.GuiModsMissing
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiModsMissing]))

(defn ->gui-mods-missing
  "Constructor.

  mods-missing - `net.minecraftforge.fml.common.MissingModsException`"
  (^GuiModsMissing [^net.minecraftforge.fml.common.MissingModsException mods-missing]
    (new GuiModsMissing mods-missing)))

(defn init-gui
  ""
  ([^GuiModsMissing this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiModsMissing this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

