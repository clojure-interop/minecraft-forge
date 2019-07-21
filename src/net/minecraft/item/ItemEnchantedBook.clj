(ns net.minecraft.item.ItemEnchantedBook
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemEnchantedBook]))

(defn ->item-enchanted-book
  "Constructor."
  (^ItemEnchantedBook []
    (new ItemEnchantedBook )))

(defn has-effect?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemEnchantedBook this ^net.minecraft.item.ItemStack stack]
    (-> this (.hasEffect stack))))

(defn enchantable?
  "stack - `net.minecraft.item.ItemStack`

  returns: `boolean`"
  (^Boolean [^ItemEnchantedBook this ^net.minecraft.item.ItemStack stack]
    (-> this (.isEnchantable stack))))

(defn get-rarity
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumRarity`"
  (^net.minecraft.item.EnumRarity [^ItemEnchantedBook this ^net.minecraft.item.ItemStack stack]
    (-> this (.getRarity stack))))

(defn get-enchantments
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.nbt.NBTTagList`"
  (^net.minecraft.nbt.NBTTagList [^ItemEnchantedBook this ^net.minecraft.item.ItemStack stack]
    (-> this (.getEnchantments stack))))

(defn add-information
  "stack - `net.minecraft.item.ItemStack`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  tooltip - `java.util.List`
  advanced - `boolean`"
  ([^ItemEnchantedBook this ^net.minecraft.item.ItemStack stack ^net.minecraft.entity.player.EntityPlayer player-in ^java.util.List tooltip ^Boolean advanced]
    (-> this (.addInformation stack player-in tooltip advanced))))

(defn add-enchantment
  "stack - `net.minecraft.item.ItemStack`
  enchantment - `net.minecraft.enchantment.EnchantmentData`"
  ([^ItemEnchantedBook this ^net.minecraft.item.ItemStack stack ^net.minecraft.enchantment.EnchantmentData enchantment]
    (-> this (.addEnchantment stack enchantment))))

(defn get-enchanted-item-stack
  "data - `net.minecraft.enchantment.EnchantmentData`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemEnchantedBook this ^net.minecraft.enchantment.EnchantmentData data]
    (-> this (.getEnchantedItemStack data))))

(defn get-all
  "enchantment - `net.minecraft.enchantment.Enchantment`
  list - `java.util.List`"
  ([^ItemEnchantedBook this ^net.minecraft.enchantment.Enchantment enchantment ^java.util.List list]
    (-> this (.getAll enchantment list))))

