(ns net.minecraft.client.renderer.block.model.ItemCameraTransforms
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ItemCameraTransforms]))

(defn ->item-camera-transforms
  "Constructor.

  Deprecated.

  transforms - `net.minecraft.client.renderer.block.model.ItemCameraTransforms`"
  (^ItemCameraTransforms [^net.minecraft.client.renderer.block.model.ItemCameraTransforms transforms]
    (new ItemCameraTransforms transforms))
  (^ItemCameraTransforms [^net.minecraft.client.renderer.block.model.ItemTransformVec3f thirdperson-left-in ^net.minecraft.client.renderer.block.model.ItemTransformVec3f thirdperson-right-in ^net.minecraft.client.renderer.block.model.ItemTransformVec3f firstperson-left-in ^net.minecraft.client.renderer.block.model.ItemTransformVec3f firstperson-right-in ^net.minecraft.client.renderer.block.model.ItemTransformVec3f head-in ^net.minecraft.client.renderer.block.model.ItemTransformVec3f gui-in ^net.minecraft.client.renderer.block.model.ItemTransformVec3f ground-in ^net.minecraft.client.renderer.block.model.ItemTransformVec3f fixed-in]
    (new ItemCameraTransforms thirdperson-left-in thirdperson-right-in firstperson-left-in firstperson-right-in head-in gui-in ground-in fixed-in)))

(def *-default
  "Static Constant.

  type: net.minecraft.client.renderer.block.model.ItemCameraTransforms"
  ItemCameraTransforms/DEFAULT)

(defn *-offset-translate-x
  "Static Field.

  type: float"
  []
  ItemCameraTransforms/offsetTranslateX)

(defn *-offset-translate-y
  "Static Field.

  type: float"
  []
  ItemCameraTransforms/offsetTranslateY)

(defn *-offset-translate-z
  "Static Field.

  type: float"
  []
  ItemCameraTransforms/offsetTranslateZ)

(defn *-offset-rotation-x
  "Static Field.

  type: float"
  []
  ItemCameraTransforms/offsetRotationX)

(defn *-offset-rotation-y
  "Static Field.

  type: float"
  []
  ItemCameraTransforms/offsetRotationY)

(defn *-offset-rotation-z
  "Static Field.

  type: float"
  []
  ItemCameraTransforms/offsetRotationZ)

(defn *-offset-scale-x
  "Static Field.

  type: float"
  []
  ItemCameraTransforms/offsetScaleX)

(defn *-offset-scale-y
  "Static Field.

  type: float"
  []
  ItemCameraTransforms/offsetScaleY)

(defn *-offset-scale-z
  "Static Field.

  type: float"
  []
  ItemCameraTransforms/offsetScaleZ)

(defn thirdperson-left
  "Instance Constant.

  type: net.minecraft.client.renderer.block.model.ItemTransformVec3f"
  (^net.minecraft.client.renderer.block.model.ItemTransformVec3f [^ItemCameraTransforms this]
    (-> this .-thirdperson_left)))

(defn thirdperson-right
  "Instance Constant.

  type: net.minecraft.client.renderer.block.model.ItemTransformVec3f"
  (^net.minecraft.client.renderer.block.model.ItemTransformVec3f [^ItemCameraTransforms this]
    (-> this .-thirdperson_right)))

(defn firstperson-left
  "Instance Constant.

  type: net.minecraft.client.renderer.block.model.ItemTransformVec3f"
  (^net.minecraft.client.renderer.block.model.ItemTransformVec3f [^ItemCameraTransforms this]
    (-> this .-firstperson_left)))

(defn firstperson-right
  "Instance Constant.

  type: net.minecraft.client.renderer.block.model.ItemTransformVec3f"
  (^net.minecraft.client.renderer.block.model.ItemTransformVec3f [^ItemCameraTransforms this]
    (-> this .-firstperson_right)))

(defn head
  "Instance Constant.

  type: net.minecraft.client.renderer.block.model.ItemTransformVec3f"
  (^net.minecraft.client.renderer.block.model.ItemTransformVec3f [^ItemCameraTransforms this]
    (-> this .-head)))

(defn gui
  "Instance Constant.

  type: net.minecraft.client.renderer.block.model.ItemTransformVec3f"
  (^net.minecraft.client.renderer.block.model.ItemTransformVec3f [^ItemCameraTransforms this]
    (-> this .-gui)))

(defn ground
  "Instance Constant.

  type: net.minecraft.client.renderer.block.model.ItemTransformVec3f"
  (^net.minecraft.client.renderer.block.model.ItemTransformVec3f [^ItemCameraTransforms this]
    (-> this .-ground)))

(defn fixed
  "Instance Constant.

  type: net.minecraft.client.renderer.block.model.ItemTransformVec3f"
  (^net.minecraft.client.renderer.block.model.ItemTransformVec3f [^ItemCameraTransforms this]
    (-> this .-fixed)))

(defn *apply-transform-side
  "vec - `net.minecraft.client.renderer.block.model.ItemTransformVec3f`
  left-hand - `boolean`"
  ([^net.minecraft.client.renderer.block.model.ItemTransformVec3f vec ^Boolean left-hand]
    (ItemCameraTransforms/applyTransformSide vec left-hand)))

(defn apply-transform
  "type - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`"
  ([^ItemCameraTransforms this ^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType type]
    (-> this (.applyTransform type))))

(defn get-transform
  "Deprecated.

  type - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`

  returns: `net.minecraft.client.renderer.block.model.ItemTransformVec3f`"
  (^net.minecraft.client.renderer.block.model.ItemTransformVec3f [^ItemCameraTransforms this ^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType type]
    (-> this (.getTransform type))))

(defn has-custom-transform?
  "type - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`

  returns: `boolean`"
  (^Boolean [^ItemCameraTransforms this ^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType type]
    (-> this (.hasCustomTransform type))))

