(ns net.minecraftforge.fml.client.GuiModsMissingForServer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiModsMissingForServer]))

(defn ->gui-mods-missing-for-server
  "Constructor.

  mods-missing - `net.minecraftforge.fml.common.MissingModsException`"
  (^GuiModsMissingForServer [^net.minecraftforge.fml.common.MissingModsException mods-missing]
    (new GuiModsMissingForServer mods-missing)))

(defn init-gui
  ""
  ([^GuiModsMissingForServer this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiModsMissingForServer this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

