(ns net.minecraftforge.fml.client.GuiCustomModLoadingErrorScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiCustomModLoadingErrorScreen]))

(defn ->gui-custom-mod-loading-error-screen
  "Constructor.

  custom-exception - `net.minecraftforge.fml.client.CustomModLoadingErrorDisplayException`"
  (^GuiCustomModLoadingErrorScreen [^net.minecraftforge.fml.client.CustomModLoadingErrorDisplayException custom-exception]
    (new GuiCustomModLoadingErrorScreen custom-exception)))

(defn init-gui
  ""
  ([^GuiCustomModLoadingErrorScreen this]
    (-> this (.initGui))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiCustomModLoadingErrorScreen this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

