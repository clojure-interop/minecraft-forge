(ns net.minecraft.client.renderer.GlStateManager$SourceFactor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer GlStateManager$SourceFactor]))

(def CONSTANT_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/CONSTANT_ALPHA)

(def CONSTANT_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/CONSTANT_COLOR)

(def DST_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/DST_ALPHA)

(def DST_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/DST_COLOR)

(def ONE
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/ONE)

(def ONE_MINUS_CONSTANT_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/ONE_MINUS_CONSTANT_ALPHA)

(def ONE_MINUS_CONSTANT_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/ONE_MINUS_CONSTANT_COLOR)

(def ONE_MINUS_DST_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/ONE_MINUS_DST_ALPHA)

(def ONE_MINUS_DST_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/ONE_MINUS_DST_COLOR)

(def ONE_MINUS_SRC_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/ONE_MINUS_SRC_ALPHA)

(def ONE_MINUS_SRC_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/ONE_MINUS_SRC_COLOR)

(def SRC_ALPHA
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/SRC_ALPHA)

(def SRC_ALPHA_SATURATE
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/SRC_ALPHA_SATURATE)

(def SRC_COLOR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/SRC_COLOR)

(def ZERO
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$SourceFactor"
  GlStateManager$SourceFactor/ZERO)

(defn factor
  "Instance Constant.

  type: int"
  (^Integer [^GlStateManager$SourceFactor this]
    (-> this .-factor)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GlStateManager.SourceFactor c : GlStateManager.SourceFactor.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.GlStateManager$SourceFactor[]`"
  ([]
    (GlStateManager$SourceFactor/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.GlStateManager$SourceFactor`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.GlStateManager$SourceFactor [^java.lang.String name]
    (GlStateManager$SourceFactor/valueOf name)))

