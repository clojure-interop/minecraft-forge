(ns net.minecraft.potion.PotionHealth
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion PotionHealth]))

(defn ->potion-health
  "Constructor.

  is-bad-effect-in - `boolean`
  liquid-color-in - `int`"
  (^PotionHealth [^Boolean is-bad-effect-in ^Integer liquid-color-in]
    (new PotionHealth is-bad-effect-in liquid-color-in)))

(defn instant?
  "returns: `boolean`"
  (^Boolean [^PotionHealth this]
    (-> this (.isInstant))))

(defn ready?
  "duration - `int`
  amplifier - `int`

  returns: `boolean`"
  (^Boolean [^PotionHealth this ^Integer duration ^Integer amplifier]
    (-> this (.isReady duration amplifier))))

