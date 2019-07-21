(ns net.minecraft.entity.item.EntityPainting$EnumArt
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityPainting$EnumArt]))

(def KEBAB
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/KEBAB)

(def AZTEC
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/AZTEC)

(def ALBAN
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/ALBAN)

(def AZTEC_2
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/AZTEC_2)

(def BOMB
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/BOMB)

(def PLANT
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/PLANT)

(def WASTELAND
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/WASTELAND)

(def POOL
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/POOL)

(def COURBET
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/COURBET)

(def SEA
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/SEA)

(def SUNSET
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/SUNSET)

(def CREEBET
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/CREEBET)

(def WANDERER
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/WANDERER)

(def GRAHAM
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/GRAHAM)

(def MATCH
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/MATCH)

(def BUST
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/BUST)

(def STAGE
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/STAGE)

(def VOID
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/VOID)

(def SKULL_AND_ROSES
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/SKULL_AND_ROSES)

(def WITHER
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/WITHER)

(def FIGHTERS
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/FIGHTERS)

(def POINTER
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/POINTER)

(def PIGSCENE
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/PIGSCENE)

(def BURNING_SKULL
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/BURNING_SKULL)

(def SKELETON
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/SKELETON)

(def DONKEY_KONG
  "Enum Constant.

  type: net.minecraft.entity.item.EntityPainting$EnumArt"
  EntityPainting$EnumArt/DONKEY_KONG)

(def *-max-name-length
  "Static Constant.

  type: int"
  EntityPainting$EnumArt/MAX_NAME_LENGTH)

(defn title
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^EntityPainting$EnumArt this]
    (-> this .-title)))

(defn size-x
  "Instance Constant.

  type: int"
  (^Integer [^EntityPainting$EnumArt this]
    (-> this .-sizeX)))

(defn size-y
  "Instance Constant.

  type: int"
  (^Integer [^EntityPainting$EnumArt this]
    (-> this .-sizeY)))

(defn offset-x
  "Instance Constant.

  type: int"
  (^Integer [^EntityPainting$EnumArt this]
    (-> this .-offsetX)))

(defn offset-y
  "Instance Constant.

  type: int"
  (^Integer [^EntityPainting$EnumArt this]
    (-> this .-offsetY)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EntityPainting.EnumArt c : EntityPainting.EnumArt.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.entity.item.EntityPainting$EnumArt[]`"
  ([]
    (EntityPainting$EnumArt/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.entity.item.EntityPainting$EnumArt`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.entity.item.EntityPainting$EnumArt [^java.lang.String name]
    (EntityPainting$EnumArt/valueOf name)))

