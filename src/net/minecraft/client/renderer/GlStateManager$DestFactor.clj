(ns net.minecraft.client.renderer.GlStateManager$DestFactor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer GlStateManager$DestFactor]))

(def CONSTANT_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/CONSTANT_ALPHA)

(def CONSTANT_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/CONSTANT_COLOR)

(def DST_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/DST_ALPHA)

(def DST_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/DST_COLOR)

(def ONE
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/ONE)

(def ONE_MINUS_CONSTANT_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/ONE_MINUS_CONSTANT_ALPHA)

(def ONE_MINUS_CONSTANT_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/ONE_MINUS_CONSTANT_COLOR)

(def ONE_MINUS_DST_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/ONE_MINUS_DST_ALPHA)

(def ONE_MINUS_DST_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/ONE_MINUS_DST_COLOR)

(def ONE_MINUS_SRC_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/ONE_MINUS_SRC_ALPHA)

(def ONE_MINUS_SRC_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/ONE_MINUS_SRC_COLOR)

(def SRC_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/SRC_ALPHA)

(def SRC_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/SRC_COLOR)

(def ZERO
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$DestFactor"
  GlStateManager$DestFactor/ZERO)

(defn factor
  "Instance Constant.

  type: int"
  (^Integer [^GlStateManager$DestFactor this]
    (-> this .-factor)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GlStateManager.DestFactor c : GlStateManager.DestFactor.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.GlStateManager$DestFactor[]`"
  ([]
    (GlStateManager$DestFactor/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.GlStateManager$DestFactor`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.GlStateManager$DestFactor [^java.lang.String name]
    (GlStateManager$DestFactor/valueOf name)))

