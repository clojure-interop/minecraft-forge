(ns net.minecraft.item.Item$ToolMaterial
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item Item$ToolMaterial]))

(def WOOD
  "Enum Constant.

  type: net.minecraft.item.Item$ToolMaterial"
  Item$ToolMaterial/WOOD)

(def STONE
  "Enum Constant.

  type: net.minecraft.item.Item$ToolMaterial"
  Item$ToolMaterial/STONE)

(def IRON
  "Enum Constant.

  type: net.minecraft.item.Item$ToolMaterial"
  Item$ToolMaterial/IRON)

(def DIAMOND
  "Enum Constant.

  type: net.minecraft.item.Item$ToolMaterial"
  Item$ToolMaterial/DIAMOND)

(def GOLD
  "Enum Constant.

  type: net.minecraft.item.Item$ToolMaterial"
  Item$ToolMaterial/GOLD)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Item.ToolMaterial c : Item.ToolMaterial.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.item.Item$ToolMaterial[]`"
  ([]
    (Item$ToolMaterial/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.item.Item$ToolMaterial`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.item.Item$ToolMaterial [^java.lang.String name]
    (Item$ToolMaterial/valueOf name)))

(defn get-max-uses
  "returns: `int`"
  (^Integer [^Item$ToolMaterial this]
    (-> this (.getMaxUses))))

(defn get-efficiency-on-proper-material
  "returns: `float`"
  (^Float [^Item$ToolMaterial this]
    (-> this (.getEfficiencyOnProperMaterial))))

(defn get-damage-vs-entity
  "returns: `float`"
  (^Float [^Item$ToolMaterial this]
    (-> this (.getDamageVsEntity))))

(defn get-harvest-level
  "returns: `int`"
  (^Integer [^Item$ToolMaterial this]
    (-> this (.getHarvestLevel))))

(defn get-enchantability
  "returns: `int`"
  (^Integer [^Item$ToolMaterial this]
    (-> this (.getEnchantability))))

(defn get-repair-item
  "Deprecated.

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^Item$ToolMaterial this]
    (-> this (.getRepairItem))))

(defn set-repair-item
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.Item$ToolMaterial`"
  (^net.minecraft.item.Item$ToolMaterial [^Item$ToolMaterial this ^net.minecraft.item.ItemStack stack]
    (-> this (.setRepairItem stack))))

(defn get-repair-item-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Item$ToolMaterial this]
    (-> this (.getRepairItemStack))))

