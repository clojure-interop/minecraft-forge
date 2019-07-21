(ns net.minecraft.client.renderer.DestroyBlockProgress
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer DestroyBlockProgress]))

(defn ->destroy-block-progress
  "Constructor.

  mining-player-ent-id-in - `int`
  position-in - `net.minecraft.util.math.BlockPos`"
  (^DestroyBlockProgress [^Integer mining-player-ent-id-in ^net.minecraft.util.math.BlockPos position-in]
    (new DestroyBlockProgress mining-player-ent-id-in position-in)))

(defn get-position
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^DestroyBlockProgress this]
    (-> this (.getPosition))))

(defn set-partial-block-damage
  "damage - `int`"
  ([^DestroyBlockProgress this ^Integer damage]
    (-> this (.setPartialBlockDamage damage))))

(defn get-partial-block-damage
  "returns: `int`"
  (^Integer [^DestroyBlockProgress this]
    (-> this (.getPartialBlockDamage))))

(defn set-cloud-update-tick
  "created-at-cloud-update-tick-in - `int`"
  ([^DestroyBlockProgress this ^Integer created-at-cloud-update-tick-in]
    (-> this (.setCloudUpdateTick created-at-cloud-update-tick-in))))

(defn get-creation-cloud-update-tick
  "returns: `int`"
  (^Integer [^DestroyBlockProgress this]
    (-> this (.getCreationCloudUpdateTick))))

