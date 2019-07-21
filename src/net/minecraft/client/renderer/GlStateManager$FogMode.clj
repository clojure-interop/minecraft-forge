(ns net.minecraft.client.renderer.GlStateManager$FogMode
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer GlStateManager$FogMode]))

(def LINEAR
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$FogMode"
  GlStateManager$FogMode/LINEAR)

(def EXP
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$FogMode"
  GlStateManager$FogMode/EXP)

(def EXP2
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$FogMode"
  GlStateManager$FogMode/EXP2)

(defn capability-id
  "Instance Constant.

  type: int"
  (^Integer [^GlStateManager$FogMode this]
    (-> this .-capabilityId)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GlStateManager.FogMode c : GlStateManager.FogMode.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.GlStateManager$FogMode[]`"
  ([]
    (GlStateManager$FogMode/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.GlStateManager$FogMode`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.GlStateManager$FogMode [^java.lang.String name]
    (GlStateManager$FogMode/valueOf name)))

