(ns net.minecraft.client.model.ModelBoat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelBoat]))

(defn ->model-boat
  "Constructor."
  (^ModelBoat []
    (new ModelBoat )))

(defn boat-sides
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer[]"
  ([^ModelBoat this]
    (-> this .-boatSides)))

(defn paddles
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer[]"
  ([^ModelBoat this]
    (-> this .-paddles)))

(defn no-water
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelBoat this]
    (-> this .-noWater)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelBoat this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn render-multipass
  "p-187054-1 - `net.minecraft.entity.Entity`
  p-187054-2 - `float`
  p-187054-3 - `float`
  p-187054-4 - `float`
  p-187054-5 - `float`
  p-187054-6 - `float`
  scale - `float`"
  ([^ModelBoat this ^net.minecraft.entity.Entity p-187054-1 ^Float p-187054-2 ^Float p-187054-3 ^Float p-187054-4 ^Float p-187054-5 ^Float p-187054-6 ^Float scale]
    (-> this (.renderMultipass p-187054-1 p-187054-2 p-187054-3 p-187054-4 p-187054-5 p-187054-6 scale))))

