(ns net.minecraft.client.renderer.block.model.BlockPartFace
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model BlockPartFace]))

(defn ->block-part-face
  "Constructor.

  cull-face-in - `net.minecraft.util.EnumFacing`
  tint-index-in - `int`
  texture-in - `java.lang.String`
  block-face-uv-in - `net.minecraft.client.renderer.block.model.BlockFaceUV`"
  (^BlockPartFace [^net.minecraft.util.EnumFacing cull-face-in ^Integer tint-index-in ^java.lang.String texture-in ^net.minecraft.client.renderer.block.model.BlockFaceUV block-face-uv-in]
    (new BlockPartFace cull-face-in tint-index-in texture-in block-face-uv-in)))

(def *-facing-default
  "Static Constant.

  type: net.minecraft.util.EnumFacing"
  BlockPartFace/FACING_DEFAULT)

(defn cull-face
  "Instance Constant.

  type: net.minecraft.util.EnumFacing"
  (^net.minecraft.util.EnumFacing [^BlockPartFace this]
    (-> this .-cullFace)))

(defn tint-index
  "Instance Constant.

  type: int"
  (^Integer [^BlockPartFace this]
    (-> this .-tintIndex)))

(defn texture
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^BlockPartFace this]
    (-> this .-texture)))

(defn block-face-uv
  "Instance Constant.

  type: net.minecraft.client.renderer.block.model.BlockFaceUV"
  (^net.minecraft.client.renderer.block.model.BlockFaceUV [^BlockPartFace this]
    (-> this .-blockFaceUV)))

