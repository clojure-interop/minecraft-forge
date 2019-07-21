(ns net.minecraft.world.storage.loot.functions.LootingEnchantBonus
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions LootingEnchantBonus]))

(defn ->looting-enchant-bonus
  "Constructor.

  conditions - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  count-in - `net.minecraft.world.storage.loot.RandomValueRange`
  limit-in - `int`"
  (^LootingEnchantBonus [conditions ^net.minecraft.world.storage.loot.RandomValueRange count-in ^Integer limit-in]
    (new LootingEnchantBonus conditions count-in limit-in)))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^LootingEnchantBonus this ^net.minecraft.item.ItemStack stack ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.apply stack rand context))))

