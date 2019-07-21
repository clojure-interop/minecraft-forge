(ns net.minecraftforge.event.enchanting.EnchantmentLevelSetEvent
  "Fired when the enchantment level is set for each of the three potential enchantments in the enchanting table.
  The level is set to the vanilla value and can be modified by this event handler.

  The enchantRow is used to determine which enchantment level is being set, 1, 2, or 3. The power is a number
  from 0-15 and indicates how many bookshelves surround the enchanting table. The itemStack representing the item being
  enchanted is also available."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.enchanting EnchantmentLevelSetEvent]))

(defn ->enchantment-level-set-event
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  enchant-row - `int`
  power - `int`
  item-stack - `net.minecraft.item.ItemStack`
  level - `int`"
  (^EnchantmentLevelSetEvent [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^Integer enchant-row ^Integer power ^net.minecraft.item.ItemStack item-stack ^Integer level]
    (new EnchantmentLevelSetEvent world pos enchant-row power item-stack level)))

(defn get-world
  "Get the world object

  returns: the world object - `net.minecraft.world.World`"
  (^net.minecraft.world.World [^EnchantmentLevelSetEvent this]
    (-> this (.getWorld))))

(defn get-pos
  "Get the pos of the enchantment table

  returns: the pos of the enchantment table - `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^EnchantmentLevelSetEvent this]
    (-> this (.getPos))))

(defn get-enchant-row
  "Get the row for which the enchantment level is being set

  returns: the row for which the enchantment level is being set - `int`"
  (^Integer [^EnchantmentLevelSetEvent this]
    (-> this (.getEnchantRow))))

(defn get-power
  "Get the power (# of bookshelves) for the enchanting table

  returns: the power (# of bookshelves) for the enchanting table - `int`"
  (^Integer [^EnchantmentLevelSetEvent this]
    (-> this (.getPower))))

(defn get-item
  "Get the item being enchanted

  returns: the item being enchanted - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EnchantmentLevelSetEvent this]
    (-> this (.getItem))))

(defn get-original-level
  "Get the original level of the enchantment for this row (0-30)

  returns: the original level of the enchantment for this row (0-30) - `int`"
  (^Integer [^EnchantmentLevelSetEvent this]
    (-> this (.getOriginalLevel))))

(defn get-level
  "Get the level of the enchantment for this row (0-30)

  returns: the level of the enchantment for this row (0-30) - `int`"
  (^Integer [^EnchantmentLevelSetEvent this]
    (-> this (.getLevel))))

(defn set-level
  "Set the new level of the enchantment (0-30)

  level - the new level of the enchantment (0-30) - `int`"
  ([^EnchantmentLevelSetEvent this ^Integer level]
    (-> this (.setLevel level))))

