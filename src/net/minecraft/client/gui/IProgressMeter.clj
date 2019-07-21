(ns net.minecraft.client.gui.IProgressMeter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui IProgressMeter]))

(defn done-loading
  ""
  ([^IProgressMeter this]
    (-> this (.doneLoading))))

