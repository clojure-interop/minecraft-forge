(ns net.minecraft.world.storage.loot.functions.SetMetadata
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage.loot.functions SetMetadata]))

(defn ->set-metadata
  "Constructor.

  conditions-in - `net.minecraft.world.storage.loot.conditions.LootCondition[]`
  meta-range-in - `net.minecraft.world.storage.loot.RandomValueRange`"
  (^SetMetadata [conditions-in ^net.minecraft.world.storage.loot.RandomValueRange meta-range-in]
    (new SetMetadata conditions-in meta-range-in)))

(defn apply
  "stack - `net.minecraft.item.ItemStack`
  rand - `java.util.Random`
  context - `net.minecraft.world.storage.loot.LootContext`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^SetMetadata this ^net.minecraft.item.ItemStack stack ^java.util.Random rand ^net.minecraft.world.storage.loot.LootContext context]
    (-> this (.apply stack rand context))))

