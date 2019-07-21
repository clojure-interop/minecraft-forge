(ns net.minecraft.client.model.ModelVillager
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelVillager]))

(defn ->model-villager
  "Constructor.

  scale - `float`
  p-i-1164-2 - `float`
  width - `int`
  height - `int`"
  (^ModelVillager [^Float scale ^Float p-i-1164-2 ^Integer width ^Integer height]
    (new ModelVillager scale p-i-1164-2 width height))
  (^ModelVillager [^Float scale]
    (new ModelVillager scale)))

(defn villager-head
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelVillager this]
    (-> this .-villagerHead)))

(defn villager-body
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelVillager this]
    (-> this .-villagerBody)))

(defn villager-arms
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelVillager this]
    (-> this .-villagerArms)))

(defn right-villager-leg
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelVillager this]
    (-> this .-rightVillagerLeg)))

(defn left-villager-leg
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelVillager this]
    (-> this .-leftVillagerLeg)))

(defn villager-nose
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelVillager this]
    (-> this .-villagerNose)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelVillager this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelVillager this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

