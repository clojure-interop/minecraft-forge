(ns net.minecraftforge.common.model.animation.JointClips$NodeJointClip
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation JointClips$NodeJointClip]))

(defn ->node-joint-clip
  "Constructor.

  joint - `net.minecraftforge.common.model.animation.IJoint`
  clip - `net.minecraftforge.common.model.animation.IClip`"
  (^JointClips$NodeJointClip [^net.minecraftforge.common.model.animation.IJoint joint ^net.minecraftforge.common.model.animation.IClip clip]
    (new JointClips$NodeJointClip joint clip)))

(defn apply
  "time - `float`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^JointClips$NodeJointClip this ^Float time]
    (-> this (.apply time))))

