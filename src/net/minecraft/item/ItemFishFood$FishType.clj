(ns net.minecraft.item.ItemFishFood$FishType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemFishFood$FishType]))

(def COD
  "Enum Constant.

  type: net.minecraft.item.ItemFishFood$FishType"
  ItemFishFood$FishType/COD)

(def SALMON
  "Enum Constant.

  type: net.minecraft.item.ItemFishFood$FishType"
  ItemFishFood$FishType/SALMON)

(def CLOWNFISH
  "Enum Constant.

  type: net.minecraft.item.ItemFishFood$FishType"
  ItemFishFood$FishType/CLOWNFISH)

(def PUFFERFISH
  "Enum Constant.

  type: net.minecraft.item.ItemFishFood$FishType"
  ItemFishFood$FishType/PUFFERFISH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ItemFishFood.FishType c : ItemFishFood.FishType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.item.ItemFishFood$FishType[]`"
  ([]
    (ItemFishFood$FishType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.item.ItemFishFood$FishType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.item.ItemFishFood$FishType [^java.lang.String name]
    (ItemFishFood$FishType/valueOf name)))

(defn *by-metadata
  "meta - `int`

  returns: `net.minecraft.item.ItemFishFood$FishType`"
  (^net.minecraft.item.ItemFishFood$FishType [^Integer meta]
    (ItemFishFood$FishType/byMetadata meta)))

(defn *by-item-stack
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemFishFood$FishType`"
  (^net.minecraft.item.ItemFishFood$FishType [^net.minecraft.item.ItemStack stack]
    (ItemFishFood$FishType/byItemStack stack)))

(defn get-metadata
  "returns: `int`"
  (^Integer [^ItemFishFood$FishType this]
    (-> this (.getMetadata))))

(defn get-unlocalized-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ItemFishFood$FishType this]
    (-> this (.getUnlocalizedName))))

(defn get-uncooked-heal-amount
  "returns: `int`"
  (^Integer [^ItemFishFood$FishType this]
    (-> this (.getUncookedHealAmount))))

(defn get-uncooked-saturation-modifier
  "returns: `float`"
  (^Float [^ItemFishFood$FishType this]
    (-> this (.getUncookedSaturationModifier))))

(defn get-cooked-heal-amount
  "returns: `int`"
  (^Integer [^ItemFishFood$FishType this]
    (-> this (.getCookedHealAmount))))

(defn get-cooked-saturation-modifier
  "returns: `float`"
  (^Float [^ItemFishFood$FishType this]
    (-> this (.getCookedSaturationModifier))))

(defn can-cook?
  "returns: `boolean`"
  (^Boolean [^ItemFishFood$FishType this]
    (-> this (.canCook))))

