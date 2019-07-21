(ns net.minecraft.client.model.ModelSpider
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelSpider]))

(defn ->model-spider
  "Constructor."
  (^ModelSpider []
    (new ModelSpider )))

(defn spider-head
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderHead)))

(defn spider-neck
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderNeck)))

(defn spider-body
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderBody)))

(defn spider-leg-1
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderLeg1)))

(defn spider-leg-2
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderLeg2)))

(defn spider-leg-3
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderLeg3)))

(defn spider-leg-4
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderLeg4)))

(defn spider-leg-5
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderLeg5)))

(defn spider-leg-6
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderLeg6)))

(defn spider-leg-7
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderLeg7)))

(defn spider-leg-8
  "Instance Field.

  type: net.minecraft.client.model.ModelRenderer"
  (^net.minecraft.client.model.ModelRenderer [^ModelSpider this]
    (-> this .-spiderLeg8)))

(defn render
  "entity-in - `net.minecraft.entity.Entity`
  limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale - `float`"
  ([^ModelSpider this ^net.minecraft.entity.Entity entity-in ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale]
    (-> this (.render entity-in limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale))))

(defn set-rotation-angles
  "limb-swing - `float`
  limb-swing-amount - `float`
  age-in-ticks - `float`
  net-head-yaw - `float`
  head-pitch - `float`
  scale-factor - `float`
  entity-in - `net.minecraft.entity.Entity`"
  ([^ModelSpider this ^Float limb-swing ^Float limb-swing-amount ^Float age-in-ticks ^Float net-head-yaw ^Float head-pitch ^Float scale-factor ^net.minecraft.entity.Entity entity-in]
    (-> this (.setRotationAngles limb-swing limb-swing-amount age-in-ticks net-head-yaw head-pitch scale-factor entity-in))))

