(ns net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation ModelBlockAnimation$Parameter$Type]))

(def UNIFORM
  "Enum Constant.

  type: net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Type"
  ModelBlockAnimation$Parameter$Type/UNIFORM)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ModelBlockAnimation.Parameter.Type c : ModelBlockAnimation.Parameter.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Type[]`"
  ([]
    (ModelBlockAnimation$Parameter$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.model.animation.ModelBlockAnimation$Parameter$Type [^java.lang.String name]
    (ModelBlockAnimation$Parameter$Type/valueOf name)))

