(ns net.minecraftforge.client.model.IModelUVLock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model IModelUVLock]))

(defn uvlock
  "value - `boolean`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^IModelUVLock this ^Boolean value]
    (-> this (.uvlock value))))

