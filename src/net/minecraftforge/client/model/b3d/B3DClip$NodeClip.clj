(ns net.minecraftforge.client.model.b3d.B3DClip$NodeClip
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DClip$NodeClip]))

(defn ->node-clip
  "Constructor.

  node - `net.minecraftforge.client.model.b3d.B3DModel$Node`"
  (^B3DClip$NodeClip [^net.minecraftforge.client.model.b3d.B3DModel$Node node]
    (new B3DClip$NodeClip node)))

(defn apply
  "time - `float`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^B3DClip$NodeClip this ^Float time]
    (-> this (.apply time))))

