(ns net.minecraft.util.CooldownTracker
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util CooldownTracker]))

(defn ->cooldown-tracker
  "Constructor."
  (^CooldownTracker []
    (new CooldownTracker )))

(defn has-cooldown?
  "item-in - `net.minecraft.item.Item`

  returns: `boolean`"
  (^Boolean [^CooldownTracker this ^net.minecraft.item.Item item-in]
    (-> this (.hasCooldown item-in))))

(defn get-cooldown
  "item-in - `net.minecraft.item.Item`
  partial-ticks - `float`

  returns: `float`"
  (^Float [^CooldownTracker this ^net.minecraft.item.Item item-in ^Float partial-ticks]
    (-> this (.getCooldown item-in partial-ticks))))

(defn tick
  ""
  ([^CooldownTracker this]
    (-> this (.tick))))

(defn set-cooldown
  "item-in - `net.minecraft.item.Item`
  ticks-in - `int`"
  ([^CooldownTracker this ^net.minecraft.item.Item item-in ^Integer ticks-in]
    (-> this (.setCooldown item-in ticks-in))))

(defn remove-cooldown
  "item-in - `net.minecraft.item.Item`"
  ([^CooldownTracker this ^net.minecraft.item.Item item-in]
    (-> this (.removeCooldown item-in))))

