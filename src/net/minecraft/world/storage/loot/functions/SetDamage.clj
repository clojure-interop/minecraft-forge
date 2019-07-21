(ns net.minecraft.world.storage.loot.functions.SetDamage
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions SetDamage]))

(defn ->set-damage
  "Constructor.

  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  damage-range-in - `net.minecraft.world.storage.loot.RandomValueRange`"
  (^SetDamage [conditions-in ^net.minecraft.world.storage.loot.RandomValueRange damage-range-in]
    (new SetDamage conditions-in damage-range-in)))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SetDamage this ^net.minecraft.item.ItemStack stack ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.apply stack rand context))))

