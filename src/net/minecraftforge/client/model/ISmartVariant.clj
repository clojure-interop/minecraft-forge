(ns net.minecraftforge.client.model.ISmartVariant
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ISmartVariant]))

(defn process
  "base - `net.minecraftforge.client.model.IModel`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^ISmartVariant this ^net.minecraftforge.client.model.IModel base]
    (-> this (.process base))))

