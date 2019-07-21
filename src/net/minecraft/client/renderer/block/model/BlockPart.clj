(ns net.minecraft.client.renderer.block.model.BlockPart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model BlockPart]))

(defn ->block-part
  "Constructor.

  position-from-in - `org.lwjgl.util.vector.Vector3f`
  position-to-in - `org.lwjgl.util.vector.Vector3f`
  map-faces-in - `java.util.Map`
  part-rotation-in - `net.minecraft.client.renderer.block.model.BlockPartRotation`
  shade-in - `boolean`"
  (^BlockPart [^org.lwjgl.util.vector.Vector3f position-from-in ^org.lwjgl.util.vector.Vector3f position-to-in ^java.util.Map map-faces-in ^net.minecraft.client.renderer.block.model.BlockPartRotation part-rotation-in ^Boolean shade-in]
    (new BlockPart position-from-in position-to-in map-faces-in part-rotation-in shade-in)))

(defn position-from
  "Instance Constant.

  type: org.lwjgl.util.vector.Vector3f"
  (^org.lwjgl.util.vector.Vector3f [^BlockPart this]
    (-> this .-positionFrom)))

(defn position-to
  "Instance Constant.

  type: org.lwjgl.util.vector.Vector3f"
  (^org.lwjgl.util.vector.Vector3f [^BlockPart this]
    (-> this .-positionTo)))

(defn map-faces
  "Instance Constant.

  type: java.util.Map<net.minecraft.util.EnumFacing,net.minecraft.client.renderer.block.model.BlockPartFace>"
  (^java.util.Map [^BlockPart this]
    (-> this .-mapFaces)))

(defn part-rotation
  "Instance Constant.

  type: net.minecraft.client.renderer.block.model.BlockPartRotation"
  (^net.minecraft.client.renderer.block.model.BlockPartRotation [^BlockPart this]
    (-> this .-partRotation)))

(defn shade
  "Instance Constant.

  type: boolean"
  (^Boolean [^BlockPart this]
    (-> this .-shade)))

