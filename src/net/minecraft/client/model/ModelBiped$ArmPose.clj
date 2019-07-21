(ns net.minecraft.client.model.ModelBiped$ArmPose
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.model ModelBiped$ArmPose]))

(def EMPTY
  "Enum Constant.

  type: net.minecraft.client.model.ModelBiped$ArmPose"
  ModelBiped$ArmPose/EMPTY)

(def ITEM
  "Enum Constant.

  type: net.minecraft.client.model.ModelBiped$ArmPose"
  ModelBiped$ArmPose/ITEM)

(def BLOCK
  "Enum Constant.

  type: net.minecraft.client.model.ModelBiped$ArmPose"
  ModelBiped$ArmPose/BLOCK)

(def BOW_AND_ARROW
  "Enum Constant.

  type: net.minecraft.client.model.ModelBiped$ArmPose"
  ModelBiped$ArmPose/BOW_AND_ARROW)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ModelBiped.ArmPose c : ModelBiped.ArmPose.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.model.ModelBiped$ArmPose[]`"
  ([]
    (ModelBiped$ArmPose/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.model.ModelBiped$ArmPose`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.model.ModelBiped$ArmPose [^java.lang.String name]
    (ModelBiped$ArmPose/valueOf name)))

