(ns net.minecraft.world.storage.loot.functions.EnchantWithLevels
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions EnchantWithLevels]))

(defn ->enchant-with-levels
  "Constructor.

  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  random-range - `net.minecraft.world.storage.loot.RandomValueRange`
  is-treasure-in - `boolean`"
  (^EnchantWithLevels [conditions-in ^net.minecraft.world.storage.loot.RandomValueRange random-range ^Boolean is-treasure-in]
    (new EnchantWithLevels conditions-in random-range is-treasure-in)))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EnchantWithLevels this ^net.minecraft.item.ItemStack stack ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.apply stack rand context))))

