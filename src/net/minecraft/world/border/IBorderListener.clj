(ns net.minecraft.world.border.IBorderListener
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.border IBorderListener]))

(defn on-size-changed
  "border - `net.minecraft.world.border.WorldBorder`
  new-size - `double`"
  ([^IBorderListener this ^net.minecraft.world.border.WorldBorder border ^Double new-size]
    (-> this (.onSizeChanged border new-size))))

(defn on-transition-started
  "border - `net.minecraft.world.border.WorldBorder`
  old-size - `double`
  new-size - `double`
  time - `long`"
  ([^IBorderListener this ^net.minecraft.world.border.WorldBorder border ^Double old-size ^Double new-size ^Long time]
    (-> this (.onTransitionStarted border old-size new-size time))))

(defn on-center-changed
  "border - `net.minecraft.world.border.WorldBorder`
  x - `double`
  z - `double`"
  ([^IBorderListener this ^net.minecraft.world.border.WorldBorder border ^Double x ^Double z]
    (-> this (.onCenterChanged border x z))))

(defn on-warning-time-changed
  "border - `net.minecraft.world.border.WorldBorder`
  new-time - `int`"
  ([^IBorderListener this ^net.minecraft.world.border.WorldBorder border ^Integer new-time]
    (-> this (.onWarningTimeChanged border new-time))))

(defn on-warning-distance-changed
  "border - `net.minecraft.world.border.WorldBorder`
  new-distance - `int`"
  ([^IBorderListener this ^net.minecraft.world.border.WorldBorder border ^Integer new-distance]
    (-> this (.onWarningDistanceChanged border new-distance))))

(defn on-damage-amount-changed
  "border - `net.minecraft.world.border.WorldBorder`
  new-amount - `double`"
  ([^IBorderListener this ^net.minecraft.world.border.WorldBorder border ^Double new-amount]
    (-> this (.onDamageAmountChanged border new-amount))))

(defn on-damage-buffer-changed
  "border - `net.minecraft.world.border.WorldBorder`
  new-size - `double`"
  ([^IBorderListener this ^net.minecraft.world.border.WorldBorder border ^Double new-size]
    (-> this (.onDamageBufferChanged border new-size))))

