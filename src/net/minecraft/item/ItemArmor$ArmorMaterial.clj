(ns net.minecraft.item.ItemArmor$ArmorMaterial
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemArmor$ArmorMaterial]))

(def LEATHER
  "Enum Constant.

  type: net.minecraft.item.ItemArmor$ArmorMaterial"
  ItemArmor$ArmorMaterial/LEATHER)

(def CHAIN
  "Enum Constant.

  type: net.minecraft.item.ItemArmor$ArmorMaterial"
  ItemArmor$ArmorMaterial/CHAIN)

(def IRON
  "Enum Constant.

  type: net.minecraft.item.ItemArmor$ArmorMaterial"
  ItemArmor$ArmorMaterial/IRON)

(def GOLD
  "Enum Constant.

  type: net.minecraft.item.ItemArmor$ArmorMaterial"
  ItemArmor$ArmorMaterial/GOLD)

(def DIAMOND
  "Enum Constant.

  type: net.minecraft.item.ItemArmor$ArmorMaterial"
  ItemArmor$ArmorMaterial/DIAMOND)

(defn repair-material
  "Instance Field.

  type: net.minecraft.item.ItemStack"
  (^net.minecraft.item.ItemStack [^ItemArmor$ArmorMaterial this]
    (-> this .-repairMaterial)))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ItemArmor.ArmorMaterial c : ItemArmor.ArmorMaterial.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.item.ItemArmor$ArmorMaterial[]`"
  ([]
    (ItemArmor$ArmorMaterial/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.item.ItemArmor$ArmorMaterial`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.item.ItemArmor$ArmorMaterial [^java.lang.String name]
    (ItemArmor$ArmorMaterial/valueOf name)))

(defn get-durability
  "armor-type - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `int`"
  (^Integer [^ItemArmor$ArmorMaterial this ^net.minecraft.inventory.EntityEquipmentSlot armor-type]
    (-> this (.getDurability armor-type))))

(defn get-repair-item
  "Deprecated.

  returns: `net.minecraft.item.Item`"
  (^net.minecraft.item.Item [^ItemArmor$ArmorMaterial this]
    (-> this (.getRepairItem))))

(defn get-repair-item-stack
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemArmor$ArmorMaterial this]
    (-> this (.getRepairItemStack))))

(defn get-toughness
  "returns: `float`"
  (^Float [^ItemArmor$ArmorMaterial this]
    (-> this (.getToughness))))

(defn get-damage-reduction-amount
  "armor-type - `net.minecraft.inventory.EntityEquipmentSlot`

  returns: `int`"
  (^Integer [^ItemArmor$ArmorMaterial this ^net.minecraft.inventory.EntityEquipmentSlot armor-type]
    (-> this (.getDamageReductionAmount armor-type))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ItemArmor$ArmorMaterial this]
    (-> this (.getName))))

(defn set-repair-item
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.ItemArmor$ArmorMaterial`"
  (^net.minecraft.item.ItemArmor$ArmorMaterial [^ItemArmor$ArmorMaterial this ^net.minecraft.item.ItemStack stack]
    (-> this (.setRepairItem stack))))

(defn get-sound-event
  "returns: `net.minecraft.util.SoundEvent`"
  (^net.minecraft.util.SoundEvent [^ItemArmor$ArmorMaterial this]
    (-> this (.getSoundEvent))))

(defn get-enchantability
  "returns: `int`"
  (^Integer [^ItemArmor$ArmorMaterial this]
    (-> this (.getEnchantability))))

