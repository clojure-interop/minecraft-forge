(ns net.minecraft.client.particle.ParticleSpell
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleSpell]))

(defn transparent?
  "returns: `boolean`"
  (^Boolean [^ParticleSpell this]
    (-> this (.isTransparent))))

(defn on-update
  ""
  ([^ParticleSpell this]
    (-> this (.onUpdate))))

(defn set-base-spell-texture-index
  "base-spell-texture-index-in - `int`"
  ([^ParticleSpell this ^Integer base-spell-texture-index-in]
    (-> this (.setBaseSpellTextureIndex base-spell-texture-index-in))))

