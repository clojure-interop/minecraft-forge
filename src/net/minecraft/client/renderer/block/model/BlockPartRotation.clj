(ns net.minecraft.client.renderer.block.model.BlockPartRotation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model BlockPartRotation]))

(defn ->block-part-rotation
  "Constructor.

  origin-in - `org.lwjgl.util.vector.Vector3f`
  axis-in - `net.minecraft.util.EnumFacing$Axis`
  angle-in - `float`
  rescale-in - `boolean`"
  (^BlockPartRotation [^org.lwjgl.util.vector.Vector3f origin-in ^net.minecraft.util.EnumFacing$Axis axis-in ^Float angle-in ^Boolean rescale-in]
    (new BlockPartRotation origin-in axis-in angle-in rescale-in)))

(defn origin
  "Instance Constant.

  type: org.lwjgl.util.vector.Vector3f"
  (^org.lwjgl.util.vector.Vector3f [^BlockPartRotation this]
    (-> this .-origin)))

(defn axis
  "Instance Constant.

  type: net.minecraft.util.EnumFacing$Axis"
  (^net.minecraft.util.EnumFacing$Axis [^BlockPartRotation this]
    (-> this .-axis)))

(defn angle
  "Instance Constant.

  type: float"
  (^Float [^BlockPartRotation this]
    (-> this .-angle)))

(defn rescale
  "Instance Constant.

  type: boolean"
  (^Boolean [^BlockPartRotation this]
    (-> this .-rescale)))

