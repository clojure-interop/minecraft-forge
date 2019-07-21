(ns net.minecraft.client.renderer.GlStateManager$TexGen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer GlStateManager$TexGen]))

(def S
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$TexGen"
  GlStateManager$TexGen/S)

(def T
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$TexGen"
  GlStateManager$TexGen/T)

(def R
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$TexGen"
  GlStateManager$TexGen/R)

(def Q
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$TexGen"
  GlStateManager$TexGen/Q)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GlStateManager.TexGen c : GlStateManager.TexGen.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.GlStateManager$TexGen[]`"
  ([]
    (GlStateManager$TexGen/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.GlStateManager$TexGen`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.GlStateManager$TexGen [^java.lang.String name]
    (GlStateManager$TexGen/valueOf name)))

