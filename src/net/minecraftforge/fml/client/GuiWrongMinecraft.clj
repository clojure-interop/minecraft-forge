(ns net.minecraftforge.fml.client.GuiWrongMinecraft
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiWrongMinecraft]))

(defn ->gui-wrong-minecraft
  "Constructor.

  wrong-mc - `net.minecraftforge.fml.common.WrongMinecraftVersionException`"
  (^GuiWrongMinecraft [^net.minecraftforge.fml.common.WrongMinecraftVersionException wrong-mc]
    (new GuiWrongMinecraft wrong-mc)))

(defn init-gui
  ""
  ([^GuiWrongMinecraft this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiWrongMinecraft this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

