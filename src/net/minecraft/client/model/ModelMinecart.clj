(ns net.minecraft.client.model.ModelMinecart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelMinecart]))

(defn ->model-minecart
  "Constructor."
  (^ModelMinecart []
    (new ModelMinecart )))

(defn side-models
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer[]"
  ([^ModelMinecart this]
    (-> this .-sideModels)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelMinecart this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

