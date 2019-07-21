(ns net.minecraftforge.common.util.Constants$NBT
  "NBT Tag type IDS, used when storing the nbt to disc, Should align with NBTBase.getId,
  table used in NBTBase.func_150283_g

  Main use is checking tag type in NBTTagCompound.func_150297_b(String, int)"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util Constants$NBT]))

(defn ->nbt
  "Constructor."
  (^Constants$NBT []
    (new Constants$NBT )))

(def *-tag-end
  "Static Constant.

  type: int"
  Constants$NBT/TAG_END)

(def *-tag-byte
  "Static Constant.

  type: int"
  Constants$NBT/TAG_BYTE)

(def *-tag-short
  "Static Constant.

  type: int"
  Constants$NBT/TAG_SHORT)

(def *-tag-int
  "Static Constant.

  type: int"
  Constants$NBT/TAG_INT)

(def *-tag-long
  "Static Constant.

  type: int"
  Constants$NBT/TAG_LONG)

(def *-tag-float
  "Static Constant.

  type: int"
  Constants$NBT/TAG_FLOAT)

(def *-tag-double
  "Static Constant.

  type: int"
  Constants$NBT/TAG_DOUBLE)

(def *-tag-byte-array
  "Static Constant.

  type: int"
  Constants$NBT/TAG_BYTE_ARRAY)

(def *-tag-string
  "Static Constant.

  type: int"
  Constants$NBT/TAG_STRING)

(def *-tag-list
  "Static Constant.

  type: int"
  Constants$NBT/TAG_LIST)

(def *-tag-compound
  "Static Constant.

  type: int"
  Constants$NBT/TAG_COMPOUND)

(def *-tag-int-array
  "Static Constant.

  type: int"
  Constants$NBT/TAG_INT_ARRAY)

(def *-tag-any-numeric
  "Static Constant.

  type: int"
  Constants$NBT/TAG_ANY_NUMERIC)

