(ns net.minecraft.client.model.ModelSkeletonHead
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelSkeletonHead]))

(defn ->model-skeleton-head
  "Constructor.

  p-i-1155-1 - `int`
  p-i-1155-2 - `int`
  p-i-1155-3 - `int`
  p-i-1155-4 - `int`"
  (^ModelSkeletonHead [^Integer p-i-1155-1 ^Integer p-i-1155-2 ^Integer p-i-1155-3 ^Integer p-i-1155-4]
    (new ModelSkeletonHead p-i-1155-1 p-i-1155-2 p-i-1155-3 p-i-1155-4))
  (^ModelSkeletonHead []
    (new ModelSkeletonHead )))

(defn skeleton-head
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSkeletonHead this]
    (-> this .-skeletonHead)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelSkeletonHead this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelSkeletonHead this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

