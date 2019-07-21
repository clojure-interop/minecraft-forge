(ns net.minecraftforge.client.model.IModelCustomData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model IModelCustomData]))

(defn process
  "Allows the model to process custom data from the variant definition.
   If unknown data is encountered it should be skipped.

  custom-data - `com.google.common.collect.ImmutableMap`

  returns: a new model, with data applied. - `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^IModelCustomData this ^com.google.common.collect.ImmutableMap custom-data]
    (-> this (.process custom-data))))

