(ns net.minecraft.client.particle.ParticleSimpleAnimated
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.particle ParticleSimpleAnimated]))

(defn ->particle-simple-animated
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  texture-idx-in - `int`
  num-frames - `int`
  y-accel-in - `float`"
  (^ParticleSimpleAnimated [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^Integer texture-idx-in ^Integer num-frames ^Float y-accel-in]
    (new ParticleSimpleAnimated world-in x y z texture-idx-in num-frames y-accel-in)))

(defn set-color
  "p-187146-1 - `int`"
  ([^ParticleSimpleAnimated this ^Integer p-187146-1]
    (-> this (.setColor p-187146-1))))

(defn set-color-fade
  "rgb - `int`"
  ([^ParticleSimpleAnimated this ^Integer rgb]
    (-> this (.setColorFade rgb))))

(defn transparent?
  "returns: `boolean`"
  (^Boolean [^ParticleSimpleAnimated this]
    (-> this (.isTransparent))))

(defn on-update
  ""
  ([^ParticleSimpleAnimated this]
    (-> this (.onUpdate))))

(defn get-brightness-for-render
  "p-189214-1 - `float`

  returns: `int`"
  (^Integer [^ParticleSimpleAnimated this ^Float p-189214-1]
    (-> this (.getBrightnessForRender p-189214-1))))

