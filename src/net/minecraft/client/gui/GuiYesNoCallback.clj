(ns net.minecraft.client.gui.GuiYesNoCallback
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiYesNoCallback]))

(defn confirm-clicked
  "result - `boolean`
  id - `int`"
  ([^GuiYesNoCallback this ^Boolean result ^Integer id]
    (-> this (.confirmClicked result id))))

