(ns net.minecraftforge.client.model.animation.ModelBlockAnimation$MBVariableClip
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation ModelBlockAnimation$MBVariableClip]))

(defn ->mb-variable-clip
  "Constructor.

  variable - `net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Variable`
  type - `net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Type`
  interpolation - `net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Interpolation`
  samples - `float[]`"
  (^ModelBlockAnimation$MBVariableClip [^net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Variable variable ^net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Type type ^net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Interpolation interpolation samples]
    (new ModelBlockAnimation$MBVariableClip variable type interpolation samples)))

