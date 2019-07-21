(ns net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.block.model ItemCameraTransforms$TransformType]))

(def NONE
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType"
  ItemCameraTransforms$TransformType/NONE)

(def THIRD_PERSON_LEFT_HAND
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType"
  ItemCameraTransforms$TransformType/THIRD_PERSON_LEFT_HAND)

(def THIRD_PERSON_RIGHT_HAND
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType"
  ItemCameraTransforms$TransformType/THIRD_PERSON_RIGHT_HAND)

(def FIRST_PERSON_LEFT_HAND
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType"
  ItemCameraTransforms$TransformType/FIRST_PERSON_LEFT_HAND)

(def FIRST_PERSON_RIGHT_HAND
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType"
  ItemCameraTransforms$TransformType/FIRST_PERSON_RIGHT_HAND)

(def HEAD
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType"
  ItemCameraTransforms$TransformType/HEAD)

(def GUI
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType"
  ItemCameraTransforms$TransformType/GUI)

(def GROUND
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType"
  ItemCameraTransforms$TransformType/GROUND)

(def FIXED
  "Enum Constant.

  type: net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType"
  ItemCameraTransforms$TransformType/FIXED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ItemCameraTransforms.TransformType c : ItemCameraTransforms.TransformType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType[]`"
  ([]
    (ItemCameraTransforms$TransformType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType [^java.lang.String name]
    (ItemCameraTransforms$TransformType/valueOf name)))

