(ns net.minecraft.entity.effect.EntityWeatherEffect
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.effect EntityWeatherEffect]))

(defn ->entity-weather-effect
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^EntityWeatherEffect [^net.minecraft.world.World world-in]
    (new EntityWeatherEffect world-in)))

