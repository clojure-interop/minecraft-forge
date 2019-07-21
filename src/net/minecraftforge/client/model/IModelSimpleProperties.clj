(ns net.minecraftforge.client.model.IModelSimpleProperties
  "Implement this if the model can process \"smooth_lighting\" or \"gui3d\" attributes from the json."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model IModelSimpleProperties]))

(defn smooth-lighting
  "value - `boolean`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^IModelSimpleProperties this ^Boolean value]
    (-> this (.smoothLighting value))))

(defn gui-3d
  "value - `boolean`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^IModelSimpleProperties this ^Boolean value]
    (-> this (.gui3d value))))

