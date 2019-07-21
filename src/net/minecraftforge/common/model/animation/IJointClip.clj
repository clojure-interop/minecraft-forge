(ns net.minecraftforge.common.model.animation.IJointClip
  "Returns Local joint pose; animation clip for specific model part."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation IJointClip]))

(defn apply
  "time - `float`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^IJointClip this ^Float time]
    (-> this (.apply time))))

