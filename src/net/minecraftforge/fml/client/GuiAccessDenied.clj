(ns net.minecraftforge.fml.client.GuiAccessDenied
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiAccessDenied]))

(defn ->gui-access-denied
  "Constructor.

  parent - `net.minecraft.client.gui.GuiScreen`
  data - `net.minecraft.client.multiplayer.ServerData`"
  (^GuiAccessDenied [^net.minecraft.client.gui.GuiScreen parent ^net.minecraft.client.multiplayer.ServerData data]
    (new GuiAccessDenied parent data)))

(defn init-gui
  ""
  ([^GuiAccessDenied this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiAccessDenied this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

