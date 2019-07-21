(ns net.minecraft.client.model.ModelChest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelChest]))

(defn ->model-chest
  "Constructor."
  (^ModelChest []
    (new ModelChest )))

(defn chest-lid
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelChest this]
    (-> this .-chestLid)))

(defn chest-below
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelChest this]
    (-> this .-chestBelow)))

(defn chest-knob
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelChest this]
    (-> this .-chestKnob)))

(defn render-all
  ""
  ([^ModelChest this]
    (-> this (.renderAll))))

