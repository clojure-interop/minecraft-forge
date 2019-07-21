(ns net.minecraftforge.client.model.animation.ModelBlockAnimation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation ModelBlockAnimation]))

(defn ->model-block-animation
  "Constructor.

  joints - `com.google.common.collect.ImmutableMap`
  clips - `com.google.common.collect.ImmutableMap`"
  (^ModelBlockAnimation [^com.google.common.collect.ImmutableMap joints ^com.google.common.collect.ImmutableMap clips]
    (new ModelBlockAnimation joints clips)))

(defn *load-vanilla-animation
  "Load armature associated with a vanilla model.

  manager - `net.minecraft.client.resources.IResourceManager`
  armature-location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraftforge.client.model.animation.ModelBlockAnimation`"
  (^net.minecraftforge.client.model.animation.ModelBlockAnimation [^net.minecraft.client.resources.IResourceManager manager ^net.minecraft.util.ResourceLocation armature-location]
    (ModelBlockAnimation/loadVanillaAnimation manager armature-location)))

(defn get-clips
  "returns: `com.google.common.collect.ImmutableMap<java.lang.String,net.minecraftforge.client.model.animation.ModelBlockAnimation$MBClip>`"
  (^com.google.common.collect.ImmutableMap [^ModelBlockAnimation this]
    (-> this (.getClips))))

(defn get-joint
  "i - `int`

  returns: `com.google.common.collect.ImmutableCollection<net.minecraftforge.client.model.animation.ModelBlockAnimation$MBJointWeight>`"
  (^com.google.common.collect.ImmutableCollection [^ModelBlockAnimation this ^Integer i]
    (-> this (.getJoint i))))

(defn get-part-transform
  "state - `net.minecraftforge.common.model.IModelState`
  part - `net.minecraft.client.renderer.block.model.BlockPart`
  i - `int`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^ModelBlockAnimation this ^net.minecraftforge.common.model.IModelState state ^net.minecraft.client.renderer.block.model.BlockPart part ^Integer i]
    (-> this (.getPartTransform state part i))))

