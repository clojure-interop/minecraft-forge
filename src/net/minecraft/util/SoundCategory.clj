(ns net.minecraft.util.SoundCategory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util SoundCategory]))

(def MASTER
  "Enum Constant.

  type: net.minecraft.util.SoundCategory"
  SoundCategory/MASTER)

(def MUSIC
  "Enum Constant.

  type: net.minecraft.util.SoundCategory"
  SoundCategory/MUSIC)

(def RECORDS
  "Enum Constant.

  type: net.minecraft.util.SoundCategory"
  SoundCategory/RECORDS)

(def WEATHER
  "Enum Constant.

  type: net.minecraft.util.SoundCategory"
  SoundCategory/WEATHER)

(def BLOCKS
  "Enum Constant.

  type: net.minecraft.util.SoundCategory"
  SoundCategory/BLOCKS)

(def HOSTILE
  "Enum Constant.

  type: net.minecraft.util.SoundCategory"
  SoundCategory/HOSTILE)

(def NEUTRAL
  "Enum Constant.

  type: net.minecraft.util.SoundCategory"
  SoundCategory/NEUTRAL)

(def PLAYERS
  "Enum Constant.

  type: net.minecraft.util.SoundCategory"
  SoundCategory/PLAYERS)

(def AMBIENT
  "Enum Constant.

  type: net.minecraft.util.SoundCategory"
  SoundCategory/AMBIENT)

(def VOICE
  "Enum Constant.

  type: net.minecraft.util.SoundCategory"
  SoundCategory/VOICE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SoundCategory c : SoundCategory.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.util.SoundCategory[]`"
  ([]
    (SoundCategory/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.util.SoundCategory`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.util.SoundCategory [^java.lang.String name]
    (SoundCategory/valueOf name)))

(defn *get-by-name
  "category-name - `java.lang.String`

  returns: `net.minecraft.util.SoundCategory`"
  (^net.minecraft.util.SoundCategory [^java.lang.String category-name]
    (SoundCategory/getByName category-name)))

(defn *get-sound-category-names
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set []
    (SoundCategory/getSoundCategoryNames )))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^SoundCategory this]
    (-> this (.getName))))

