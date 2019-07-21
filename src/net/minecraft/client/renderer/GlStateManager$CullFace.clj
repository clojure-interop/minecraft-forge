(ns net.minecraft.client.renderer.GlStateManager$CullFace
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer GlStateManager$CullFace]))

(def FRONT
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$CullFace"
  GlStateManager$CullFace/FRONT)

(def BACK
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$CullFace"
  GlStateManager$CullFace/BACK)

(def FRONT_AND_BACK
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$CullFace"
  GlStateManager$CullFace/FRONT_AND_BACK)

(defn mode
  "Instance Constant.

  type: int"
  (^Integer [^GlStateManager$CullFace this]
    (-> this .-mode)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GlStateManager.CullFace c : GlStateManager.CullFace.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.GlStateManager$CullFace[]`"
  ([]
    (GlStateManager$CullFace/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.GlStateManager$CullFace`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.GlStateManager$CullFace [^java.lang.String name]
    (GlStateManager$CullFace/valueOf name)))

