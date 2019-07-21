(ns net.minecraftforge.client.model.animation.ModelBlockAnimation$MBJoint
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation ModelBlockAnimation$MBJoint]))

(defn ->mb-joint
  "Constructor.

  name - `java.lang.String`
  part - `net.minecraft.client.renderer.block.model.BlockPart`"
  (^ModelBlockAnimation$MBJoint [^java.lang.String name ^net.minecraft.client.renderer.block.model.BlockPart part]
    (new ModelBlockAnimation$MBJoint name part)))

(defn get-inv-bind-pose
  "returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^ModelBlockAnimation$MBJoint this]
    (-> this (.getInvBindPose))))

(defn get-parent
  "returns: `com.google.common.base.Optional<? extends net.minecraftforge.common.model.animation.IJoint>`"
  ([^ModelBlockAnimation$MBJoint this]
    (-> this (.getParent))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ModelBlockAnimation$MBJoint this]
    (-> this (.getName))))

