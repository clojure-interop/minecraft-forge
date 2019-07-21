(ns net.minecraft.client.audio.Sound$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.audio Sound$Type]))

(def FILE
  "Enum Constant.

  type: net.minecraft.client.audio.Sound$Type"
  Sound$Type/FILE)

(def SOUND_EVENT
  "Enum Constant.

  type: net.minecraft.client.audio.Sound$Type"
  Sound$Type/SOUND_EVENT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Sound.Type c : Sound.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.audio.Sound$Type[]`"
  ([]
    (Sound$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.audio.Sound$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.audio.Sound$Type [^java.lang.String name]
    (Sound$Type/valueOf name)))

(defn *get-by-name
  "name-in - `java.lang.String`

  returns: `net.minecraft.client.audio.Sound$Type`"
  (^net.minecraft.client.audio.Sound$Type [^java.lang.String name-in]
    (Sound$Type/getByName name-in)))

