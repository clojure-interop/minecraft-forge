(ns net.minecraftforge.client.model.animation.ModelBlockAnimation$MBClip$MBJointClip
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation ModelBlockAnimation$MBClip$MBJointClip]))

(defn ->mb-joint-clip
  "Constructor.

  loop - `boolean`
  variables - `com.google.common.collect.ImmutableList`"
  (^ModelBlockAnimation$MBClip$MBJointClip [^Boolean loop ^com.google.common.collect.ImmutableList variables]
    (new ModelBlockAnimation$MBClip$MBJointClip loop variables)))

(defn apply
  "time - `float`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^ModelBlockAnimation$MBClip$MBJointClip this ^Float time]
    (-> this (.apply time))))

