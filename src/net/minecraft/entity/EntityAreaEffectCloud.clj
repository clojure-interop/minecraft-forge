(ns net.minecraft.entity.EntityAreaEffectCloud
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity EntityAreaEffectCloud]))

(defn ->entity-area-effect-cloud
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityAreaEffectCloud [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityAreaEffectCloud world-in x y z))
  (^EntityAreaEffectCloud [^net.minecraft.world.World world-in]
    (new EntityAreaEffectCloud world-in)))

(defn add-effect
  "effect - `net.minecraft.potion.PotionEffect`"
  ([^EntityAreaEffectCloud this ^net.minecraft.potion.PotionEffect effect]
    (-> this (.addEffect effect))))

(defn get-radius
  "returns: `float`"
  (^Float [^EntityAreaEffectCloud this]
    (-> this (.getRadius))))

(defn set-particle-param-2
  "particle-param - `int`"
  ([^EntityAreaEffectCloud this ^Integer particle-param]
    (-> this (.setParticleParam2 particle-param))))

(defn set-duration
  "duration-in - `int`"
  ([^EntityAreaEffectCloud this ^Integer duration-in]
    (-> this (.setDuration duration-in))))

(defn set-owner
  "owner-in - `net.minecraft.entity.EntityLivingBase`"
  ([^EntityAreaEffectCloud this ^net.minecraft.entity.EntityLivingBase owner-in]
    (-> this (.setOwner owner-in))))

(defn on-update
  ""
  ([^EntityAreaEffectCloud this]
    (-> this (.onUpdate))))

(defn get-push-reaction
  "returns: `net.minecraft.block.material.EnumPushReaction`"
  (^net.minecraft.block.material.EnumPushReaction [^EntityAreaEffectCloud this]
    (-> this (.getPushReaction))))

(defn get-particle
  "returns: `net.minecraft.util.EnumParticleTypes`"
  (^net.minecraft.util.EnumParticleTypes [^EntityAreaEffectCloud this]
    (-> this (.getParticle))))

(defn set-particle-param-1
  "particle-param - `int`"
  ([^EntityAreaEffectCloud this ^Integer particle-param]
    (-> this (.setParticleParam1 particle-param))))

(defn should-ignore-radius?
  "returns: `boolean`"
  (^Boolean [^EntityAreaEffectCloud this]
    (-> this (.shouldIgnoreRadius))))

(defn get-particle-param-1
  "returns: `int`"
  (^Integer [^EntityAreaEffectCloud this]
    (-> this (.getParticleParam1))))

(defn get-owner
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^EntityAreaEffectCloud this]
    (-> this (.getOwner))))

(defn set-color
  "color-in - `int`"
  ([^EntityAreaEffectCloud this ^Integer color-in]
    (-> this (.setColor color-in))))

(defn set-particle
  "particle-in - `net.minecraft.util.EnumParticleTypes`"
  ([^EntityAreaEffectCloud this ^net.minecraft.util.EnumParticleTypes particle-in]
    (-> this (.setParticle particle-in))))

(defn set-radius-per-tick
  "radius-per-tick-in - `float`"
  ([^EntityAreaEffectCloud this ^Float radius-per-tick-in]
    (-> this (.setRadiusPerTick radius-per-tick-in))))

(defn set-potion
  "potion-in - `net.minecraft.potion.PotionType`"
  ([^EntityAreaEffectCloud this ^net.minecraft.potion.PotionType potion-in]
    (-> this (.setPotion potion-in))))

(defn set-wait-time
  "wait-time-in - `int`"
  ([^EntityAreaEffectCloud this ^Integer wait-time-in]
    (-> this (.setWaitTime wait-time-in))))

(defn set-radius
  "radius-in - `float`"
  ([^EntityAreaEffectCloud this ^Float radius-in]
    (-> this (.setRadius radius-in))))

(defn set-radius-on-use
  "radius-on-use-in - `float`"
  ([^EntityAreaEffectCloud this ^Float radius-on-use-in]
    (-> this (.setRadiusOnUse radius-on-use-in))))

(defn get-particle-param-2
  "returns: `int`"
  (^Integer [^EntityAreaEffectCloud this]
    (-> this (.getParticleParam2))))

(defn get-color
  "returns: `int`"
  (^Integer [^EntityAreaEffectCloud this]
    (-> this (.getColor))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityAreaEffectCloud this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn get-duration
  "returns: `int`"
  (^Integer [^EntityAreaEffectCloud this]
    (-> this (.getDuration))))

