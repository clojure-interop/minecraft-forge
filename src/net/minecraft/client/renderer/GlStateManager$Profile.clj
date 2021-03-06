(ns net.minecraft.client.renderer.GlStateManager$Profile
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer GlStateManager$Profile]))

(def DEFAULT
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$Profile"
  GlStateManager$Profile/DEFAULT)

(def PLAYER_SKIN
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$Profile"
  GlStateManager$Profile/PLAYER_SKIN)

(def TRANSPARENT_MODEL
  "Enum Constant.

  type: net.minecraft.client.renderer.GlStateManager$Profile"
  GlStateManager$Profile/TRANSPARENT_MODEL)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GlStateManager.Profile c : GlStateManager.Profile.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.renderer.GlStateManager$Profile[]`"
  ([]
    (GlStateManager$Profile/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.renderer.GlStateManager$Profile`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.renderer.GlStateManager$Profile [^java.lang.String name]
    (GlStateManager$Profile/valueOf name)))

(defn apply
  ""
  ([^GlStateManager$Profile this]
    (-> this (.apply))))

(defn clean
  ""
  ([^GlStateManager$Profile this]
    (-> this (.clean))))

