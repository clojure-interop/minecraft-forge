(ns net.minecraft.client.model.ModelLeashKnot
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelLeashKnot]))

(defn ->model-leash-knot
  "Constructor.

  p-i-46365-1 - `int`
  p-i-46365-2 - `int`
  p-i-46365-3 - `int`
  p-i-46365-4 - `int`"
  (^ModelLeashKnot [^Integer p-i-46365-1 ^Integer p-i-46365-2 ^Integer p-i-46365-3 ^Integer p-i-46365-4]
    (new ModelLeashKnot p-i-46365-1 p-i-46365-2 p-i-46365-3 p-i-46365-4))
  (^ModelLeashKnot []
    (new ModelLeashKnot )))

(defn knot-renderer
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelLeashKnot this]
    (-> this .-knotRenderer)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelLeashKnot this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelLeashKnot this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

