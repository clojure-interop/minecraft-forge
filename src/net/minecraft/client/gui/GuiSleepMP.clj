(ns net.minecraft.client.gui.GuiSleepMP
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiSleepMP]))

(defn ->gui-sleep-mp
  "Constructor."
  (^GuiSleepMP []
    (new GuiSleepMP )))

(defn init-gui
  ""
  ([^GuiSleepMP this]
    (-> this (.initGui))))

