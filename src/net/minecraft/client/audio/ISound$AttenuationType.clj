(ns net.minecraft.client.audio.ISound$AttenuationType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio ISound$AttenuationType]))

(def NONE
  "Enum Constant.

  type: net.minecraft.client.audio.ISound$AttenuationType"
  ISound$AttenuationType/NONE)

(def LINEAR
  "Enum Constant.

  type: net.minecraft.client.audio.ISound$AttenuationType"
  ISound$AttenuationType/LINEAR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ISound.AttenuationType c : ISound.AttenuationType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.audio.ISound$AttenuationType[]`"
  ([]
    (ISound$AttenuationType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.audio.ISound$AttenuationType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.audio.ISound$AttenuationType [^java.lang.String name]
    (ISound$AttenuationType/valueOf name)))

(defn get-type-int
  "returns: `int`"
  (^Integer [^ISound$AttenuationType this]
    (-> this (.getTypeInt))))

