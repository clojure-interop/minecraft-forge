(ns net.minecraftforge.common.model.animation.IJoint
  "Model part that's a part of the hierarchical skeleton."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation IJoint]))

(defn get-inv-bind-pose
  "returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^IJoint this]
    (-> this (.getInvBindPose))))

(defn get-parent
  "returns: `com.google.common.base.Optional<? extends net.minecraftforge.common.model.animation.IJoint>`"
  ([^IJoint this]
    (-> this (.getParent))))

