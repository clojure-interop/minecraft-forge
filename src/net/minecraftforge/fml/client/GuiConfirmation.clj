(ns net.minecraftforge.fml.client.GuiConfirmation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client GuiConfirmation]))

(defn ->gui-confirmation
  "Constructor.

  query - `net.minecraftforge.fml.common.StartupQuery`"
  (^GuiConfirmation [^net.minecraftforge.fml.common.StartupQuery query]
    (new GuiConfirmation query)))

(defn init-gui
  ""
  ([^GuiConfirmation this]
    (-> this (.initGui))))

