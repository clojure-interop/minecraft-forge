(ns net.minecraft.world.EnumDifficulty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world EnumDifficulty]))

(def PEACEFUL
  "Enum Constant.

  type: net.minecraft.world.EnumDifficulty"
  EnumDifficulty/PEACEFUL)

(def EASY
  "Enum Constant.

  type: net.minecraft.world.EnumDifficulty"
  EnumDifficulty/EASY)

(def NORMAL
  "Enum Constant.

  type: net.minecraft.world.EnumDifficulty"
  EnumDifficulty/NORMAL)

(def HARD
  "Enum Constant.

  type: net.minecraft.world.EnumDifficulty"
  EnumDifficulty/HARD)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EnumDifficulty c : EnumDifficulty.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.EnumDifficulty[]`"
  ([]
    (EnumDifficulty/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.EnumDifficulty`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.EnumDifficulty [^java.lang.String name]
    (EnumDifficulty/valueOf name)))

(defn *get-difficulty-enum
  "p-151523-0 - `int`

  returns: `net.minecraft.world.EnumDifficulty`"
  (^net.minecraft.world.EnumDifficulty [^Integer p-151523-0]
    (EnumDifficulty/getDifficultyEnum p-151523-0)))

(defn get-difficulty-id
  "returns: `int`"
  (^Integer [^EnumDifficulty this]
    (-> this (.getDifficultyId))))

(defn get-difficulty-resource-key
  "returns: `java.lang.String`"
  (^java.lang.String [^EnumDifficulty this]
    (-> this (.getDifficultyResourceKey))))

