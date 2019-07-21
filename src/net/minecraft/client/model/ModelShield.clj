(ns net.minecraft.client.model.ModelShield
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelShield]))

(defn ->model-shield
  "Constructor."
  (^ModelShield []
    (new ModelShield )))

(defn plate
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelShield this]
    (-> this .-plate)))

(defn handle
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelShield this]
    (-> this .-handle)))

(defn render
  ""
  ([^ModelShield this]
    (-> this (.render))))

