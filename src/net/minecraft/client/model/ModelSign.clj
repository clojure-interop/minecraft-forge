(ns net.minecraft.client.model.ModelSign
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelSign]))

(defn ->model-sign
  "Constructor."
  (^ModelSign []
    (new ModelSign )))

(defn sign-board
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSign this]
    (-> this .-signBoard)))

(defn sign-stick
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSign this]
    (-> this .-signStick)))

(defn render-sign
  ""
  ([^ModelSign this]
    (-> this (.renderSign))))

