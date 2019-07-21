(ns net.minecraftforge.common.animation.ITimeValue
  "Time-varying value associated with the animation.
  Return value should be constant with the respect to the input and reasonable context (current render frame).
  Simplest example is the input time itself.
  Unity calls them Parameters, Unreal calls them Variables."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.animation ITimeValue]))

(defn apply
  "input - `float`

  returns: `float`"
  (^Float [^ITimeValue this ^Float input]
    (-> this (.apply input))))

